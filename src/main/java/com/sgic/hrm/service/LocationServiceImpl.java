package com.sgic.hrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.Location;
import com.sgic.hrm.repository.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService{
	@Autowired
	private LocationRepository locationRepository;
	@Override
	public boolean addLocation(Location location) {
		locationRepository.save(location);
		return true;
	}

	@Override
	public List<Location> getLocation() {
		return locationRepository.findAll();
	}

	@Override
	public boolean editLocation(Location location, Integer id) {
		if (locationRepository.getOne(id)!=null) {
			location.setId(id);
			locationRepository.save(location);
			return true;
		}
		return true;
	}

	@Override
	public Optional<Location> getLocationId(Integer id) {
		// TODO Auto-generated method stub
		return locationRepository.findById(id);
	}

	@Override
	public boolean deleteLocation(Integer id) {
		if (locationRepository.getOne(id)!=null) {
		
			locationRepository.deleteById(id);
			return true;
		}
		return true;
	}

}
