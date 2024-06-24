-- Queue Type Table
CREATE TABLE IF NOT EXISTS QueueTypes (
    `QueueTypeID` INT AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50) NOT NULL,
    `Description` VARCHAR(255)  -- Added for queue type description
);