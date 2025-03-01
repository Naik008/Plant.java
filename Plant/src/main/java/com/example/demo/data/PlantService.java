package com.example.demo.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Plant;
import com.example.demo.repository.PlantRepository;

@Service
public class PlantService {

	private final PlantRepository plantRepository;

	@Autowired
	public PlantService(PlantRepository plantRepository) {
		this.plantRepository = plantRepository;
	}

	public List<Plant> getAllPlants() {
		return plantRepository.findAll();
	}

	public Optional<Plant> getPlantById(Long id) {
		return plantRepository.findById(id);
	}

	public Plant savePlant(Plant plant) {
		return plantRepository.save(plant);
	}

	public void deletePlant(Long id) {
		plantRepository.deleteById(id);
	}
}
