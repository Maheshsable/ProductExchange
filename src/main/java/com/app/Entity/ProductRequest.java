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
@Table(name="product_request")
public class ProductRequest {
    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="prId",length=10)
	private int prId;
    @Column(name="excPId",length=10)
	private Product excPId;
    @Column(name="reqPID",length=10)
	private Product reqPID;
    @Column(name="reqPID",length=10)
	private Date dateOfRequest;
    @Column(name="dateOfApproval",length=10)
	private Date dateOfApproval;
    @OneToOne(targetEntity=Status.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="reqstatus")
	private Status reqStatus;
	public int getPrId() {
		return prId;
	}
	public void setPrId(int prId) {
		this.prId = prId;
	}
	public Product getExcPId() {
		return excPId;
	}
	public void setExcPId(Product excPId) {
		this.excPId = excPId;
	}
	public Product getReqPID() {
		return reqPID;
	}
	public void setReqPID(Product reqPID) {
		this.reqPID = reqPID;
	}
	public Date getDateOfRequest() {
		return dateOfRequest;
	}
	public void setDateOfRequest(Date dateOfRequest) {
		this.dateOfRequest = dateOfRequest;
	}
	public Date getDateOfApproval() {
		return dateOfApproval;
	}
	public void setDateOfApproval(Date dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}
	public Status getReqStatus() {
		return reqStatus;
	}
	public void setReqStatus(Status reqStatus) {
		this.reqStatus = reqStatus;
	}
	
}
