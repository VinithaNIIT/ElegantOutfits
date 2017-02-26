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


import com.niit.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	private static Logger log=LoggerFactory.getLogger(SupplierDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.openSession();
	}

	public boolean insertSupplier(Supplier supplier) {
		log.debug("Starting of the Method insertSupplier");
		try {
			/*if(get(supplier.getSupplierid()!=null))
			{
				return false;
			}*/
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(supplier);
			tx.commit();
			// Serializable id = session.getIdentifier(supplier);
			session.close();
			log.debug("Ending of the Method insertSupplier");
			return true;
			// return (Integer) id;
		} catch (Exception e) {
			
			e.printStackTrace();
			log.debug("Ending of the Method insertSupplier");
			return false;
		}

	}


	public List<Supplier> getSupplier() {
		log.debug("Starting of the Method getSupplier");
		Session session = getSession();
		// Transaction tx = session.beginTransaction();
		String s = "from Supplier";
		Query query = session.createQuery(s);
		List<Supplier> l = query.list();
		// tx.commit();
		session.close();
		log.debug("Ending of the Method getSupplier");
		return l;
	}

	public Supplier getSupplierById(String supplierid) {
		log.debug("Staring of the Method getSupplierById");
		
		Session session = getSession();
		//Transaction tx=session.beginTransaction();
		 Supplier s=session.get(Supplier.class,supplierid);
		
		
		session.close();
		log.debug("Ending of the Method getSupplierById");
		return s;
	}

	public boolean updateSupplier(Supplier supplier) {
		log.debug("Starting of the Method updateSupplier");
		try {
			/*if(get(supplier.getSupplierid()==null))
			{
				return false;
			}*/
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(supplier);
			tx.commit();
			session.close();
			log.debug("Ending of the Method updateSupplier");
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			log.debug("Ending of the Method updateSupplier");
			return false;
		}

	}

	public boolean deleteSupplier(String supplierid) {
		log.debug("Starting of the Method deleteSupplier");
		
		try {
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			Supplier s=session.load(Supplier.class, supplierid);
			session.delete(s);
			tx.commit();
			session.close();
			log.debug("Ending of the Method deleteSupplier");
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.debug("Ending of the Method deleteSupplier");
			return false;
		}

	}

	public List<Supplier> getSupplierList() {
		log.debug("Starting of the Method getSupplierList");
		Session session=getSession();
		//Transaction tx=session.beginTransaction();
		String sqlquery="select supplierid from Supplier";
		Query query=session.createQuery(sqlquery);
		
		List<Supplier>li=query.list();
		System.out.println("supplierLIST method"+li);
		log.debug("Ending of the Method getSupplierList");
		return li;
		
	}

}
