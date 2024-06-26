-- Create the database
CREATE DATABASE IF NOT EXISTS LOLSearchTool;

-- Use the database
USE LOLSearchTool;

-- User Table
CREATE TABLE IF NOT EXISTS Users (
    `UserID` INT AUTO_INCREMENT PRIMARY KEY,
    `Username` VARCHAR(255) NOT NULL UNIQUE,
    `Email` VARCHAR(255) NOT NULL UNIQUE,
    `Password` VARCHAR(255) NOT NULL,
    `RegistrationDate` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `LastLogin` DATETIME DEFAULT NULL
);

-- Player Table
CREATE TABLE IF NOT EXISTS Players (
    `PlayerID` INT AUTO_INCREMENT PRIMARY KEY,
    `UserID` INT,
    `SummonerName` VARCHAR(255) NOT NULL UNIQUE,
    `PUUID` VARCHAR(255) NOT NULL UNIQUE,
    `AccountID` VARCHAR(255) NOT NULL UNIQUE,
    `SummonerID` VARCHAR(255) NOT NULL UNIQUE,
    `Region` VARCHAR(50) NOT NULL,
    `Level` INT NOT NULL,
    `SummonerIcon` VARCHAR(255) NOT NULL,
    `Updated` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (`UserID`) REFERENCES Users(`UserID`)
);

-- Season Table
CREATE TABLE IF NOT EXISTS Seasons (
    `SeasonID` INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(255) NOT NULL,
    `StartDate` DATETIME,
    `EndDate` DATETIME
);

-- Tier Table
CREATE TABLE IF NOT EXISTS Tiers (
    `TierID` INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50) NOT NULL
);

-- Queue Type Table
CREATE TABLE IF NOT EXISTS QueueTypes (
    `QueueTypeID` INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50) NOT NULL,
    `Description` VARCHAR(255)  -- Added for queue type description
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
    `Name` VARCHAR(255) NOT NULL UNIQUE,
    `Title` VARCHAR(255),
    `Roles` JSON,
    `ImageURL` VARCHAR(255)
);

-- Team Table
CREATE TABLE IF NOT EXISTS Teams (
    `TeamID` INT AUTO_INCREMENT PRIMARY KEY
);


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

-- Item Table
CREATE TABLE IF NOT EXISTS Items (
    `ItemID` INT PRIMARY KEY,
    `Name` VARCHAR(255) NOT NULL,
    `Description` TEXT
);

-- Rune Table
CREATE TABLE IF NOT EXISTS Runes (
    `RuneID` INT PRIMARY KEY,
    `Name` VARCHAR(255) NOT NULL,
    `Description` TEXT
);

-- Summoner Spell Table 
CREATE TABLE IF NOT EXISTS SummonerSpells (
    `SummonerSpellID` INT PRIMARY KEY,
    `Name` VARCHAR(255) NOT NULL,
    `Description` TEXT
);

-- Index for Faster Queries 
CREATE INDEX idx_summoner_name ON Players (SummonerName);
CREATE INDEX idx_match_timestamp ON MatchHistory (Timestamp);
CREATE INDEX idx_player_match ON PlayerMatch (PlayerID, MatchID);
