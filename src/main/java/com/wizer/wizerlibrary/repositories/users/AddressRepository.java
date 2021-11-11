package com.wizer.wizerlibrary.repositories.users;


import com.wizer.wizerlibrary.models.users.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
