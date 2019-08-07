package com.nglobal.status.management.persistence.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "project_assigned")
public class ProjectAssigned implements Serializable{
	
	@Id
	@Column(name="assigned_by_id")
	@NotNull
	private String assignedById;
	
	@Column(name="assigned_to_id")
	@NotNull
	private String assignedToId;
	
	@Column(name="id_project")
	@NotNull
	private String idProject;
	
	@Column(name="assigned_date")
	@NotNull
	private Date assignedDate;
	
	@Column(name="status_assigned")
	@NotNull
	private int statusAssigned;
}
