package com.Notes;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Data {
	public static SessionFactory sf;
	public static SessionFactory getFactory() {
		
		if(sf==null) {
			Configuration cfg = new Configuration();
			cfg.configure("hconfig.xml");
			sf = cfg.buildSessionFactory();
		}
		return sf;
	}
	public void closeFactory() {
		if(sf.isOpen()) {
			sf.close(); 
		}
	}


}
