scoreDictionary = {"A+" : 9, "A" : 8, "A-" : 7, "B+" : 6, "B" : 5, "B-" : 4, "C+" : 3, "C" : 2, "C-" : 1, "D+" : 0, "D" : 0, "D-" : 0} # stores GPA values

def collectionOfGrades():
	running = True
	classes = 0
	overallGPA = 0
	print("When you're finished, enter any non-grade value to indicate you're done." + "\n")
	
	while running:
		grade = input("Please enter your grade in an upper case alphabetical format (e.g. A+)")
		try:
			grade = grade.upper()
			overallGPA += scoreDictionary[grade]
			classes += 1

		except KeyError: # catches any value that isn't in the above dictionary and gives option to exit
			out = input("You've entered an invalid grade. Have you finished entering grades? Please type Y or N")
			out = out.upper()
			if out == "Y": #will exit loop only if person says yes.
			  running = False
			else:
			  continue
	calculateGrade(overallGPA, classes)

def calculateGrade(GPA, classcount):
	finalScore = GPA / classcount
	printGrade(finalScore)

def printGrade(finalScore):
	print("Your GPA is " + str(finalScore) + ".")

collectionOfGrades()
