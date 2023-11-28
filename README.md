# ZPO23
## Zaawansowane programowanie obiektowe - laboratorium
### Lab 0, 03.10.23: Zasady zaliczenia i przypomnienie informacji z ubiegłego semestru
### Lab 1, 10.10.23: Debugowanie i systemy kontroli wersji
    Termin składania rozwiązań: 17.10.23
### Lab 2, 17.10.23: Dziedziczenie klas
    Termin składania rozwiązań: 24.10.23
### Lab 3, 24.10.23: Interfejsy, klasy abstrakcyjne
    Termin składania rozwiązań: 07.11.23
### Lab 4, 07.11.23: Wyjątki, testy jednostkowe (JUnit)
    Termin składania rozwiązań: 14.11.23
### Lab 5, 14.11.23: Typy kolekcyjne
    Termin składania rozwiązań: 21.11.23
### Lab 6, 21.11.23: Enum, strumienie, wyrażenia lambda
    Termin składania rozwiązań: 28.11.23
### Lab 7, 28.11.23: Przetwarzanie danych, JSON (JavaScript Object Notation)
    Termin składania rozwiązań: 12.12.23
### Komendy git
```
git --version  // Checks installed git verion

// Configure the author name and email address to be used with your commits:
git config --global user.name "username"
git config --global user.email "user@email.com"

mkdir myproject  // Creates new directory "myproject"
cd myproject

git init  // Initializes empty Git repository in /Users/user/myproject/.git/

git status  // Checks the status of the Git

git remote add origin <remote repo url>  // Link with remote repo

git add plik.txt  // Adds "plik.txt" to a Staging Environment

// ?? - Untracked files
// A - Files added to stage
// M - Modified files
// D - Deleted files

// To add all files in the current directory to a Staging Environment:
git add --all  // Or: git add -A

// Adding commits keep track of our progress and changes as we work.
// Git considers each commit change point or "save point".
// It is a point in the project you can go back to if you find a bug, or want to make a change.
// When we commit, we should always include a message.
git commit -m "First release"

// It is possible to commit changes directly, skipping the staging environment:
git commit -a -m "Updated index.html with a new line"

git push -u origin master  // Send changes to the master branch of your remote repository

git clone <remote repo url>  // Creates a local copy of a remote repo
git pull  // Fetch and merge changes on the remote server to your working directory

// To view the history of commits for a repository
git log

// Branches
git branch  // List all the branches in your repo, and also tell you what branch you're currently in
git branch -d <branchname>  // Delete the branch
git push origin <branchname>  // Push the branch to your remote repository
git push --all origin  // Push all branches to your remote repository
git push origin :<branchname>  // Delete a branch on your remote repository

// If you are having trouble remembering commands or options for commands, you can use Git help
git <command> -help
git help --all
```
