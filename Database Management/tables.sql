CREATE DATABASE bt_db;
USE bt_db;

-- Table for 'User'
CREATE TABLE User (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

-- Table for 'Project'
CREATE TABLE Project (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Table for 'Bug'
CREATE TABLE Bug (
    id INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    title VARCHAR(255) NOT NULL,
    reporter_id INT,
    assignee_id INT,
    project_id INT,
    FOREIGN KEY (reporter_id) REFERENCES User(id),
    FOREIGN KEY (assignee_id) REFERENCES User(id),
    FOREIGN KEY (project_id) REFERENCES Project(id)
);
