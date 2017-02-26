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
import com.niit.model.Cart;


@Repository("CartDAO")
public class CartDAOImpl implements CartDAO {

	private static Logger log = LoggerFactory.getLogger(CartDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	ProductDAOImpl productDAOImpl;

	public Session getSession() {
		return sessionFactory.openSession();
	}

	public List<Cart> cartList(String username) {
		log.debug("Starting of the Method cartList");
		List<Cart> list = null;
		Session session = getSession();
		String hql = "from Cart where username=:username ";

		Query query = session.createQuery(hql);
		query.setParameter("username", username);
		list = (List<Cart>) query.list();
		// Long gtotal=getTotalAmount(username);
		session.close();
		log.debug("Ending of the Method cartList");
		return list;
	}

	public void insertCart(Cart cart) {
		log.debug("Starting of the Method insertCart");
		try {
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			cart.setStatus('N');
			System.out.println("Save Method CARTDAOIMPL" + cart);
			session.saveOrUpdate(cart);
			tx.commit();
			session.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
		log.debug("Ending of the Method insertCart");

	}
	/*
	 * public void insertProductInCart(String productid,int qty,String username)
	 * {
	 * 
	 * log.debug("Starting of the Method insertProductInCart"); try { Session
	 * session = getSession(); Transaction tx = session.beginTransaction();
	 * Product p= productDAOImpl.getProductById(productid); Cart c=new Cart();
	 * c.setCartid(getMaxId()); c.setProductid(p.getProductid());
	 * c.setProductname(p.getProductname()); c.setPrice(p.getProductprice());
	 * c.setStatus('N'); c.setQuantity(qty); c.setUser(username); //DateFormat
	 * df = new SimpleDateFormat("dd/MM/yy HH:mm:ss"); Date dateobj = new
	 * Date();
	 * 
	 * c.setDate_added(dateobj); System.out.println("CART VALUES "+c);
	 * session.save(c); tx.commit(); session.close(); } catch (Exception e) {
	 * 
	 * e.printStackTrace(); } log.debug(
	 * "Ending of the Method insertProductInCart");
	 * 
	 * }
	 */

	public void updateCart(Cart cart) {
		log.debug("Starting of the Method updateCart");
		try {
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			session.update(cart);
			tx.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.debug("Ending of the Method updateCart");

	}

	/*public void deleteCart(String productid) {
		log.debug("Starting of the Method deleteCart");
		try {
			Session session = getSession();
			Transaction tx = session.beginTransaction();
			Cart c = session.get(Cart.class, productid);

			session.delete(c);
			tx.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.debug("Ending of the Method deleteCart");

	}
*/
	
	public void deleteCart(String productid){
		log.debug("Starting of the Method deleteCart");
		
		Session session = getSession();
		String hql = "delete from Cart where productid=:productid ";

		Query query = session.createQuery(hql);
		query.setParameter("productid", productid);
		query.executeUpdate();
		// Long gtotal=getTotalAmount(username);
		session.close();
		log.debug("Ending of the Method deleteCart");
		
	}
	
	
	
	public Long getMaxId() {
		log.debug("Starting of the Method getMaxId");
		Long maxid = 100L;
		try {
			Session session = getSession();
			Transaction tx = session.beginTransaction();

			String hql = "select Max(cartid) from Cart";
			Query query = session.createQuery(hql);
			maxid = (Long) query.uniqueResult();
			tx.commit();
			session.close();
		} catch (Exception e) {
			log.debug("It seems this is the first record.Setting initial Id is 100:");
			maxid = 100L;
			e.printStackTrace();
		}
		log.debug("MaxId:" + maxid);
		return maxid + 1;
	}

	public Long getTotalAmount(String username) {
		log.debug("Starting of the method getTotalAmount");
		Long sum = 0L;
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		/*
		 * Criteria ct=session.createCriteria(Cart.class);
		 * ct.setProjection(Projections.sum("price"));
		 */
		String hql = "select sum(price*quantity)as total from Cart where username=:username";
		Query query = session.createQuery(hql);
		query.setParameter("username", username);

		sum = (Long) query.uniqueResult();
		log.debug("GrandTotal:" + sum);
		tx.commit();
		session.close();
		log.debug("Ending of the method getTotalAmount");

		return sum;
	}

}
