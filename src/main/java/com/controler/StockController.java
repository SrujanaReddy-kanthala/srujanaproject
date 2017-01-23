package com.controler;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pogostock.StockDetails;




@Controller
public class StockController {
	@RequestMapping(value="/save", method = RequestMethod.POST)  
	 public ModelAndView save(@RequestParam String custname,@RequestParam String custid,@RequestParam String stockid,@RequestParam String stockqty,@RequestParam String rate,Model model)
	 {
		System.out.println(custname+"  "+custid+"  "+stockid+"  "+stockqty+"  "+rate);
		
		StockDetails s=new StockDetails();
		
		
		s.setCustname(custname);
		s.setCustid(custid);
		s.setStockid(stockid);
		s.setStockqty(stockqty);
		s.setRate(rate);
		SessionFactory sf= new AnnotationConfiguration().configure("hibernet.cfg.xml").buildSessionFactory();
		Session session=sf.openSession();
		
		System.out.println("session is: "+session);
		
		Transaction beginTransaction = session.beginTransaction();
		
		session.save(s);
		
		beginTransaction.commit();
		
		System.out.println("Helo am in save method");
		

		if (custname != null && !custname.isEmpty()) {
			model.addAttribute("message", "successfully inserted");
			model.addAttribute("s", s);
		} else {
			model.addAttribute("message", "failed to  insert, name, salary should be not null");
		}
	
ModelAndView model1 = new ModelAndView("success");
		
		return  model1; 
		
	 }
		
		@RequestMapping(value="/getAlldetls", method = RequestMethod.POST)
		public String getAllDeatils(Model model){
			
			
			
			
			
			StockDetails s1=new StockDetails();
			
			s1.setCustname("fhgnbu");
			s1.setCustid("125");
			s1.setStockid("58");
			s1.setStockqty("58");
			s1.setRate("1254");
			
			
StockDetails s2=new StockDetails();
			
s2.setCustname("mkji");
			s2.setCustid("125");
			s2.setStockid("56");
			s2.setStockqty("55");
			s2.setRate("1264");
			
StockDetails s3=new StockDetails();
			
			s3.setCustname("ljuyh");
			s3.setCustid("156");
			s3.setStockid("56");
			s3.setStockqty("59");
			s3.setRate("1298");
			
			List<StockDetails> list = new ArrayList<StockDetails>();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			System.out.println("getall details");
			//System.out.println(list);
			model.addAttribute("StockDetail", list);
		model.addAttribute("custname", "My name");
			return "result";
			
		}

		@RequestMapping(value="/deletedet/{custname}", method=RequestMethod.GET)
		public String deleteEmployee(@PathVariable String custname){
			System.out.println("Deleting record is : " + custname);
			//hibernate to delete record from database
			return "dele_result";
		}

		@RequestMapping(value="/deleteIt", method = RequestMethod.POST)  
		 public ModelAndView delete(){
			
			System.out.println("Helo am in delet method");
			ModelAndView model2 = new ModelAndView("deleteIt");
			
			return model2; 
			
		}
}
			
		
		
		
		
		
		
		
		
			
		
		
	 
	

