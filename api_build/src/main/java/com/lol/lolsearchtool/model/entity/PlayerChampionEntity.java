package com.lol.lolsearchtool.model.entity;
import jakarta.persistence.*;
import java.sql.Time;
import lombok.Data;

@Data
@Entity
@Table(name = "PlayerChampions")
public class PlayerChampionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlayerChampionID")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PlayerID")
    private PlayerEntity player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ChampionID")
    private ChampionEntity champion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SeasonID")
    private SeasonEntity season;

    @Column(name = "CS")
    private int cs;

    @Column(name = "Kills")
    private int kills;

    @Column(name = "Deaths")
    private int deaths;

    @Column(name = "Assists")
    private int assists;

    @Column(name = "DoubleKills")
    private int doubleKills;

    @Column(name = "TripleKills")
    private int tripleKills;

    @Column(name = "QuadraKills")
    private int quadraKills;

    @Column(name = "PentaKills")
    private int pentaKills;

    @Column(name = "Wins")
    private int wins;

    @Column(name = "Losses")
    private int losses;

    @Column(name = "GamesPlayed")
    private int gamesPlayed;

    @Column(name = "GameDuration")
    private Time gameDuration;

    @Column(name = "ChampionRunes")
    private String championRunes;

    @Column(name = "ChampionItems")
    private String championItems;

    @Column(name = "LP")
    private int lp;

    @Column(name = "MaxKills")
    private int maxKills;

    @Column(name = "MaxDeaths")
    private int maxDeaths;

    @Column(name = "Damage")
    private int damage;

    @Column(name = "Gold")
    private int gold;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PlayerEntity getPlayer() {
		return player;
	}

	public void setPlayer(PlayerEntity player) {
		this.player = player;
	}

	public ChampionEntity getChampion() {
		return champion;
	}

	public void setChampion(ChampionEntity champion) {
		this.champion = champion;
	}

	public SeasonEntity getSeason() {
		return season;
	}

	public void setSeason(SeasonEntity season) {
		this.season = season;
	}

	public int getCs() {
		return cs;
	}

	public void setCs(int cs) {
		this.cs = cs;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getDoubleKills() {
		return doubleKills;
	}

	public void setDoubleKills(int doubleKills) {
		this.doubleKills = doubleKills;
	}

	public int getTripleKills() {
		return tripleKills;
	}

	public void setTripleKills(int tripleKills) {
		this.tripleKills = tripleKills;
	}

	public int getQuadraKills() {
		return quadraKills;
	}

	public void setQuadraKills(int quadraKills) {
		this.quadraKills = quadraKills;
	}

	public int getPentaKills() {
		return pentaKills;
	}

	public void setPentaKills(int pentaKills) {
		this.pentaKills = pentaKills;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public Time getGameDuration() {
		return gameDuration;
	}

	public void setGameDuration(Time gameDuration) {
		this.gameDuration = gameDuration;
	}

	public String getChampionRunes() {
		return championRunes;
	}

	public void setChampionRunes(String championRunes) {
		this.championRunes = championRunes;
	}

	public String getChampionItems() {
		return championItems;
	}

	public void setChampionItems(String championItems) {
		this.championItems = championItems;
	}

	public int getLp() {
		return lp;
	}

	public void setLp(int lp) {
		this.lp = lp;
	}

	public int getMaxKills() {
		return maxKills;
	}

	public void setMaxKills(int maxKills) {
		this.maxKills = maxKills;
	}

	public int getMaxDeaths() {
		return maxDeaths;
	}

	public void setMaxDeaths(int maxDeaths) {
		this.maxDeaths = maxDeaths;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
    
    
}

