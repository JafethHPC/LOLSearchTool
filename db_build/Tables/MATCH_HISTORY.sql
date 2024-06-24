-- Match History Table (Modified)
CREATE TABLE IF NOT EXISTS MatchHistory (
    `MatchID` INT AUTO_INCREMENT PRIMARY KEY,
    `Timestamp` DATETIME NOT NULL,
    `GameDuration` INT,
    `GameMode` VARCHAR(50), 
    `GameType` VARCHAR(50),
    `MapID` INT,              
    `Patch` VARCHAR(10),
    `Participants` JSON 
);