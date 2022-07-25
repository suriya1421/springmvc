package com.chainsys.springmvc.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.chainsys.springmvc.dao.DoctorRepository;
import com.chainsys.springmvc.dao.EmployeeDao;
import com.chainsys.springmvc.pojo.Appointments;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.service.DoctorService;
@Controller
@RequestMapping("/doctor")

public class DoctorController
{   @Autowired
   DoctorService drservice;
@GetMapping("/list")
public String getAllDoctor(Model model) {
	List<Doctor> doclist = drservice.getDoctors();
	model.addAttribute("alldoctor",doclist);
	return "list-doctors";
}
    @GetMapping("/getdoctor")
    public String getDoctor(@RequestParam("id") int id,Model model){
    	Doctor dr= drservice.findbyid(id);
    	model.addAttribute("finddoctorbyid",dr );
        return "find-doctor-by-id";
    }
    @GetMapping("/adddoctor")
   	public String showAddForm(Model model) {
   	Doctor dr=new Doctor();
   	model.addAttribute("adddoctor",dr);
   	return "add-doctor-form";

   	}
    @PostMapping("/adddoc")
	public String addNewDoctor1(@ModelAttribute("adddoctor") Doctor theDoc) {
		drservice.save(theDoc);
		return "redirect:/doctor/list";
	}
    
    @GetMapping("/updateform")
	public String showUpdateForm(@RequestParam("docid")int id,Model model){

	Doctor thedoc=drservice.findbyid(id);
	model.addAttribute("updatedoctor",thedoc);
	return "update-doctor-form";
	
	}

    @PostMapping("/updatedoc")
	public String updateEmployees(@ModelAttribute("updatedoctor") Doctor thedoc) {
		drservice.save(thedoc);
		return "redirect:/doctor/list";
}
    @GetMapping("/deletedoctor")
	public String deletedoctor(@RequestParam("docid") int id) {
		drservice.deleteById(id);
		return "redirect:/doctor/list";
    }
    @GetMapping("/getdocapp")
    public String getAppointments(@RequestParam("id")int id,Model model) {
    	DoctorAppointmentsDTO dto=drservice.getDoctorAndAppointments(id);
    	model.addAttribute("getdoc",dto.getDoctor());
    	model.addAttribute("applist",dto.getAppointments());
    	return "list-doctor-appointment";
    }
    //localhost:8080
    @GetMapping("/trans")
    public void testTransaction(@RequestParam("id")int id)
    {
    	DoctorAppointmentsDTO dto=new DoctorAppointmentsDTO();
    	Doctor dr=new Doctor();
    	dr.setDoctor_id(id);
    	dr.setDoctor_name("shivu");
    	dr.setDob(null);
    	Date drdob=new Date(94,7,25);
    	dr.setDob(drdob);
    	dr.setCity("trichy");
    	dr.setPhone_no(1234567898);
    	dr.setSpeciality("allegist");
    	dr.setStandard_fees(5000);
    	dto.setDoctor(dr);
    	List<Appointmnts> applist= new ArrayList<Appointments>();
    	e
    	for(int i=200;i<=202;i++) {
			  Appointments app=new Appointments();
			  app.setAppointment_id(i);
		      Date appdt=new Date(22,7,25);
		      app.setAppointment_date(appdt);
		      app.setDoctor_id(id);
		      app.setPatient_name("jeru");
		      app.setFees_collected(dr.getStandard_fees());
		      dto.addAppointments(app);
		  }
    	 drservice.addDoctorAndAppointments(dto);
    	 System.out.print("successfully completed");
    }


	}
    