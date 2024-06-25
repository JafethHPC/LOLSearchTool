-- User Table
CREATE TABLE IF NOT EXISTS Users (
    `UserID` INT AUTO_INCREMENT PRIMARY KEY,
    `Username` VARCHAR(255) NOT NULL UNIQUE,
    `Email` VARCHAR(255) NOT NULL UNIQUE,
    `Password` VARCHAR(255) NOT NULL,
    `RegistrationDate` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `LastLogin` DATETIME DEFAULT NULL
);