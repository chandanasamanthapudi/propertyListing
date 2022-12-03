package com.meensat.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meensat.models.Location;

@Repository
public interface LocationsRepository extends CrudRepository<Location, Integer> {
	
}
