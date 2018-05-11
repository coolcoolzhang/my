package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Kaoshi;

public interface KaoShiDao {
	public List find();
	public void save(Kaoshi k);
	public void dele(Kaoshi ks);
}
