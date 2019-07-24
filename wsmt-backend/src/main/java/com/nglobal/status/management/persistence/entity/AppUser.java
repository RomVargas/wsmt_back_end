package com.nglobal.status.management.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import lombok.Data;

@Data
@Entity
@Table(name = "appuser")
public class AppUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private int idUser;
	
	@Column(name="name")
	@NotNull
	private String name;
	
	@Column(name="last_name")
	@NotNull
	private String lastName;
	
	@SuppressWarnings("deprecation")
	@Column(name="email")
	@NotNull
	@Email
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="status")
	@NotNull
	private int status;
	
	@Column(name="role")
	@NotNull
	private int role;

}
