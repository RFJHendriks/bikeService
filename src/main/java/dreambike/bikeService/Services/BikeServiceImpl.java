package dreambike.bikeService.Services;

import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dreambike.bikeService.Repositories.BikeRepository;
import dreambike.bikeService.classes.Bike;
import dreambike.bikeService.classes.BikeType;

@Service("bikeService")
public class BikeServiceImpl implements BikeService {

	private final BikeRepository bikeRepository;
	private final ModelMapper modelMapper;
	
	@Autowired
	public BikeServiceImpl(BikeRepository bikeRepository, ModelMapper modelMapper) {
		this.bikeRepository = bikeRepository;
		this.modelMapper = modelMapper;
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
