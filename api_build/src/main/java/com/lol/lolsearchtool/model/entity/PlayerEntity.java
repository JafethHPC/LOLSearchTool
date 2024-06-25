package com.lol.lolsearchtool.model.entity;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Players")
public class PlayerEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlayerID")
    private Integer playerID;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private UserEntity user;

    @Column(name = "SummonerName", nullable = false, unique = true)
    private String summonerName;

    @Column(name = "PUUID", nullable = false, unique = true)
    private String puuid;

    @Column(name = "AccountID", nullable = false, unique = true)
    private String accountID;

    @Column(name = "SummonerID", nullable = false, unique = true)
    private String summonerID;

    @Column(name = "Level", nullable = false)
    private Integer level;

    @Column(name = "SummonerIcon", nullable = false)
    private String summonerIcon;

    @Column(name = "Updated", nullable = false)
    private LocalDateTime updated;

	public PlayerEntity(Integer playerID, UserEntity user, String summonerName, String puuid, String accountID,
			String summonerID, Integer level, String summonerIcon, LocalDateTime updated) {
		super();
		this.playerID = playerID;
		this.user = user;
		this.summonerName = summonerName;
		this.puuid = puuid;
		this.accountID = accountID;
		this.summonerID = summonerID;
		this.level = level;
		this.summonerIcon = summonerIcon;
		this.updated = updated;
	}

	public PlayerEntity() {
		super();
	}

	public Integer getPlayerID() {
		return playerID;
	}

	public void setPlayerID(Integer playerID) {
		this.playerID = playerID;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public String getSummonerName() {
		return summonerName;
	}

	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	public String getPuuid() {
		return puuid;
	}

	public void setPuuid(String puuid) {
		this.puuid = puuid;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getSummonerID() {
		return summonerID;
	}

	public void setSummonerID(String summonerID) {
		this.summonerID = summonerID;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getSummonerIcon() {
		return summonerIcon;
	}

	public void setSummonerIcon(String summonerIcon) {
		this.summonerIcon = summonerIcon;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

    
    
}