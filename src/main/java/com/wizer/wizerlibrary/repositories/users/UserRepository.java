package com.wizer.wizerlibrary.repositories.users;


import com.wizer.wizerlibrary.models.users.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

//    @Query("{'first_name': ?0}")
//    Optional<UserEntity> findByFirstName(String name);

    boolean existsByEmail(String email);

    Optional<UserEntity> findByEmail(String email);
}
