package kz.tal.ais.persistence.dao;

import kz.tal.ais.persistence.model.NewLocationToken;
import kz.tal.ais.persistence.model.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);

}
