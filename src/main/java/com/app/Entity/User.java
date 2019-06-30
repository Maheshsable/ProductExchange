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
@Table(name="user")
public class User {
       
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="ud",length=10)
      private int uId;
	  @Column(name="name",length=10)
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
	
}
