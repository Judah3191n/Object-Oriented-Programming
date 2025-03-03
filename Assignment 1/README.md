Assignment 1: Student Management System in Java
Weight: 10%
Submission Format:


Requirements
1. Class Design and Object-Oriented Principles
	Create a base class Person with attributes:
		String name
		int age
		String address
	Use encapsulation to ensure data is accessed and modified through getter and setter methods.
	Create a subclass Student that extends Person with additional attributes:
		String studentId (auto-generated using a static variable)
		String major
		double GPA

2. Constructors
	Implement parameterized constructors for Person and Student to initialize attributes during object creation.
	Provide a default constructor for the Student class.

3. Methods
	mplement the following methods:
		isplayDetails() in both Person and Student to display object details.
		 static method generateStudentId() to auto-increment and assign a unique ID to each student.
		verride displayDetails() in the Student class to include student-specific details.

4. Inheritance
	Reuse code from the Person class in the Student class using inheritance.

5. Real-World Scenario
	Simulate a Student Management System where:

	list of students is stored in an ArrayList.
	The user interacts with a menu system:
		1. Add a new student.
		2. Display details of all students.
		3. Search for a student by ID.
		4. Exit the program.

6. GitHub Submission
Upload your full project (all .java files and a README.md) to a public or private GitHub repository.
Include in the README:
	Instructions on how to run the program.
	A brief description of the features you implemented.
Share the GitHub repository link as part of your submission.

7. Video Presentation
	Record a short video (3–5 minutes) that:
		Explains your idea and how it solves the given problem.
		Demonstrates key parts of your code.
		Shows the program in action (e.g., adding a student, displaying details, and searching by ID).
