package com.meensat.repo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meensat.models.Property;

@Repository
public interface PropertiesRepository extends CrudRepository<Property, Integer> {

	List<Property> findByLocationId(int locationId);

}
	
