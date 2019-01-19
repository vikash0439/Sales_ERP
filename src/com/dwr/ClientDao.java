package com.dwr;

import java.util.List;

import com.gem.GemForm;



public interface ClientDao {
	public void addClient(ClientForm clientForm);
	public List<Client> displayClient(ClientForm clientForm);
	public void editClient(ClientForm clientForm);
	public boolean checkLogin(String emailid, String password);
//	public void addGem(GemForm gemForm);
//	public void editGem(GemForm gemForm);
}