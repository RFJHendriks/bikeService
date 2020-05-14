package dreambike.bikeService.Repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dreambike.bikeService.classes.Bike;
import dreambike.bikeService.classes.BikeType;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
	Set<Bike> findByBikeName(String bikeName);
	Set<Bike> findByBikeType(BikeType bikeType);
}
