package com.lol.lolsearchtool.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Teams")
public class TeamsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TeamID")
    private Integer teamID;

	public TeamsEntity(Integer teamID) {
		super();
		this.teamID = teamID;
	}

	public TeamsEntity() {
		super();
	}

	public Integer getTeamID() {
		return teamID;
	}

	public void setTeamID(Integer teamID) {
		this.teamID = teamID;
	}

    
}