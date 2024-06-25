package com.lol.lolsearchtool.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Entity
@Table(name = "MatchHistory")
public class MatchHistoryEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MatchID")
    private Integer matchID;

    @Column(name = "Timestamp", nullable = false)
    private LocalDateTime timestamp;

    @Column(name = "GameDuration")
    private Integer gameDuration;

    @Column(name = "GameMode")
    private String gameMode;

    @Column(name = "GameType")
    private String gameType;

    @Column(name = "MapID")
    private Integer mapID; 

    @Column(name = "Patch")
    private String patch;

    @Column(name = "Participants", columnDefinition = "json")
    private String participants;

	public MatchHistoryEntity(Integer matchID, LocalDateTime timestamp, Integer gameDuration, String gameMode,
			String gameType, Integer mapID, String patch, String participants) {
		super();
		this.matchID = matchID;
		this.timestamp = timestamp;
		this.gameDuration = gameDuration;
		this.gameMode = gameMode;
		this.gameType = gameType;
		this.mapID = mapID;
		this.patch = patch;
		this.participants = participants;
	}

	public MatchHistoryEntity() {
		super();
	}

	public Integer getMatchID() {
		return matchID;
	}

	public void setMatchID(Integer matchID) {
		this.matchID = matchID;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getGameDuration() {
		return gameDuration;
	}

	public void setGameDuration(Integer gameDuration) {
		this.gameDuration = gameDuration;
	}

	public String getGameMode() {
		return gameMode;
	}

	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public Integer getMapID() {
		return mapID;
	}

	public void setMapID(Integer mapID) {
		this.mapID = mapID;
	}

	public String getPatch() {
		return patch;
	}

	public void setPatch(String patch) {
		this.patch = patch;
	}

	public String getParticipants() {
		return participants;
	}

	public void setParticipants(String participants) {
		this.participants = participants;
	} 
    
}
