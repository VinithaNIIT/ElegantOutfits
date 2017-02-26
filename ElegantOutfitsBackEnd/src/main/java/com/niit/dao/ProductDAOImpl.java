package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	private static Logger log=LoggerFactory.getLogger(ProductDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	public Session getSession()
	{
		return sessionFactory.openSession();
	}

	public boolean addProduct(Product product) {
		
		log.debug("Starting of the Method addProduct");
			try {
				Session session=getSession();
				Transaction tx=session.beginTransaction();
				session.saveOrUpdate(product);
				tx.commit();
				session.close();
				log.debug("Ending of the Method addProduct");
				return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.debug("Ending of the Method addProduct");
				return false;
			}
		
	}

	public List<Product> getProduct() {
		log.debug("Starting of the Method getProduct");
		Session session=getSession();
		String sql_query="from Product";
		Query query=session.createQuery(sql_query);
		List<Product>list=query.list();
		session.close();
		log.debug("Ending of the Method getProduct");
		return list;
		
		
		
	}
	
	
	
	public Product getProductById(String productid) {
		log.debug("Starting of the Method getProductById");
		
		Session session=getSession();
		Product p=session.get(Product.class, productid);
		session.close();
		log.debug("Ending of the Method getProductById");
		return p;
		
	}

	public boolean updateProduct(Product product) {
		log.debug("Starting of the Method updateProduct");
		try {
			Session session=getSession();
			Transaction tx=session.beginTransaction();
			session.update(product);
			tx.commit();
			session.close();
			log.debug("Ending of the Method updateProduct");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.debug("Ending of the Method updateProduct");
			return false;
		}
		
	}

	public boolean deleteProduct(String productid) {
		/*Product pro = null;
		Session session = getSession();
		Transaction tx = session.beginTransaction();

		String sql_query = "from Product where productid=:productid";
		Query query = session.createQuery(sql_query);
		query.setParameter("productid", productid);
		List<Product> list = query.list();
		if (list.size() > 0) {
			pro = (Product) list.get(0);
		}*/
		log.debug("Starting of the Method deleteProduct");

		try {
			Session session=getSession();
			Transaction tx = session.beginTransaction();

			Product p=session.get(Product.class, productid);
			
			session.delete(p);
			tx.commit();
			session.close();
			log.debug("Ending of the Method deleteProduct");
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			log.debug("Ending of the Method deleteProduct");
			return false;
		}
		
		
		
	}

	public List<Product> getAllProduct() {
		log.debug("Starting of the Method getAllProduct");
		
		Session session=getSession();
		String sql_query="from Product";
		Query query=session.createQuery(sql_query);
		List<Product>list=query.list();
		session.close();
		log.debug("Ending of the Method getAllProduct");
		return list;
	}
	


	public List<Product> getAllProductByCategoryId(String categoryid) {
		log.debug("Starting of the Method getAllProductByCategoryId");
		Session session=getSession();
		String sql_query="from Product where categoryid=:categoryid";
		Query query=session.createQuery(sql_query);
		query.setParameter("categoryid", categoryid);
		List<Product>list=query.list();
		System.out.println("DAO Productdetails"+list);
		session.close();
		log.debug("Ending of the Method getAllProductByCategoryId");
		return list;
	}

}
