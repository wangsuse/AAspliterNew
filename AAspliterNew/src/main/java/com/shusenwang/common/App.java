package com.shusenwang.common;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





import com.shusenwang.stock.bo.StockBo;
import com.shusenwang.stock.model.Stock;

public class App 
{
    public static void main( String[] args )
    {


    	ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml"); 
    	
        StockBo stockBo = (StockBo)appContext.getBean("stockBo");
        SessionFactory sessionFactory= (SessionFactory)appContext.getBean("sessionFactory");
    	Stock stock = new Stock();
    	stock.setStockCode("7668");
    	stock.setStockName("HAIO");
        
        Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save( stock );
		session.getTransaction().commit();
		session.close();

		// now lets pull events from the database and list them
		session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery( "from Stock" ).list();
		for ( Stock stock1 : (List<Stock>) result ) {
			System.out.println( "Event (" + stock1.getStockName() + ") : " + stock1.getStockCode() );
		}
        session.getTransaction().commit();
        session.close();
      
        if ( sessionFactory != null ) {
			sessionFactory.close();
		}
        
    }
}
