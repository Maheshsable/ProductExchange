package com.app.Entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	 @Id
	 @PrimaryKeyJoinColumn
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="pid",length=10)
	 private int pId;
	 @Column(name="pname",length=10)
	 private String pName;
	 @Column(name="price",length=10)
	 private double price;
	 @Column(name="description")
	 private String description;
	 @Column(name="purchagedate",length=10)
	 private Date purchacedDate;
	 @OneToOne(targetEntity=Status.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 @JoinColumn(name="status")
	 private Status pAvailabilityStatus;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPurchacedDate() {
		return purchacedDate;
	}
	public void setPurchacedDate(Date purchacedDate) {
		this.purchacedDate = purchacedDate;
	}
	public Status getpAvailabilityStatus() {
		return pAvailabilityStatus;
	}
	public void setpAvailabilityStatus(Status pAvailabilityStatus) {
		this.pAvailabilityStatus = pAvailabilityStatus;
	}
	

}
