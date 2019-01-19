package com.dwr;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.gem.Gem;
import com.gem.GemForm;

public class ClientDaoImpl implements ClientDao {
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addClient(ClientForm clientForm) {
		Client client = new Client();
		client.setId(clientForm.getId());
		client.setBdename(clientForm.getBdename());
		client.setDate(clientForm.getDate());
		client.setName(clientForm.getName());
		client.setPhone(clientForm.getPhone());
		client.setEmail(clientForm.getEmail());
		client.setAddress(clientForm.getAddress());
		client.setCompany(clientForm.getCompany());
		client.setRemark(clientForm.getRemark());
		sessionFactory.openSession().saveOrUpdate(clientForm);
		sessionFactory.close();
	}

	public List<Client> displayClient(ClientForm clientForm) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Client.class);
		List<Client> clients = new ArrayList<Client>();
		clients = criteria.list();	
		session.close();
		return clients;
	}
	
	public List<Client> displayLead(ClientForm clientForm, String bdename) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Client.class);
		criteria.add(Restrictions.eq("bdename", bdename));
		List<Client> clients = new ArrayList<Client>();
		clients = criteria.list();	
		session.close();
		return clients;
	}
	
	public List<Client> displayEdit(int id) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Client.class);
		criteria.add(Restrictions.eq("id", id));
		List<Client> clients = new ArrayList<Client>();
		clients = criteria.list();	
		session.close();
		return clients;
	}

	public void editClient(ClientForm clientForm) {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.setId(clientForm.getId());
		client.setBdename(clientForm.getBdename());
		client.setDate(clientForm.getDate());
		client.setName(clientForm.getName());
		client.setPhone(clientForm.getPhone());
		client.setEmail(clientForm.getEmail());
		client.setAddress(clientForm.getAddress());
		client.setCompany(clientForm.getCompany());
		client.setRemark(clientForm.getRemark());
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.merge(client);
		tx.commit();
		session.close();		
	}

	public ClientForm findEmployee(int id) {
		Session session = sessionFactory.openSession();
		String sql = "select l from Client l where l.id=" + id;
		Query query = session.createQuery(sql);
		Client client = (Client) query.list().get(0);
		ClientForm clientForm = new ClientForm();
		clientForm.setId(client.getId());
		clientForm.setBdename(client.getBdename());
		clientForm.setName(client.getName());
		clientForm.setPhone(client.getPhone());
		clientForm.setEmail(client.getEmail());
		clientForm.setAddress(client.getAddress());
		clientForm.setRemark(client.getRemark());
		clientForm.setCompany(client.getCompany());
		session.close();
		return clientForm;
	}
	
	public boolean checkLogin(String emailid, String password){
		System.out.println("In Check login "+emailid+password);
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY ="from Login where emailid=? and password=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,emailid);
		query.setParameter(1,password);
		List list = query.list();
		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}else{
			System.out.println("username and password not found from ClientDaoImpl");
		}
		session.close();
		return userFound;              
     }

	public String getName(String emailid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		String SQL_QUERY ="Select name from Login where emailid=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,emailid);
		List list = query.list();
		Object name=list.get(0);
		System.out.println("From Dao Implemtataion " +name);
		session.close();
		return (String) name;
	}	
	
	
	public void addGem(GemForm gemForm) {
		Gem gem = new Gem();
		gem.setId(gemForm.getId());
		gem.setD(gemForm.getD());
		gem.setBdename(gemForm.getBdename());
		gem.setGemorderid(gemForm.getGemorderid());
		gem.setOrdersummary(gemForm.getOrdersummary());
		gem.setAdd1(gemForm.getAdd1());
		gem.setCity(gemForm.getCity());
		gem.setContact1(gemForm.getContact1());
		gem.setContact2(gemForm.getContact2());
		gem.setContactno(gemForm.getContactno());
		gem.setContactperson(gemForm.getContactperson());
		gem.setDate(gemForm.getDate());
		gem.setEmail(gemForm.getEmail());
		gem.setName(gemForm.getName());
		gem.setPin(gemForm.getPin());
		gem.setState(gemForm.getState());
		gem.setInvoiceno(gemForm.getInvoiceno());
		gem.setInvoicedate(gemForm.getInvoicedate());
		gem.setCourier(gemForm.getCourier());
		gem.setDispatch(gemForm.getDispatch());
		gem.setAwb(gemForm.getAwb());
		gem.setMode(gemForm.getMode());
		gem.setDstatus(gemForm.getDstatus());
		gem.setDdate(gemForm.getDdate());
		gem.setConfirm(gemForm.getConfirm());
		gem.setAccepted(gemForm.getAccepted());
		gem.setRecieved(gemForm.getRecieved());
		gem.setPmode(gemForm.getPmode());
		gem.setPrecieveddate(gemForm.getPrecieveddate());
		gem.setStatus(gemForm.getStatus());
		gem.setNo(gemForm.getNo());
		gem.setAmount(gemForm.getAmount());
		gem.setRemark(gemForm.getRemark());
		sessionFactory.openSession().saveOrUpdate(gem);
		sessionFactory.close();
	}
	
	public void editGem(GemForm gemForm) {
		// TODO Auto-generated method stub
		Gem gem = new Gem();
		gem.setId(gemForm.getId());
		gem.setD(gemForm.getD());
		gem.setBdename(gemForm.getBdename());
		gem.setGemorderid(gemForm.getGemorderid());
		gem.setOrdersummary(gemForm.getOrdersummary());
		gem.setAdd1(gemForm.getAdd1());
		gem.setCity(gemForm.getCity());
		gem.setContact1(gemForm.getContact1());
		gem.setContact2(gemForm.getContact2());
		gem.setContactno(gemForm.getContactno());
		gem.setContactperson(gemForm.getContactperson());
		gem.setDate(gemForm.getDate());
		gem.setEmail(gemForm.getEmail());
		gem.setName(gemForm.getName());
		gem.setPin(gemForm.getPin());
		gem.setState(gemForm.getState());
		gem.setInvoiceno(gemForm.getInvoiceno());
		gem.setInvoicedate(gemForm.getInvoicedate());
		gem.setCourier(gemForm.getCourier());
		gem.setDispatch(gemForm.getDispatch());
		gem.setAwb(gemForm.getAwb());
		gem.setMode(gemForm.getMode());
		gem.setDstatus(gemForm.getDstatus());
		gem.setDdate(gemForm.getDdate());
		gem.setConfirm(gemForm.getConfirm());
		gem.setAccepted(gemForm.getAccepted());
		gem.setRecieved(gemForm.getRecieved());
		gem.setPmode(gemForm.getPmode());
		gem.setPrecieveddate(gemForm.getPrecieveddate());
		gem.setStatus(gemForm.getStatus());
		gem.setNo(gemForm.getNo());
		gem.setAmount(gemForm.getAmount());
		gem.setRemark(gemForm.getRemark());
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.merge(gem);
		tx.commit();
		session.close();		
	}
	
	public List<Client> displayGem() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Gem.class);
		List<Client> gems = new ArrayList<Client>();
		gems = criteria.list();		
		session.close();
		return gems;
	}
	
	public GemForm findGem(int id) {
		Session session = sessionFactory.openSession();
		String sql = "select l from Gem l where l.id=" + id;
		Query query = session.createQuery(sql);
		Gem gem = (Gem) query.list().get(0);
		GemForm gemForm = new GemForm();
		gemForm.setAdd1(gem.getAdd1());
		gemForm.setGemorderid(gem.getGemorderid());
		gemForm.setCity(gem.getCity());
		gemForm.setContact1(gem.getContact1());
		gemForm.setContact2(gem.getContact2());
		gemForm.setContactno(gem.getContactno());
		gemForm.setContactperson(gem.getContactperson());
		gemForm.setDate(gem.getDate());
		gemForm.setEmail(gem.getEmail());
		gemForm.setId(gem.getId());
		gemForm.setName(gem.getName());
		gemForm.setOrdersummary(gem.getOrdersummary());
		gemForm.setPin(gem.getPin());
		gemForm.setState(gem.getState());	
		gemForm.setInvoiceno(gem.getInvoiceno());
		gemForm.setInvoicedate(gem.getInvoicedate());
		gemForm.setCourier(gem.getCourier());
		gemForm.setDispatch(gem.getDispatch());
		gemForm.setAwb(gem.getAwb());
		gemForm.setMode(gem.getMode());
		gemForm.setDstatus(gem.getDstatus());
		gemForm.setDdate(gem.getDdate());
		gemForm.setConfirm(gem.getConfirm());
		gemForm.setAccepted(gem.getAccepted());
		gemForm.setRecieved(gem.getRecieved());
		gemForm.setPmode(gem.getPmode());
		gemForm.setPrecieveddate(gem.getPrecieveddate());
		gemForm.setStatus(gem.getStatus());
		gemForm.setNo(gem.getNo());
		gemForm.setAmount(gem.getAmount());
		gemForm.setRemark(gem.getRemark());
		session.close();
		return gemForm;
   }
	
	public List<String> getState() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		String SQL_QUERY ="Select state from dropdown";
		Query query = session.createQuery(SQL_QUERY);
		List list = query.list();
		Object state=list.get(0);
		System.out.println("From Dao Implemtataion " +state);
		session.close();
		return list;
	}
	
}