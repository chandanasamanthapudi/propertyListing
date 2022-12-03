package com.meensat.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meensat.models.Location;
import com.meensat.repo.LocationsRepository;

@RestController
@CrossOrigin(origins = "*")
public class LocationsController {
	
	@Autowired
	LocationsRepository locationsRepository;
	
	@GetMapping("/locations")
	public List<Location> getCities() {
		return (List<Location>) locationsRepository.findAll();
	}

	@PostMapping("/locations")
	public Location add(@RequestBody Location location) {
		return locationsRepository.save(location);
	}

}
