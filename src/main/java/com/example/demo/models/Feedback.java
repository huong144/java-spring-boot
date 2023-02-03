package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {
  @Id
  private int id;
  private String name;
  private String description;
  private String status;
  private String file;

  public Feedback(){
    super();
  }

  public String getDescription() {
    return description;
  }

  public String getFile() {
    return file;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getStatus() {
    return status;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
