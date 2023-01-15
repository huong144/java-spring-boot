package com.example.demo.models;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

// chưa dùng đến
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@CreatedDate
	private Date createdAt;
	
	@Column
	@LastModifiedDate
	private Date updatedAt;
	
	public Long getId() {
		return id;
	}

	public Date getCreatedDate() {
		return createdAt;
	}

	public void setCreatedDate(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedDate() {
		return updatedAt;
	}

	public void setModifiedDate(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
