package com.lol.leagueoflegendsstats.model.entity;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "Players")
public class PlayerEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlayerID")
    private int id;

    @Column(name = "UserID")
    private int userId;

    @Column(name = "SummonerName")
    private String summonerName;

    @Column(name = "PUUID")
    private String puuid;

    @Column(name = "AccountID")
    private String accountId;

    @Column(name = "SummonerID")
    private String summonerId;

    @Column(name = "Level")
    private int level;

    @Column(name = "SummonerIcon")
    private String summonerIcon;

    @Column(name = "Updated")
    private String updated;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getSummonerIcon() {
		return summonerIcon;
	}

	public void setSummonerIcon(String summonerIcon) {
		this.summonerIcon = summonerIcon;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

    
}