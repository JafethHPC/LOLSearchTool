-- Summoner Spell Table 
CREATE TABLE IF NOT EXISTS SummonerSpells (
    `SummonerSpellID` INT PRIMARY KEY,
    `Name` VARCHAR(255) NOT NULL,
    `Description` TEXT
);