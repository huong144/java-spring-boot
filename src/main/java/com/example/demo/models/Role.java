package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRawValue;

@Entity
@Table(name = "roles")
public class Role {
  @Id
  private int id;
  @Column(name = "role_name")
  private String roleName;
  @Column(name = "max_amount")
  private String maxAmount;
  @JsonRawValue
  private String permission;
  private String descriptions;

  public Role() {
    super();
  }

  public int getId() {
    return id;
  }

  public String getRoleName() {
    return roleName;
  }

  public String getMaxAmount() {
    return maxAmount;
  }

  @Column(name = "permission", columnDefinition = "json")
  public String getPermission() {
    return permission;
  }

  @Column(name = "descriptions")
  public String getDescriptions() {
    return descriptions;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public void setDescriptions(String descriptions) {
    this.descriptions = descriptions;
  }
}
