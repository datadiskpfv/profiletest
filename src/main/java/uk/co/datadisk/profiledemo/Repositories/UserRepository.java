package uk.co.datadisk.profiledemo.Repositories;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import uk.co.datadisk.profiledemo.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
