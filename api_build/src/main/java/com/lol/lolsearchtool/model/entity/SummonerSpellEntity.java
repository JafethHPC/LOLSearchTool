package com.lol.lolsearchtool.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "SummonerSpells")
public class SummonerSpellEntity {
    
    @Id
    @Column(name = "SummonerSpellID")
    private Integer summonerSpellId;
    
    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description")
    private String description;

	public SummonerSpellEntity(Integer summonerSpellId, String name, String description) {
		super();
		this.summonerSpellId = summonerSpellId;
		this.name = name;
		this.description = description;
	}

	public SummonerSpellEntity() {
		super();
	}

	public Integer getSummonerSpellId() {
		return summonerSpellId;
	}

	public void setSummonerSpellId(Integer summonerSpellId) {
		this.summonerSpellId = summonerSpellId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
    
}
