package com.wizer.wizerlibrary.utility;

import com.wizer.wizerlibrary.models.users.Role;
import com.wizer.wizerlibrary.models.users.enums.ERole;
import com.wizer.wizerlibrary.repositories.users.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Utility {

    private final RoleRepository roleRepository;

    @Autowired
    public Utility(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public List<Role> assignRole(ERole erole) {
        List<Role> roles = new ArrayList<>();
        if(roleRepository.findByName(erole).isPresent()){
            roles.add(roleRepository.findByName(erole).get());
            return roles;
        }
        Role role = new Role();
        role.setName(erole);
        roleRepository.save(role);
        roles.add(role);
        return roles;
    }
}