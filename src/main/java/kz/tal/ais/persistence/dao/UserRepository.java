package kz.tal.ais.persistence.dao;

import kz.tal.ais.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String email);

    @Override
    void delete(User user);

}
