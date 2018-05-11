package com.aaa.actions;

import java.util.Date;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aaa.entity.Kaoshi;
import com.aaa.entity.Kemu;
import com.aaa.service.KaoShiService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
public class KaoAction extends ActionSupport {
	@Autowired
	private KaoShiService kaoservice;
	private Kaoshi ks;

	public KaoShiService getKaoservice() {
		return kaoservice;
	}

	public void setKaoservice(KaoShiService kaoservice) {
		this.kaoservice = kaoservice;
	}

	public Kaoshi getKs() {
		return ks;
	}

	public void setKs(Kaoshi ks) {
		this.ks = ks;
	}

	@Override
	public String execute() throws Exception {
		ServletActionContext.getRequest().setAttribute("list", kaoservice.find());
		return SUCCESS;
	}
	
	public String save(){
		kaoservice.save(ks);
		System.out.println("ÃÌº”ÕÍ≥…");
		return "save";
	}
	public String dele(){
		kaoservice.dele(ks);
		return "dele";
	}
}
