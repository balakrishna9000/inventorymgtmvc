package com.dxctraining.inventorymgt;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.dto.CreatePhoneRequest;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.phone.entities.Phone;
import com.dxctraining.inventorymgt.phone.service.IPhoneService;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;




@Controller
public class PhoneController extends Item{
	 @Autowired
	    private IPhoneService phoneservice;
	 @Autowired
	    private ISupplierService supplierservice;
	 @PostConstruct
	    public void init(){
		Supplier supplier1=new Supplier("balu");
	        supplier1=supplierservice.add(supplier1);
	        Supplier supplier2=new Supplier("krishna");
	        supplier1=supplierservice.add(supplier2);
	        
	        Phone phone1=new Phone("dell",supplier1,2000);
	        phoneservice.add(phone1);
	        Phone phone2=new Phone("apple",supplier2,3000);
	        phoneservice.add(phone2);
	       
	    }
	  @GetMapping("/phone")
	    public ModelAndView phoneDetails(@RequestParam("id")int id){
	     Phone ph=phoneservice.findPhoneById(id);
	       ModelAndView modelAndView=new ModelAndView("details","phone",ph);
	       return modelAndView;
	    }
	  @GetMapping("/listallphones")
	    public ModelAndView all(){
	       List<Phone>values=phoneservice.allPhones();
	        ModelAndView modelAndView=new ModelAndView("phonelist","phones",values);
	        return modelAndView;
	    }
	  @PostMapping("/add")
	    @ResponseStatus(HttpStatus.CREATED)
	    public Phone create(@RequestBody CreatePhoneRequest requestData) {
	        String name = requestData.getName();
	        Supplier supplier= requestData.getSupplier();
	        int storageSize = requestData.getStorageSize();
	        Phone phone = new Phone(name, supplier,storageSize);
	        phone = phoneservice.add(phone);
	        return phone;
	  }

}
