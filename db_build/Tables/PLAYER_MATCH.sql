-- PlayerMatch Table
CREATE TABLE IF NOT EXISTS PlayerMatch (
    `PlayerMatchID` INT AUTO_INCREMENT PRIMARY KEY,
    `PlayerID` INT,
    `MatchID` INT,
    `ChampionID` INT,
    `TeamID` INT,
    `Role` VARCHAR(50),
    `Win` BOOLEAN,
    `Kills` INT,
    `Deaths` INT,
    `Assists` INT,
    `DamageDealt` INT,
    `GoldEarned` INT,
    `Items` JSON, 
    `Runes` JSON,
    `SummonerSpells` JSON,
    FOREIGN KEY (`PlayerID`) REFERENCES Players(`PlayerID`),
    FOREIGN KEY (`MatchID`) REFERENCES MatchHistory(`MatchID`),
    FOREIGN KEY (`ChampionID`) REFERENCES Champions(`ChampionID`),
    FOREIGN KEY (`TeamID`) REFERENCES Teams(`TeamID`)
);