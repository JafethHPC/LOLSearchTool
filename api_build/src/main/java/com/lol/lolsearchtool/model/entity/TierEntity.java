package com.lol.lolsearchtool.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Tiers")
public class TierEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TierID")
    private Integer tierID;

    @Column(name = "Name", nullable = false)
    private String name;

	public TierEntity(Integer tierID, String name) {
		super();
		this.tierID = tierID;
		this.name = name;
	}

	public TierEntity() {
		super();
	}

	public Integer getTierID() {
		return tierID;
	}

	public void setTierID(Integer tierID) {
		this.tierID = tierID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    
    
}
