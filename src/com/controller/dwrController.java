package com.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dwr.ClientForm;
import com.dwr.ClientServiceImpl;
import com.gem.GemForm;
import com.login.loginForm;

@Controller
@SessionAttributes({"bdename","emailid"})
public class dwrController {
	
	@Autowired
	ClientServiceImpl service;
	
	/* Login Portal */
	@RequestMapping("/user")
	public ModelAndView loginPage(Map model, loginForm loginForm ) {
		model.put("loginForm", loginForm);		 
		  return new ModelAndView("user");		  
	}
	
	@RequestMapping("/login")
	public String welcome(@RequestParam String emailid, @Valid loginForm loginForm, BindingResult result, Map model, HttpServletRequest request) throws IOException {		
		if (result.hasErrors()) {
			return "user";
		}
		model.put("emailid", emailid);	
		String bdename="null";
		try{
		bdename=service.getName(emailid);
		}catch(Exception e){
			System.out.println("No name found");
		}
		System.out.println("Name in session added: "+bdename);
		model.put("bdename", bdename);
		boolean userExists = service.checkLogin(loginForm.getEmailid(),loginForm.getPassword());
		if(userExists){
			if(emailid.equals("sales@proxkey.in")){
				return "redirect:/dashboard";
			}else if(emailid.equals("support@dsc.expert")){
				return "redirect:/GemPortal";
			}else
			    return "redirect:/dwr";
		}else{
			result.rejectValue("emailid","invaliduser");
		    return "redirect:/login";	   
		}
   }	
	
	@RequestMapping("/dashboard")
	public ModelAndView loginPage() {
			 
		  return new ModelAndView("dashboard");
		  
	}
	
	@RequestMapping("/sales")
	public String loadForm(Map model, ClientForm clientForm, BindingResult result, HttpServletRequest request) {
		model.put("clientForm", clientForm);
		HttpSession session = request.getSession(false);
		Object v = session.getAttribute ("emailid");
		if(v == null){
			return "redirect:/user";
		}else{
			model.put("client", service.displayClient(clientForm));
				return "sales";
       }
	}
	
	@RequestMapping("/dwr")
	public String loadEmployeeForm(Map model, ClientForm clientForm, BindingResult result, HttpServletRequest request) {
		model.put("clientForm", clientForm);
		HttpSession session = request.getSession(false);
		Object v = session.getAttribute ("emailid");
		if(v == null){
			return "redirect:/user";
		}else{
				return "dwr";
       }
	}
	
	/* Add new lead */
	@RequestMapping("/lead")
	public String saveClient(Map model, @Valid ClientForm clientForm, BindingResult result, HttpServletRequest request) {		
			if (result.hasErrors()) {
				return "dwr";
			}else {
				if (clientForm.getId() >= 0) {		
					System.out.println("From editClient :" +clientForm.getId());
					service.editClient(clientForm);
				} else {
					System.out.println("From addClient :" +clientForm.getId());
					service.addClient(clientForm);
				}
				return "redirect:/display";
			}		
	 }
	
	/* Display lead record */
	@RequestMapping("/display")
	public ModelAndView displayForm(Map model, ClientForm clientForm, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		Object v = session.getAttribute ("emailid");
		String bdename = (String) session.getAttribute ("bdename");
		if(v == null){			
			return new ModelAndView("redirect:/user");
		}else{
			model.put("client", service.displayLead(clientForm, bdename));
			return new ModelAndView("displayDwr");
       }   
	}
	
	/* Edit record of lead */
	@RequestMapping("/editlead")
	public String searchForEdit(Map model, ClientForm clientForm,HttpServletRequest request) {
		model.put("clientForm", service.findClient(new Integer(request.getParameter("id"))));
		return "dwr";
	}
	
	/* Edit record of lead */
	@RequestMapping("/logout")
	public String searchLogout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		if (request.isRequestedSessionIdValid() && session != null) {
		session.invalidate();
		}
		return "redirect:/user";
	}

	/* Edit record of lead */
	@RequestMapping("/GemPortal")
	public ModelAndView GemPortal(Map model, GemForm gemForm) {
		List list= service.getState();
		return new ModelAndView ("GemPortal", "state", list);
	}
	
	@RequestMapping("/gemdetail")
	public String saveGem(Map model, @Valid GemForm gemForm, BindingResult result, HttpServletRequest request) {		
			if (result.hasErrors()) {
				return "GemPortal";
			}else {
				if (gemForm.getId() >= 0) {		
					System.out.println("From editClient :" +gemForm.getId());
					System.out.println("From editClient :" +gemForm.getGemorderid());
					System.out.println("From editClient :" +gemForm.getBdename());
					service.editGem(gemForm);
				} else {
					System.out.println("From addClient :" +gemForm.getId());
					System.out.println("From addClient :" +gemForm.getBdename());
					service.addGem(gemForm);
				}
				return "redirect:/displayGem";
			}		
	 }
	
	/* Display lead record */
	@RequestMapping("/displayGem")
	public ModelAndView displayGem(Map model, GemForm gemForm, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		Object v = session.getAttribute ("emailid");
		String bdename = (String) session.getAttribute ("bdename");
		if(v == null){			
			return new ModelAndView("redirect:/user");
		}else{
			model.put("gem", service.displayGem());
			return new ModelAndView("displayGem");
       }   
	}
	
	/* Edit record of lead */
	@RequestMapping("/editgem")
	public ModelAndView searchGem(Map model, GemForm gemForm,HttpServletRequest request) {
		model.put("gemForm", service.findGem(new Integer(request.getParameter("id"))));
		List list= service.getState();
		return new ModelAndView ("GemPortal", "state", list);
	}
	
}	
