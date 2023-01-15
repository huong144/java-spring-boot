package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Role;
import com.example.demo.response.BaseResponse;
import com.example.demo.response.MessageResponse;
import com.example.demo.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
  @Autowired
  private RoleService roleService;

  @GetMapping
  public List<Role> findAllRoles() {
    return roleService.findAllRoles();
  }

  @PostMapping()
  public BaseResponse create(@RequestBody Role role) {
    try {
      return new MessageResponse(roleService.createRole(role));
    } catch (Exception e) {
      System.out.println(e);
    }
    return null;
  }

  @PutMapping("/{id}")
  public ResponseEntity<Object> updateRole(@PathVariable Integer id, @RequestBody Role role) {
    try {
      return roleService.updateRole(id, role);
    } catch (Exception e) {
      System.out.println(e);
    }
    return null;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> getRoleById(@PathVariable Integer id) {
    try {
      return roleService.getRoleById(id);
    } catch (Exception e) {
      System.out.println(e);
    }
    return null;
  }
}
