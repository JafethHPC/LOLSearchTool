-- Create the database
CREATE DATABASE IF NOT EXISTS LOLSearchTool;

-- Use the database
USE LOLSearchTool;

-- User Table
CREATE TABLE IF NOT EXISTS Users (
    `UserID` INT AUTO_INCREMENT PRIMARY KEY,
    `Username` VARCHAR(255) NOT NULL,
    `Email` VARCHAR(255) NOT NULL,
    `Password` VARCHAR(255) NOT NULL,
    `RegistrationDate` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `LastLogin` DATETIME DEFAULT NULL
);

-- Player Table
CREATE TABLE IF NOT EXISTS Players (
    `PlayerID` INT AUTO_INCREMENT PRIMARY KEY,
    `UserID` INT,
    `SummonerName` VARCHAR(255) NOT NULL,
    `PUUID` VARCHAR(255) NOT NULL,
    `AccountID` VARCHAR(255) NOT NULL,
    `SummonerID` VARCHAR(255) NOT NULL,
    `Level` INT NOT NULL,
    `SummonerIcon` VARCHAR(255) NOT NULL,
    `Updated` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (`UserID`) REFERENCES Users(`UserID`)
);

-- Season Table
CREATE TABLE IF NOT EXISTS Seasons (
    `SeasonID` INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(255) NOT NULL,
    `StartDate` VARCHAR(20),
    `EndDate` VARCHAR(20)
);

-- Tier Table
CREATE TABLE IF NOT EXISTS Tiers (
    `TierID` INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50) NOT NULL
);

-- Queue Type Table
CREATE TABLE IF NOT EXISTS QueueTypes (
    `QueueTypeID` INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50) NOT NULL
);

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
    `SeasonSplit` VARCHAR(50),
    `GamesPlayed` INT,
    `Hotstreak` BOOLEAN,
    FOREIGN KEY (`PlayerID`) REFERENCES Players(`PlayerID`),
    FOREIGN KEY (`QueueTypeID`) REFERENCES QueueTypes(`QueueTypeID`),
    FOREIGN KEY (`TierID`) REFERENCES Tiers(`TierID`),
    FOREIGN KEY (`SeasonID`) REFERENCES Seasons(`SeasonID`)
);

-- Champion Table
CREATE TABLE IF NOT EXISTS Champions (
    `ChampionID` INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(255) NOT NULL
);

-- Player Champion Table
CREATE TABLE IF NOT EXISTS PlayerChampions (
    `PlayerChampionID` INT AUTO_INCREMENT PRIMARY KEY,
    `PlayerID` INT,
    `ChampionID` INT,
    `SeasonID` INT,
    `CS` INT,
    `Kills` INT,
    `Deaths` INT,
    `Assists` INT,
    `DoubleKills` INT,
    `TripleKills` INT,
    `QuadraKills` INT,
    `PentaKills` INT,
    `Wins` INT,
    `Losses` INT,
    `GamesPlayed` INT,
    `GameDuration` TIME,
    `ChampionRunes` TEXT,
    `ChampionItems` TEXT,
    `LP` INT,
    `MaxKills` INT,
    `MaxDeaths` INT,
    `Damage` INT,
    `Gold` INT,
    FOREIGN KEY (`PlayerID`) REFERENCES Players(`PlayerID`),
    FOREIGN KEY (`ChampionID`) REFERENCES Champions(`ChampionID`),
    FOREIGN KEY (`SeasonID`) REFERENCES Seasons(`SeasonID`)
);

-- Match History Table
CREATE TABLE IF NOT EXISTS MatchHistory (
    `MatchID` INT AUTO_INCREMENT PRIMARY KEY
);

