package com.lol.lolsearchtool.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Champions")
public class ChampionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ChampionID")
    private Integer championID;

    @Column(name = "Name", nullable = false, unique = true)
    private String name;

    @Column(name = "Title")
    private String title;

    @Column(name = "Roles", columnDefinition = "json")
    private String roles;

    @Column(name = "ImageURL")
    private String imageURL;

	public ChampionEntity(Integer championID, String name, String title, String roles, String imageURL) {
		super();
		this.championID = championID;
		this.name = name;
		this.title = title;
		this.roles = roles;
		this.imageURL = imageURL;
	}

	public ChampionEntity() {
		super();
	}

	public Integer getChampionID() {
		return championID;
	}

	public void setChampionID(Integer championID) {
		this.championID = championID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
    
}
