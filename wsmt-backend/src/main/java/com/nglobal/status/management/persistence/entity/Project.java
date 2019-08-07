package com.nglobal.status.management.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "project_cat")
public class Project implements Serializable{

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
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Accomplishments> accomplishments;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<IssuesRisk> issues;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<NextActivities> activities;
}
