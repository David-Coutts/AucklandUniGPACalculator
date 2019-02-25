# GPA Calculator for Auckland University Computer Science Students
  
  A program used to calculate a student's GPA based on grades from their classes so far.

## Explanation
* GPACalc.py is a functioning calculator which will print GPA to command line, however the entire program is command-line only. GPACalc.py also relies on the end user to advise when they've finished adding grades.
* For this reason, I've chosen to implement a GUI in Java using Swing/AWT to make it slightly more user friendly.  
* GPACalculator.java is a work in progress - I intend to get a minimum viable product going, then I'll work on tidying up the code by removing duplication, abstraction, and writing better documentation and variable names.

## Features added recently

* A functioning GUI
* Add, reset and undo buttons with full functionality

## Features I'll be implementing
* Data sanitisation (if the user doesn't enter a grade or a number, it'll return an error and ask them to try again)
* The ability to add either a grade (A+, A-, B, C, etc) or a number (9, 8, 5, 3, 1, 0, etc)
* The ability to change what grades are worth (for example, A+ is worth 9 using Auckland Uni's grade point average system, but might be worth a 4 at an American college). To do this, I'll implement the grades using a hashmap and offer the ability to update the grades using the GUI.
