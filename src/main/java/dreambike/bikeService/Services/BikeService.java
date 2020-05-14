package dreambike.bikeService.Services;

import java.util.List;
import java.util.Set;

import dreambike.bikeService.classes.Bike;
import dreambike.bikeService.classes.BikeType;

public interface BikeService {
	Set<Bike> findByBikeName(String bikeName);
	Set<Bike> findByBikeType(BikeType bikeType);
	List<Bike> findAll();
}
