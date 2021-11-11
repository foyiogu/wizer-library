package com.wizer.wizerlibrary.repositories.users;


import com.wizer.wizerlibrary.models.users.Role;
import com.wizer.wizerlibrary.models.users.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
