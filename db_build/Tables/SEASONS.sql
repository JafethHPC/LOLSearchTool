-- Season Table
CREATE TABLE IF NOT EXISTS Seasons (
    `SeasonID` INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(255) NOT NULL,
    `StartDate` DATETIME,
    `EndDate` DATETIME
);