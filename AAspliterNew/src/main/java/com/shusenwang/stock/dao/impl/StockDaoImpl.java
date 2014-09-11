package com.shusenwang.stock.dao.impl;

import java.util.List;


import com.shusenwang.stock.dao.StockDao;
import com.shusenwang.stock.model.Stock;

public class StockDaoImpl implements StockDao{
	
	public void save(Stock stock){
		//getHibernateTemplate().save(stock);
	}
	
	public void update(Stock stock){
		//getHibernateTemplate().update(stock);
	}
	
	public void delete(Stock stock){
		//getHibernateTemplate().delete(stock);
	}
	
	public Stock findByStockCode(String stockCode){
		//List list = getHibernateTemplate().find("from Stock where stockCode=?",stockCode);
		//return (Stock)list.get(0);
		return null;
	}

}
