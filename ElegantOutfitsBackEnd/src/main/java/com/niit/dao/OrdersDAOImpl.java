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
import com.niit.model.BillingAddress;
import com.niit.model.Cart;
import com.niit.model.Orders;
import com.niit.model.ShippingAddress;

@Repository("orderDAO")
public class OrdersDAOImpl implements OrdersDAO {
	private static Logger log=LoggerFactory.getLogger(CartDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession()
	{
		return sessionFactory.openSession();
	}

	public void insertOrder(Orders order) {
		log.debug("Starting of the OrdersDAO Method insertOrder");
		try {
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(order);
			System.out.println("Insertorder order DAO"+order);
			tx.commit();
			session.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		log.debug("Ending of the OrdersDAO Method  insertOrder");
		
		
		
	}

	public void insertShippingAddress(ShippingAddress shippingaddress) {
		log.debug("Starting of the OrdersDAO Method  insertShippingAddress");
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.save(shippingaddress);
		tx.commit();
		session.close();
		log.debug("Ending of the OrdersDAO Method  insertShippingAddress");
	}

	public void insertBillingAddress(BillingAddress billingaddress) {
		log.debug("Starting of the OrdersDAO Method  insertBillingAddress");
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.save(billingaddress);
		tx.commit();
		session.close();
		log.debug("Ending of the OrdersDAO Method  insertBillingAddress");
		
	}
	
	public ShippingAddress getShippingByUsername(String username) {
		log.debug("Starting of the Method getShippingByUsername");
		
		Session session=getSession();
		Query q=session.createQuery("from ShippingAddress where username=:username");
		//ShippingAddress shipping=session.get(ShippingAddress.class, username);
		q.setParameter("username", username);
		List<ShippingAddress> list=q.list();
		ShippingAddress shipping=list.get(0);
		session.close();
		log.debug("Ending of the Method getShippingByUsername");
		return shipping;
		
	}
	public BillingAddress getBillingByUsername(String username) {
		log.debug("Starting of the Method getBillingByUsername");
		
		Session session=getSession();
		Query q=session.createQuery("from BillingAddress where username=:username");
		q.setParameter("username", username);
		List<BillingAddress>list=q.list();
		BillingAddress billing=list.get(0);
		session.close();
		log.debug("Ending of the Method getBillingByUsername");
		return billing;
		
	}

	public Cart getCartByUsername(String username) {
log.debug("Starting of the Method getCartByUsername");
		
		Session session=getSession();
		Query q=session.createQuery("from Cart where username=:username");
		q.setParameter("username", username);
		List<Cart>list=q.list();
		Cart cart=list.get(0);
		session.close();
		log.debug("Ending of the Method getCartByUsername");
		return cart;
	}

	public List<Orders> orderList(String username) {
		log.debug("Starting of the Method orderList");
		List<Orders> list = null;
		Session session = getSession();
		String hql = "select orderid from Orders where username=:username ";
		Query query = session.createQuery(hql);
		query.setParameter("username", username);
		list = (List<Orders>) query.list();
		
		session.close();
		log.debug("Ending of the Method orderList");
		return list;
	}

	public List<ShippingAddress> shippingAddressList(String username) {
		log.debug("Starting of the Method shippingAddressList in DAOImpl");
		Session session=getSession();
		String sqlquery="from ShippingAddress where username=:username";
		Query query=session.createQuery(sqlquery);
		query.setParameter("username", username);
		List<ShippingAddress>li=query.list();
		System.out.println("shippingAddressList method"+li);
		log.debug("Ending of the Method shippingAddressList in DAOImpl");
		return li;
	}

	public List<BillingAddress> billingAddressList(String username) {
		log.debug("Starting of the Method billingAddressList in DAOImpl");
		Session session=getSession();
		String sqlquery="from BillingAddress where username=:username";
		Query query=session.createQuery(sqlquery);
		query.setParameter("username", username);
		List<BillingAddress>li=query.list();
		System.out.println("billingAddressList method"+li);
		log.debug("Ending of the Method billingAddressList in DAOImpl");
		return li;
	}

}
