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
import com.niit.model.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	private static Logger log=LoggerFactory.getLogger(CategoryDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.openSession();
	}

	/* @Transactional */
	public boolean insertCategory(Category category) {
		log.debug("Starting of the Method insertCategory");
		try {
			

			Session session = getSession();
			Transaction tx = session.beginTransaction();

			session.save(category);

			tx.commit();
			session.close();
			log.debug("Ending of the Method insertCategory");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		

	}

	public List<Category> getCategory() {
		log.debug("Starting of the Method getCategory");
		List<Category> list=null;
		try {
			
			Session session = getSession();
			String sql_query = "from Category";
			Query query = session.createQuery(sql_query);
			 list = query.list();
			session.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.debug("Ending of the Method getCategory");
		return list;
	}

	public Category getCategoryById(String categoryid) {
		/*
		 * Category c = null; Session session = getSession();
		 * 
		 * String sql_query1 = "from Category where categoryid=:categoryid";
		 * Query query = session.createQuery(sql_query1);
		 * query.setParameter("categoryid", categoryid); List<Category> l =
		 * query.list(); if (l.size() > 0) { c = (Category) l.get(0); }
		 * 
		 * // session.close(); return c;
		 */
		log.debug("Starting of the Method getCategoryById");
		Session session = getSession();
		Category c = session.get(Category.class, categoryid);

		session.close();
		log.debug("Ending of the Method getCategoryById");
		return c;
	}

	public boolean updateCategory(Category category) {
		log.debug("Starting of the Method updateCategory");
		try {
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(category);
			tx.commit();
			session.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.debug("Ending of the Method updateCategory");
			return false;
		}

	}

	public boolean deleteCategory(String categoryid) {
		/*
		 * Category ca = null; Session session = getSession(); Transaction tx =
		 * session.beginTransaction(); String sqlquery =
		 * "from Category where categoryid=:categoryid"; Query query =
		 * session.createQuery(sqlquery); query.setParameter("categoryid",
		 * categoryid); List<Category> li = query.list(); if (li.size() > 0) {
		 * ca = (Category) li.get(0); } session.delete(ca); tx.commit();
		 * session.close();
		 */
		log.debug("Starting of the Method deleteCategory");
		try {
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			Category c = session.get(Category.class, categoryid);
			System.out.println("Delete method:"+c);
			session.delete(c);
			System.out.println("deleteMethod1:"+c);
			tx.commit();
			session.close();
			log.debug("Ending of the Method deleteCategory");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			
		}
		

	}

	public List<Category> getCategoryList() {
		log.debug("Starting of the Method getCategoryList");
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		String sqlquery = "select categoryid from Category";
		Query query = session.createQuery(sqlquery);

		List<Category> li = query.list();
		System.out.println("categoryLIST method" + li);
		log.debug("Ending of the Method getCategoryList");
		return li;
	}

}
