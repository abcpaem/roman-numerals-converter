# Roman Numerals Converter

This is a Roman Numerals Converter Console Application using the Java programming language in a Maven project (using IntelliJ).

### Goal & features
Convert the Roman Numerals for numbers 1 to 10. The user is prompted to enter a roman numeral and the application will convert it to the equivalent Arabic numeral.

**IMPORTANT NOTE:** For a full Roman numerals <-> Arabic numbers converter please check the [TDD Roman Numerals kata](https://github.com/abcpaem/tdd-roman-numerals-kata). 

### Technology
This project was built using Java version 17.0.2, JUnit 5.8.2 for unit testing and the Community Edition for the IntelliJ 2021.3.2 development environment.

### How to run the application
1) cd to the project root folder in the command line
2) mvn compile
3) mvn exec:java -Dexec.mainClass=clan.techreturners.romannumerals.converter.RomanNumeralsConverter

To run tests:
1) mvn test

### What to improve
- Update the app to accept any roman numeral
- Add more tests for non-valid roman numerals
- Add a package name to avoid any future name conflict 

---------------------------------------------------------------------------------------------------------

### User Story

As a user <br>
I would like to use the Roman Numerals Converter Console Application
So that I can convert my roman numerals into numbers

✅   User Acceptance Criteria

### Scenario 1:<br><br>

#### GIVEN
The user starts the console application and is prompted with the message Please enter a Roman Numeral
#### WHEN
The user enters the roman numeral I
#### THEN
The application will print the conversion to the console, in this case, You converted the Roman Numeral I to the number 1

### Scenario 2:<br><br>
#### GIVEN
The user starts the console application and is prompted with the message Please enter a Roman Numeral

#### WHEN
The user enters the roman numeral II

#### THEN
The application will print the conversion to the console, in this case, You converted the Roman Numeral II to the number 2

