package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.KaoShiDao;
import com.aaa.entity.Kaoshi;
@Service
public class KaoShiServiceImpl implements KaoShiService {
	@Autowired
	private KaoShiDao dao;
	public KaoShiDao getDao() {
		return dao;
	}
	public void setDao(KaoShiDao dao) {
		this.dao = dao;
	}
	@Transactional
	public List find() {
		return dao.find();
	}

	@Transactional
	public void save(Kaoshi k) {
		
		dao.save(k);
	}

	@Transactional
	public void dele(Kaoshi ks) {
		dao.dele(ks);
	}

}
