package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "members")
public class Member {
	@Id
	private int id;
	@Column(name = "member_code")
	private String memberCode;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "part")
	private String part;
	@Column(name = "position")
	private String position;
	@Column(name = "tag_name")
	private String tagName;
	@Column(name = "date_entry_work")
	private String dateEntryWork;
	@Column(name = "date_off_work")
	private String dateOffWork;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "address")
	private String address;
	@Column(name = "url_image")
	private String urlImage;
	@Column(name = "descriptions")
	private String descriptions;
	@Column(name = "status")
	private String status;
	@Column(name = "role_id")
	private String role_id;

	public Member() {
		super();
	}
  public Member(String email, String password) {
    this.email = email;
    this.password = password;
}

  public int getId() {
		return id;
	}

	public String getMemberCode() {
		return memberCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPart() {
		return part;
	}

	public String getPosition() {
		return position;
	}

	public String getTagName() {
		return tagName;
	}

	public String getDateEntryWork() {
		return dateEntryWork;
	}

	public String getDateOffWork() {
		return dateOffWork;
	}

	public String getTelephone() {
		return telephone;
	}

	public String geturlImage() {
		return urlImage;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public String getStatus() {
		return status;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public void setDateEntryWork(String dateEntryWork) {
		this.dateEntryWork = dateEntryWork;
	}

	public void setDateOffWork(String dateOffWork) {
		this.dateOffWork = dateOffWork;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
}
