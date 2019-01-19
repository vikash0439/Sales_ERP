package com.dwr;

import java.util.List;

import com.gem.GemForm;



public class ClientServiceImpl implements ClientService {
	
	ClientDaoImpl clientDao;

	public void setClientDao(ClientDaoImpl clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public void addClient(ClientForm clientForm) {
		// TODO Auto-generated method stub
		clientDao.addClient(clientForm);
	}


	@Override
	public List<Client> displayClient(ClientForm clientForm) {
		// TODO Auto-generated method stub
		return clientDao.displayClient(clientForm);
	}
	
	@Override
	public List<Client> displayLead(ClientForm clientForm, String bdename) {
		// TODO Auto-generated method stub
		return clientDao.displayLead(clientForm, bdename);
	}

	@Override
	public void editClient(ClientForm clientForm) {
		// TODO Auto-generated method stub
		clientDao.editClient(clientForm);
	}

	@Override
	public ClientForm findClient(int id) {
		return clientDao.findEmployee(id);
	}

	public boolean checkLogin(String emailid, String password){
        System.out.println("In Service class...Check Login "+emailid+" && "+password);
        return clientDao.checkLogin(emailid, password);
    }

	public String getName(String emailid) {
		// TODO Auto-generated method stub
		return clientDao.getName(emailid);
	}


	public void addGem(GemForm gemForm) {
		// TODO Auto-generated method stub
		clientDao.addGem(gemForm);
	}


	public void editGem(GemForm gemForm) {
		// TODO Auto-generated method stub
		clientDao.editGem(gemForm);
	}
	
	public List<Client> displayGem() {
		// TODO Auto-generated method stub
		return clientDao.displayGem();
	}
	
	public GemForm findGem(int id) {
		return clientDao.findGem(id);
	}
	
	public List<String> getState() {
		// TODO Auto-generated method stub
		return clientDao.getState();
	}
}