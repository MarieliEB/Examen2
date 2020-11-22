package com.cenfotec.service;

import java.util.List;
import java.util.Optional;
import com.cenfotec.domain.Workshop;

public interface WorkshopService {

	public void save(Workshop workshop);
	public Optional<Workshop> get(Long id);
	public List<Workshop> getAll();
	public List<Workshop> find(String nombre);
}
