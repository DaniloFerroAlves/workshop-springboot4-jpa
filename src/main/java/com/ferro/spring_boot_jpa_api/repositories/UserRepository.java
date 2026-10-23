package com.ferro.spring_boot_jpa_api.repositories;

import com.ferro.spring_boot_jpa_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
