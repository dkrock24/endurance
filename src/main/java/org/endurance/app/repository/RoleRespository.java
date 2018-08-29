package org.endurance.app.repository;

import org.endurance.app.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RoleRespository extends JpaRepository<Role, Integer> {

	Role findByRole(String role);
}