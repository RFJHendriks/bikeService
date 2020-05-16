package dreambike.bikeService.Services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dreambike.bikeService.Repositories.BikeRepository;
import dreambike.bikeService.classes.Bike;
import dreambike.bikeService.classes.BikeType;

@Service("bikeService")
public class BikeServiceImpl implements BikeService {

	private final BikeRepository bikeRepository;
	
	@Autowired
	public BikeServiceImpl(BikeRepository bikeRepository) {
		this.bikeRepository = bikeRepository;
	}
	
	@Override
	public Set<Bike> findByBikeName(String bikeName) {
		return bikeRepository.findByBikeName(bikeName);
	}

	@Override
	public Set<Bike> findByBikeType(BikeType bikeType) {
		return bikeRepository.findByBikeType(bikeType);
	}

	@Override
	public List<Bike> findAll() {
		return  bikeRepository.findAll();
	}

}
