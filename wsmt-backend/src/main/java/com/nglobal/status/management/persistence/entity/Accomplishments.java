package com.nglobal.status.management.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "accomplishments")
public class Accomplishments {

	@Id
	@Column(name="id_report")
	@NotNull
	private int idReport;
	
	@Column(name="task_id")
	@NotNull
	private String taskId;
	
	@Column(name="task_details")
	@NotNull
	private String taskDetails;
	
}
