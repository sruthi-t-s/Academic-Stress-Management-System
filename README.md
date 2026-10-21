Academic Stress Management System

Project Description

Academic Stress Management System is a Java-based desktop application designed to help students assess their academic stress levels and manage their study tasks effectively.

The system provides student registration, secure login, stress assessment, stress management recommendations, and study task planning.

Technologies Used

- Programming Language: Java (JDK 21)
- Frontend: Java Swing
- Backend: Java
- Database: MySQL
- Database Connectivity: JDBC (MySQL Connector/J)

Main Features

1. Student Registration: Allows new students to create accounts.
2. Student Login: Authenticates registered students using hashed passwords.
3. Stress Assessment: Evaluates academic stress through a questionnaire.
4. Stress Level Calculation: Classifies assessment results into Low, Moderate, or High stress levels.
5. Stress Management Recommendations: Provides tips based on the student's stress level.
6. Study Task Management: Allows students to organize study tasks with deadlines and priorities.

Database Structure

The application uses the "academic_stress_db" database with three tables:

- "students" — Stores student account details.
- "stress_results" — Stores stress assessment results.
- "study_tasks" — Stores study task details.

The database structure is available in "academic_stress_db.sql".

How to Run the Project

Requirements

- Java JDK 21
- MySQL Server
- MySQL Connector/J
- Windows operating system for the provided batch launcher

Setup Instructions

1. Download or clone this repository.

2. Open the project folder in VS Code.

3. Create the database and tables by running "academic_stress_db.sql" in MySQL.

4. Create a "lib" folder inside the project directory and place the MySQL Connector/J JAR file inside it.

5. Open PowerShell in the project directory.

6. Compile the Java files:
   
   "javac -cp ".;lib/*" *.java"

7. Run the application:
   
   "java -cp ".;lib/*" Main"
   
   Before running, set the "MYSQL_PASSWORD" environment variable in the same terminal using your local MySQL password. Alternatively, after compiling, use "StartProject.bat" if available.

Note: The current database configuration uses the MySQL user "root" on "localhost:3306". The password is not included in the repository.

Project Purpose

The main objective of this project is to support students in understanding their academic stress and improving their study organization through a simple desktop application.

Future Enhancements

- Forgot Password functionality
- Additional stress management features
- Improved study planning

Disclaimer

This application provides a basic academic stress self-assessment and is not intended to provide medical diagnosis or treatment.
