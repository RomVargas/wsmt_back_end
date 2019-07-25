package com.nglobal.status.management.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "project_cat")
public class Project {

	@Id
	@Column(name="id_project")
	@NotNull
	private String idReport;
	
	@Column(name="name_project")
	@NotNull
	private String nameProject;
	
	@Column(name="status_project")
	@NotNull
	private int statusProject;
	
	@Column(name="description")
	@NotNull
	private String description;
}
