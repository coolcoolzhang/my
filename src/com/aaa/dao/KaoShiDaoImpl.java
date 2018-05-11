package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaa.entity.Kaoshi;
@Repository
public class KaoShiDaoImpl implements KaoShiDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public List find() {
		String sql=" from Kaoshi ";
		
		return this.getHibernateTemplate().find(sql);
	}
	@Override
	public void save(Kaoshi k) {
		this.getHibernateTemplate().save(k);
	}
	@Override
	
	public void dele(Kaoshi ks) {
		hibernateTemplate.delete(ks);
	}

}
