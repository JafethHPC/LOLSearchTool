-- League Table
CREATE TABLE IF NOT EXISTS Leagues (
    `LeagueID` INT AUTO_INCREMENT PRIMARY KEY,
    `PlayerID` INT,
    `QueueTypeID` INT,
    `TierID` INT,
    `SeasonID` INT,
    `LP` INT,
    `Wins` INT,
    `Losses` INT,
    `GamesPlayed` INT,
    `Hotstreak` BOOLEAN,
    FOREIGN KEY (`PlayerID`) REFERENCES Players(`PlayerID`),
    FOREIGN KEY (`QueueTypeID`) REFERENCES QueueTypes(`QueueTypeID`),
    FOREIGN KEY (`TierID`) REFERENCES Tiers(`TierID`),
    FOREIGN KEY (`SeasonID`) REFERENCES Seasons(`SeasonID`)
);