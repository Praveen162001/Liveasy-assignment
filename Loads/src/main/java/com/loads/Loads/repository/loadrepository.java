package com.loads.Loads.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loads.Loads.modules.loads;

@Repository	
public interface loadrepository extends JpaRepository<loads,Long>{
 



}
