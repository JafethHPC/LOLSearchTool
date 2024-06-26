package com.lol.lolsearchtool.model.entity;
import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "PlayerMatch")
public class PlayerMatchEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlayerMatchID")
    private Integer playerMatchID;

    @ManyToOne
    @JoinColumn(name = "PlayerID", nullable = false) // Assuming player is required
    private PlayerEntity player;

    @ManyToOne
    @JoinColumn(name = "MatchID", nullable = false) // Assuming match is required
    private MatchHistoryEntity match;

    @ManyToOne
    @JoinColumn(name = "ChampionID", nullable = false) // Assuming champion is required
    private ChampionEntity champion;

    @ManyToOne
    @JoinColumn(name = "TeamID", nullable = false) // Assuming team is required
    private TeamsEntity team;

    @Column(name = "Role")
    private String role;

    @Column(name = "Win")
    private Boolean win;

    @Column(name = "Kills")
    private Integer kills;

    @Column(name = "Deaths")
    private Integer deaths;

    @Column(name = "Assists")
    private Integer assists;

    @Column(name = "DamageDealt")
    private Integer damageDealt;

    @Column(name = "GoldEarned")
    private Integer goldEarned;

    @Column(name = "Items", columnDefinition = "json")
    private String items;

    @Column(name = "Runes", columnDefinition = "json")
    private String runes;

    @Column(name = "SummonerSpells", columnDefinition = "json")
    private String summonerSpells;

	public PlayerMatchEntity(Integer playerMatchID, PlayerEntity player, MatchHistoryEntity match,
			ChampionEntity champion, TeamsEntity team, String role, Boolean win, Integer kills, Integer deaths,
			Integer assists, Integer damageDealt, Integer goldEarned, String items, String runes,
			String summonerSpells) {
		super();
		this.playerMatchID = playerMatchID;
		this.player = player;
		this.match = match;
		this.champion = champion;
		this.team = team;
		this.role = role;
		this.win = win;
		this.kills = kills;
		this.deaths = deaths;
		this.assists = assists;
		this.damageDealt = damageDealt;
		this.goldEarned = goldEarned;
		this.items = items;
		this.runes = runes;
		this.summonerSpells = summonerSpells;
	}

	public PlayerMatchEntity() {
		super();
	}

	public Integer getPlayerMatchID() {
		return playerMatchID;
	}

	public void setPlayerMatchID(Integer playerMatchID) {
		this.playerMatchID = playerMatchID;
	}

	public PlayerEntity getPlayer() {
		return player;
	}

	public void setPlayer(PlayerEntity player) {
		this.player = player;
	}

	public MatchHistoryEntity getMatch() {
		return match;
	}

	public void setMatch(MatchHistoryEntity match) {
		this.match = match;
	}

	public ChampionEntity getChampion() {
		return champion;
	}

	public void setChampion(ChampionEntity champion) {
		this.champion = champion;
	}

	public TeamsEntity getTeam() {
		return team;
	}

	public void setTeam(TeamsEntity team) {
		this.team = team;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getWin() {
		return win;
	}

	public void setWin(Boolean win) {
		this.win = win;
	}

	public Integer getKills() {
		return kills;
	}

	public void setKills(Integer kills) {
		this.kills = kills;
	}

	public Integer getDeaths() {
		return deaths;
	}

	public void setDeaths(Integer deaths) {
		this.deaths = deaths;
	}

	public Integer getAssists() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	public Integer getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(Integer damageDealt) {
		this.damageDealt = damageDealt;
	}

	public Integer getGoldEarned() {
		return goldEarned;
	}

	public void setGoldEarned(Integer goldEarned) {
		this.goldEarned = goldEarned;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getRunes() {
		return runes;
	}

	public void setRunes(String runes) {
		this.runes = runes;
	}

	public String getSummonerSpells() {
		return summonerSpells;
	}

	public void setSummonerSpells(String summonerSpells) {
		this.summonerSpells = summonerSpells;
	}

    
}
