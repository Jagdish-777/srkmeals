package org.springp.srkmeals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springp.srkmeals.entity.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Long>{

}
