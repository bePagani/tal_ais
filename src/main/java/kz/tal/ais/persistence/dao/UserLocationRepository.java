package kz.tal.ais.persistence.dao;

import kz.tal.ais.persistence.model.User;
import kz.tal.ais.persistence.model.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
