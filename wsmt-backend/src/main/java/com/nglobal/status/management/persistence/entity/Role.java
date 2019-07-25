package com.nglobal.status.management.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "roles_cat")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_role")
	private int idUser;
	
	@Column(name="name_role")
	private String nameRole;
	
	@Column(name="status_role")
	private int statusRole;
	
	@Column(name="description")
	private String description;
	
}
