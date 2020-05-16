package dreambike.bikeService.restcontrollers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dreambike.bikeService.Services.BikeService;
import dreambike.bikeService.classes.Bike;
import dreambike.bikeService.classes.BikeType;

@RestController
@RequestMapping("/api/bike/")
@CrossOrigin("*")
public class BikeRestcontroller {
	
	private final BikeService bikeService;
	
	@Autowired
	public BikeRestcontroller(BikeService bikeService) {
		this.bikeService = bikeService;
	}
	
	@GetMapping("getAll")
	public List<Bike> getAllBikes() {
		return this.bikeService.findAll();
	}
	
	@GetMapping("getByBikeType")
	public Set<Bike> getBikesByBikeType(BikeType bikeType) {
		return this.bikeService.findByBikeType(bikeType);
	}
	
	@GetMapping("getByBikeName")
	public Set<Bike> getBikeByBikeName(String bikeName) {
		return this.bikeService.findByBikeName(bikeName);
	}
	
	
}
