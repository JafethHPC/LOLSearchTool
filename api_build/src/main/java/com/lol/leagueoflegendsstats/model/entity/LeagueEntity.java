package com.lol.leagueoflegendsstats.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Leagues")
public class LeagueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LeagueID")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PlayerID")
    private PlayerEntity player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "QueueTypeID")
    private QueueTypeEntity queueType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TierID")
    private TierEntity tier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SeasonID")
    private SeasonEntity season;

    @Column(name = "LP")
    private int lp;

    @Column(name = "Wins")
    private int wins;

    @Column(name = "Losses")
    private int losses;

    @Column(name = "SeasonSplit")
    private String seasonSplit;

    @Column(name = "GamesPlayed")
    private int gamesPlayed;

    @Column(name = "Hotstreak")
    private Boolean hotstreak;
}