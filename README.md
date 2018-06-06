# Lab-A12
This repository contains nine programs: GCF and LCM, FunLoops, Multiplication Table, Pyramid, Loan Table, Grades, GameLand, PigLatin, Chocolate

GCF and LCM:
  - Find the greatest common factor of two integers using Euclid's algorithm. The algorithm is based on the observation that if we         subtract the smaller number from the larger number, and replace the larger number with the result, the GCF of the two numbers remains the same. In other words, GCF(a, b) = GCF(a-b, b) assuming a >b.
  - Least Common Multiple: Write a method LCM(int a, int b) that determines the Least Common Multiple of two integers. You may use the GCF method to help you find the LCM.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
FunLoops:
Some perfect squares have unique mathematical properties. For example, 36 is:
a perfect square, 62
the sum of the integers 1 to 8 (1+2+3+4+5+6+7+8 = 36)
a "magic square" (any number that is both a perfect square AND equal to the sum of consecutive integers beginning with 1)
The next magic square is 1225:
352 = 1225
1225 = sum of 1 to 49
Write a method that takes an integer argument n and prints the first n magic squares.
The output should be in the following format:

The first 3 magic squares are: 
1 36 1225
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Multiplication Table:
Write a method that takes in, through its parameters, the number of rows and columns to print a multiplication table. (see lab12.2 in text for example)
Use printf with "%2d" format string to print the row numbers (left column of the table)
Use printf with "%7d" format string to print the numbers in the table
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Pyramid:
Write a method to print the following pyramid pattern of stars. The number of lines to printed will be passed in to the method. If the number of lines = 5, then:
                            *
                           ***
                          *****
                         *******
                        *********
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Loan Table:
Write a program that prompts the user for the following information:
The amount of the loan
The length of the loan in years
A low interest rate in %
A high interest rate in %
Print out the monthly payment for the different interest rates from low to high, incremented by 0.25%.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Grades:
Suppose that a high school district decided on the following academic standards for a student's eligibility to participate in extracurricular activities, such as athletics, music, or drama, etc.:

No F's..
Minimum 2.0 grade point average (gpa)
Note: A = 4.0, B = 3.0, C = 2.0, D = 1.0, F = 0
Enrollment in a minimum of four academic classes

Write a program that accepts the letter grades for a student, calculates the student's gpa, and prints it out, along with one of the following five messages:

Eligible
Ineligible, taking less than 4 classes
Ineligible, gpa below 2.0
Ineligible, gpa above 2.0 but has F grade (note: gpa >= 2.0)
Ineligible, gpa below 2.0 and has F grade

Your program must use an appropriate sequence of nested if-else statements to print out the appropriate message.
The message "Ineligible, taking less than 4 classes" has priority over the other 3 ineligible cases.
The class will not ask the user for how many grades are in a student's report card. The program will continue to read grades until a non-grade character is input. At this point, some type of loop will cease and the program prints the GPA value and the eligibility message. Do not use nextLine to read the entire line of input.
Example of run output: GPA = 3.75 Eligible
You do not have to print out any of the individual grades.
Your program should allow input of grades in either upper or lower case.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Gameland:
This exercise is based on the American Computer Science League - Intermediate Division, Contest #1, 1989-90.

The board game GameLand is a very simple one that you will simulate on the computer.
Two players begin the game on a square labeled as "START." The goal of the game is to be the first player to reach the square labeled "FINISH." There are 100 squares between START and FINISH.
The two players take turns rolling two six-sided dice. A roll of 2 or 12 means that the player loses that turn and cannot move. Getting a roll of 7 means that the player moves backwards 7 spaces (but not beyond START). On all other rolls, the players must move forward an amount equal to the number of the roll.
If one player lands on a square occupied by the other player, the player originally on that square gets bumped back to the START square.
The game ends when one player wins by landing on or beyond the FINISH square.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
PigLatin:
You will create a class that will perform several different functions on Strings that are sent to it. All of the methods you create will be static, and the class should work in a similar manner to the Math class. Only the two methods listed below should be public. Any methods that you write to help these methods should be private because they are only used internally within the class.
Create a method that receives a String, converts the String to Pig Latin, and returns the new Pig Latinated word. There may be multiple words in your String, so you will need to have a iterative function that breaks down the String into single words and then reconstructs the sentence in Pig Latin. Here's how to translate the English word englishWord into the Pig Latin wordpigLatinWord:
If there are no vowels in englishWord, then pigLatinWord is just englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o', and 'u', and their uppercase counterparts. 'y' is not considered to be a vowel for the purposes of this assignment, i.e. my becomes myay, why becomes whyay, etc.)
Else, if englishWord begins with a vowel, then pigLatinWord is just englishWord + "yay".
Otherwise (if englishWord has a vowel in it and yet doesn't start with a vowel), then pigLatinWord is end + start + "ay", where end and start are defined as follows:
Let start be all of englishWord up to (but not including) its first vowel.
Let end be all of englishWord from its first vowel on.
But, if englishWord is capitalized, then capitalize end and "uncapitalize" start.


"Astahay alay istavay, abybay." - The Piglatinator

Create a method that receives a String and returns the String converted into shorthand. The simplified shorthand form of a string is defined as follows:
replace these four words: "and" with "&", "to" with "2", "you" with "U", and "for" with "4".
remove all vowels ('a', 'e', 'i', 'o', 'u', whether lowercase or uppercase)
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Chocolate:
We want to make a row of bricks that is goal inches long. We have small bricks (1 inch each) and big bricks (5 inches each). You are to write two methods (note: none of the methods need a loop)

canMakeBricks(small, big, goal) - returns true if we have enough small and big bricks to reach the goal length, false otherwise. For example, 
canMakeBricks(3, 1, 8) --> true 
canMakeBricks(3, 1, 9) --> false 
canMakeBricks(3, 2, 10) --> true 

numberOfSmallBricksNeeded(small, big, goal) - calculates the number of small bricks needed to reach the goal, assuming we always use big bricks before small bricks. Returs -1 if it can't be done. For example, 
numberOfSmallBricksNeeded(4, 1, 9) --> 4
numberOfSmallBricksNeeded(4, 1, 10) --> -1
numberOfSmallBricksNeeded(4, 1, 7) --> 2
