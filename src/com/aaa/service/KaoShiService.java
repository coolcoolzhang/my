package com.aaa.service;

import java.util.List;

import com.aaa.entity.Kaoshi;

public interface KaoShiService {
	public List find();
	public void save(Kaoshi k);
	public void dele(Kaoshi ks);
}
