# Roman Numerals Converter

This is a Roman Numerals Converter console application using the Java programming language.

## Goal
Convert the Roman Numerals for numbers 1 to 10. The user is prompted to enter a Roman numeral and the application will convert it to the equivalent Arabic numeral.

For a full Roman numerals converter, please have a look to the [TDD Roman Numerals kata](https://github.com/abcpaem/tdd-roman-numerals-kata).

## User Story

As a user <br/>
I would like to use the Roman Numerals Converter console application<br/>
So that I can convert my roman numerals into numbers

### Acceptance Criteria

### Scenario 1:
**GIVEN** The user starts the console application and is prompted with the message Please enter a Roman Numeral<br/>
**WHEN** The user enters the roman numeral I<br/>
**THEN** The application will print the conversion to the console. In this case, the Roman Numeral I is converted to the number 1

### Scenario 2:
**GIVEN** The user starts the console application and is prompted with the message: Please enter a Roman Numeral<br/>
**WHEN** The user enters the roman numeral II<br/>
**THEN** The application will print the conversion to the console. In this case, the Roman Numeral II is converted to the number 2

---
## How to run the application
1) cd to the project root folder in the command line
2) `mvn compile`
3) `mvn exec:java -Dexec.mainClass=clan.techreturners.romannumerals.converter.RomanNumeralsConverter`

To run tests use:
- ``mvn test``

## Technology
This project was built using:
- Java 17.0.2
- JUnit 5.8.2
- Maven 3.8.5
- IntelliJ 2021.3.2 (Community Edition).
