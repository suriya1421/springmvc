package com.chainsys.springmvc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chainsys.springmvc.pojo.Appointments;

public interface AppointmentRepository extends CrudRepository< Appointments ,Integer> {
	 Appointments findById(int id);//find by id la query generate agum
	 Appointments save( Appointments app);
	//used for adding a new doctor and modifying new doctor
	void deleteById(int dr_id);
	List< Appointments > findAll();
	//define the native quary for this method
	int getnextid();
	
}


