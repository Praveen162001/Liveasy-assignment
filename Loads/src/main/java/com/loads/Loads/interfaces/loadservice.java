package com.loads.Loads.interfaces;

import java.util.List;
import com.loads.Loads.modules.loads;

public interface loadservice {
  List<loads> findAll();
Boolean deleteload(long id);
//loads findById(long id);
loads findById(long id);
loads insert(loads l);

} 
