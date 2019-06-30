package com.app.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="aid")
	private int aId;
    @Column(name="address",length=10)
	private String address;
    @Column(name="pincode",length=10)
	private int pincode;
    @ManyToOne(targetEntity=City.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="cid")
	private City ctyId;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public City getCtyId() {
		return ctyId;
	}
	public void setCtyId(City ctyId) {
		this.ctyId = ctyId;
	}
	
}
