package com.lol.lolsearchtool.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Runes")
public class RuneEntity {

    @Id
    @Column(name = "RuneID")
    private Integer runeId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description")
    private String description;

	public RuneEntity(Integer runeId, String name, String description) {
		super();
		this.runeId = runeId;
		this.name = name;
		this.description = description;
	}

	public RuneEntity() {
		super();
	}

	public Integer getRuneId() {
		return runeId;
	}

	public void setRuneId(Integer runeId) {
		this.runeId = runeId;
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
