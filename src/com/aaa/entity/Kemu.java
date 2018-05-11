package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Kemu entity. @author MyEclipse Persistence Tools
 */

public class Kemu implements java.io.Serializable {

	// Fields

	private Integer kid;
	private String kname;
	private Set kaoshis = new HashSet(0);

	// Constructors

	/** default constructor */
	public Kemu() {
	}

	/** full constructor */
	public Kemu(String kname, Set kaoshis) {
		this.kname = kname;
		this.kaoshis = kaoshis;
	}

	// Property accessors

	public Integer getKid() {
		return this.kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}

	public String getKname() {
		return this.kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public Set getKaoshis() {
		return this.kaoshis;
	}

	public void setKaoshis(Set kaoshis) {
		this.kaoshis = kaoshis;
	}

}