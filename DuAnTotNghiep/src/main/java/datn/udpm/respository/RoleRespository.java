package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Role;

public interface RoleRespository extends JpaRepository<Role,String> {

}
