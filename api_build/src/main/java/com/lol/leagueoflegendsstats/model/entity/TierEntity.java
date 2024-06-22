package com.lol.leagueoflegendsstats.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Tiers")
public class TierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TierID")
    private int id;

    @Column(name = "Name", nullable = false)
    private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
