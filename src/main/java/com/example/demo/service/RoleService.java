package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.models.Role;
import com.example.demo.repository.RoleRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository roleRepository;

	public List<Role> findAllRoles() {
		return roleRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	public String createRole(Role role) {
		roleRepository.save(role);
		return "Success";
	}

	public ResponseEntity<Object> updateRole(Integer id, Role role) {
		Optional<Role> checkRole = roleRepository.findById(id);
		if (checkRole.isPresent()) {
			Role newRole = checkRole.get();
			newRole.setRoleName(role.getRoleName() == null ? newRole.getRoleName() : role.getRoleName());
			newRole.setMaxAmount(role.getMaxAmount() == null ? newRole.getMaxAmount() : role.getMaxAmount());
			newRole.setDescriptions(
					role.getDescriptions() == null ? newRole.getDescriptions() : role.getDescriptions());
			newRole.setPermission(role.getPermission() == null ? newRole.getPermission() : role.getPermission());
			return new ResponseEntity<Object>(roleRepository.save(newRole), HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Object> getRoleById(Integer id) {
		Optional<Role> checkRole = roleRepository.findById(id);
		if (checkRole.isPresent()) {
			return new ResponseEntity<>(checkRole.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}
}
