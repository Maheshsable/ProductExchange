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
@Table(name="city")
public class City {
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name="cid")
	    private int ctyId;
	    @Column(name="cityname",length=10)
	    private String ctyName;
	    
	    @ManyToOne(targetEntity=State.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	    @JoinColumn(name="sid")
	    private State   sId;

		public int getCtyId() {
			return ctyId;
		}

		public void setCtyId(int ctyId) {
			this.ctyId = ctyId;
		}

		public String getCtyName() {
			return ctyName;
		}

		public void setCtyName(String ctyName) {
			this.ctyName = ctyName;
		}

		public State getsId() {
			return sId;
		}

		public void setsId(State sId) {
			this.sId = sId;
		}

}
