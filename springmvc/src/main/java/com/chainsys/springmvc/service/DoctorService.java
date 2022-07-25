package com.chainsys.springmvc.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.springmvc.dao.AppointmentRepository;
import com.chainsys.springmvc.dao.DoctorRepository;
import com.chainsys.springmvc.pojo.Appointments;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;

@Service
public class DoctorService {
	 @Autowired
	    private DoctorRepository repo;
	 @Autowired
	  private AppointmentRepository apprepo;
	  public List<Doctor> getDoctors(){
		 List<Doctor> listDr=repo.findAll();
		return listDr;
	 }
	 @Transactional
	 public Doctor save(Doctor dr) {
		 return repo.save(dr);
	 }
	 public Doctor findbyid(int id) {
		 return repo.findById(id);
	 }
	 @Transactional
	 public void deleteById(int id) {
		  repo.deleteById(id);
	 }
	 public DoctorAppointmentsDTO getDoctorAndAppointments(int id) {
		  Doctor dr=findbyid(id);
		  DoctorAppointmentsDTO dto=new  DoctorAppointmentsDTO();
		  dto.setDoctor(dr);
		  for(int i=0;i<=5;i++) {
			  Appointments app=new Appointments();
			  app.setAppointment_id(i);
		      Date dt=new Date(22,7,25);
		      app.setAppointment_date(dt);
		      app.setDoctor_id(id);
		      app.setPatient_name("jeru");
		      app.setFees_collected(i*500);
		      dto.addAppointments(app);
		  }
		  return dto;
	 }
public void addDoctorAndAppointments(DoctorAppointmentsDTO dto) {
	Doctor dr=dto.getDoctor();
	save(dr);
	List<Appointments> appointmentslist=dto.getAppointments();
	int count=appointmentslist.size();
	for(int i=0;i<=count;i++) {
		apprepo.save(appointmentslist.get(i));
	}
	}
public int getNextAppointmentIs() {
	return 0;
	
}
}
