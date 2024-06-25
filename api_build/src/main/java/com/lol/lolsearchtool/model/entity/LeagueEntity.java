package com.lol.lolsearchtool.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "Leagues")
public class LeagueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LeagueID")
    private Integer leagueID;

    @ManyToOne
    @JoinColumn(name = "PlayerID", nullable = false)
    private PlayerEntity player;

    @ManyToOne
    @JoinColumn(name = "QueueTypeID", nullable = false)
    private QueueTypeEntity queueType;

    @ManyToOne
    @JoinColumn(name = "TierID", nullable = false)
    private TierEntity tier;

    @ManyToOne
    @JoinColumn(name = "SeasonID", nullable = false)
    private SeasonEntity season;

    @Column(name = "LP")
    private Integer lp;

    @Column(name = "Wins")
    private Integer wins;

    @Column(name = "Losses")
    private Integer losses;

    @Column(name = "GamesPlayed")
    private Integer gamesPlayed;

    @Column(name = "Hotstreak")
    private Boolean hotstreak;

	public LeagueEntity(Integer leagueID, PlayerEntity player, QueueTypeEntity queueType, TierEntity tier,
			SeasonEntity season, Integer lp, Integer wins, Integer losses, Integer gamesPlayed,
			Boolean hotstreak) {
		super();
		this.leagueID = leagueID;
		this.player = player;
		this.queueType = queueType;
		this.tier = tier;
		this.season = season;
		this.lp = lp;
		this.wins = wins;
		this.losses = losses;
		this.gamesPlayed = gamesPlayed;
		this.hotstreak = hotstreak;
	}

	public LeagueEntity() {
		super();
	}

	public Integer getLeagueID() {
		return leagueID;
	}

	public void setLeagueID(Integer leagueID) {
		this.leagueID = leagueID;
	}

	public PlayerEntity getPlayer() {
		return player;
	}

	public void setPlayer(PlayerEntity player) {
		this.player = player;
	}

	public QueueTypeEntity getQueueType() {
		return queueType;
	}

	public void setQueueType(QueueTypeEntity queueType) {
		this.queueType = queueType;
	}

	public TierEntity getTier() {
		return tier;
	}

	public void setTier(TierEntity tier) {
		this.tier = tier;
	}

	public SeasonEntity getSeason() {
		return season;
	}

	public void setSeason(SeasonEntity season) {
		this.season = season;
	}

	public Integer getLp() {
		return lp;
	}

	public void setLp(Integer lp) {
		this.lp = lp;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getLosses() {
		return losses;
	}

	public void setLosses(Integer losses) {
		this.losses = losses;
	}

	public Integer getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(Integer gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public Boolean getHotstreak() {
		return hotstreak;
	}

	public void setHotstreak(Boolean hotstreak) {
		this.hotstreak = hotstreak;
	}
    
    
}