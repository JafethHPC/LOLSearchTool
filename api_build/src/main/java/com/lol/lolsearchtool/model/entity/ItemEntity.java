package com.lol.lolsearchtool.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Items")
public class ItemEntity {
    
    @Id
    @Column(name = "ItemID")
    private Integer itemId;
    
    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description")
    private String description;

	public ItemEntity(Integer itemId, String name, String description) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.description = description;
	}

	public ItemEntity() {
		super();
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
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