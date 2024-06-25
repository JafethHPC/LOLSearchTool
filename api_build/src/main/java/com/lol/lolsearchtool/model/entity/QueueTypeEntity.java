package com.lol.lolsearchtool.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "QueueTypes")
public class QueueTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QueueTypeID")
    private Integer queueTypeID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description")
    private String description;

	public QueueTypeEntity(Integer queueTypeID, String name, String description) {
		super();
		this.queueTypeID = queueTypeID;
		this.name = name;
		this.description = description;
	}

	public QueueTypeEntity() {
		super();
	}

	public Integer getQueueTypeID() {
		return queueTypeID;
	}

	public void setQueueTypeID(Integer queueTypeID) {
		this.queueTypeID = queueTypeID;
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
