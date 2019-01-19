
package com.dwr;

import java.util.List;

import com.gem.GemForm;




public interface ClientService{
	
	public void addClient(ClientForm clientForm);
	public List<Client> displayClient(ClientForm clientForm);
	public void editClient(ClientForm clientForm);
	public ClientForm findClient(int id);
	public boolean checkLogin(String emailid, String password);
	List<Client> displayLead(ClientForm clientForm, String bdename);
//	public void addGem(GemForm gemForm);
//	public void editGem(GemForm gemForm);
}