CREATE DATABASE IF NOT EXISTS academic_stress_db;
USE academic_stress_db;

CREATE TABLE students (
    student_id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password_hash VARCHAR(225) NOT NULL,
    PRIMARY KEY (student_id),
    UNIQUE (username)
);

CREATE TABLE stress_results (
    result_id INT NOT NULL AUTO_INCREMENT,
    student_id INT DEFAULT NULL,
    stress_score INT NOT NULL,
    stress_level VARCHAR(20) NOT NULL,
    assessment_date TIMESTAMP NULL
        DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (result_id),
    FOREIGN KEY (student_id)
        REFERENCES students(student_id)
);

CREATE TABLE study_tasks (
    task_id INT NOT NULL AUTO_INCREMENT,
    student_id INT DEFAULT NULL,
    task_name VARCHAR(200) NOT NULL,
    deadline DATE DEFAULT NULL,
    priority VARCHAR(10) DEFAULT 'medium',
    PRIMARY KEY (task_id),
    FOREIGN KEY (student_id)
        REFERENCES students(student_id)
);