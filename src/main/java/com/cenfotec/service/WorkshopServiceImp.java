package com.cenfotec.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cenfotec.domain.Workshop;
import com.cenfotec.repo.WorkshopRepository;

@Service
public class WorkshopServiceImp implements WorkshopService{
	@Autowired
	WorkshopRepository repo;
	
	@Override
	public void save(Workshop whorkshop) {
		repo.save(whorkshop);
	}

	@Override
	public Optional<Workshop> get(Long id) {
		return repo.findById(id);
	}

	/*@Override
	public List<Workshop> find(String nombre) {
		return repo.findByNameContaining(nombre);
	}*/

	@Override
	public List<Workshop> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Workshop> find(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
}
