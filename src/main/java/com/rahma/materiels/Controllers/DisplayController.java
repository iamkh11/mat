package com.rahma.materiels.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
	
	
	
	 @RequestMapping(path="/dashboard")
	    public String getContact(Model model){
	    
	    
	    // return view 
	    return "dashboard" ;
	                    
	    }
	 
	 @RequestMapping(path="/ajout")
	    public String AddMateriel(Model model){
	    
	    
	    // return view 
	    return "ajout" ;
	                    
	    }
	 
	 @RequestMapping(path="/edit")
	    public String EditMateriel(Model model){
	    
	    
	    // return view 
	    return "edit" ;
	                    
	    }
}
