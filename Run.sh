#!/bin/sh
git="../MA_Git/bin/git.exe"
currentBranch=$($git branch --show-current)
echo ">$currentBranch<"
newRandomBranchName=$(cat /dev/urandom | tr -dc 'a-zA-Z0-9' | fold -w 32 | head -n 1)
newRandomBranchName="Student_${newRandomBranchName}"
if [ $currentBranch == "main" ]; then
	echo $($git pull)
	echo $($git checkout -b $newRandomBranchName)
	echo $($git push --set-upstream origin $newRandomBranchName)

	newFilePath="src/main/kotlin/test.kt"
	echo "fun main() { println(\"Hello World\") }" >> $newFilePath
	echo $($git add $newFilePath)
	echo $($git status)
	echo $($git commit -m "Test file added")
	echo $($git status)
	echo $($git push)
	echo $($git status)

	# Revert
	#read -n 1 -p "Wait for input before branch get deleted..."
	#$(rm $newFilePath)
	#echo $($git checkout main)
	#echo $($git branch -d $newRandomBranchName)
	#echo $($git push origin --delete $newRandomBranchName)
	#read -n 1 -p "Cleaned up, waiting for key input to close window..."
fi
