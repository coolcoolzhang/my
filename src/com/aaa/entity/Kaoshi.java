package com.aaa.entity;

import java.util.Date;

/**
 * Kaoshi entity. @author MyEclipse Persistence Tools
 */

public class Kaoshi implements java.io.Serializable {

	// Fields

	private Integer sid;
	private Kemu kemu;
	private String sname;
	private Date stime;
	private String saddress;
	private Integer fenshu;

	// Constructors

	/** default constructor */
	public Kaoshi() {
	}

	/** minimal constructor */
	public Kaoshi(Kemu kemu) {
		this.kemu = kemu;
	}

	/** full constructor */
	public Kaoshi(Kemu kemu, String sname, Date stime, String saddress, Integer fenshu) {
		this.kemu = kemu;
		this.sname = sname;
		this.stime = stime;
		this.saddress = saddress;
		this.fenshu = fenshu;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Kemu getKemu() {
		return this.kemu;
	}

	public void setKemu(Kemu kemu) {
		this.kemu = kemu;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getStime() {
		return this.stime;
	}

	public void setStime(Date stime) {
		this.stime = stime;
	}

	public String getSaddress() {
		return this.saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public Integer getFenshu() {
		return this.fenshu;
	}

	public void setFenshu(Integer fenshu) {
		this.fenshu = fenshu;
	}

}