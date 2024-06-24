-- Champion Table
CREATE TABLE IF NOT EXISTS Champions (
    `ChampionID` INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(255) NOT NULL UNIQUE,
    `Title` VARCHAR(255),
    `Roles` JSON,
    `ImageURL` VARCHAR(255)
);