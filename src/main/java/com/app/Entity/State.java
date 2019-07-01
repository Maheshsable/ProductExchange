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
@Table(name="state")
public class State {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="sid",length=10)
	 private int sId;
	 @Column(name="sname",length=10)
	 private String sName;
	 @ManyToOne(targetEntity=Country.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 @JoinColumn(name="cid")
	 private Country cId;
	 
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Country getcId() {
		return cId;
	}
	public void setcId(Country cId) {
		this.cId = cId;
	}
	 
	
}
