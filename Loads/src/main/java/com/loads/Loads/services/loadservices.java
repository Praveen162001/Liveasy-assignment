package com.loads.Loads.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loads.Loads.interfaces.loadservice;
import com.loads.Loads.modules.loads;
import com.loads.Loads.repository.loadrepository;
@Service
public class loadservices implements loadservice{
	@Autowired
	private loadrepository repository;

	@Override
	public List<loads> findAll() {
		// TODO Auto-generated method stub
		 List<loads> Loads = (List<loads>) repository.findAll();
		return Loads;
	}

	public loads findById(long id) {
		Optional<loads> result=repository.findById(id);
		if(result.isPresent())
			return result.get();
		else
			return null;
	}

	@Override
	public Boolean deleteload(long id) {
		try {
			repository.deleteById(id);
			return true;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			    return false;
			}
	}

	@Override
	public loads insert(loads l) {
	   return repository.save(l);
	}
}
