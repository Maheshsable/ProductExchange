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
@Table(name="admin")
public class Admin {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="ud",length=10)
      private int aId;
	  @Column(name="admin_name",length=10)
	  private String name;
	  @Column(name="password",length=10)
	  private String password;
	  @Column(name="mail",length=10)
	  private String mail;
	  @Column(name="mobileno",length=10)
	  private String mobileNo;
	  @ManyToOne(targetEntity=Address.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	  @JoinColumn(name="add")
	  private Address addr;
	  @ManyToOne(targetEntity=Product.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	  @JoinColumn(name="pid")
	  private Product product;
	  
	  public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	 
}
