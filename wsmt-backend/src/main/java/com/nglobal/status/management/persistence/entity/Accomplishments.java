package com.nglobal.status.management.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "accomplishments")
public class Accomplishments implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Accomplishments() {}
	
	@Id
	@Column(name="id_report")
	private Long ideport;

	
	@Column(name="task_id")
	@NotNull
	private String taskId;
	
	@Column(name="task_details")
	@NotNull
	private String taskDetails;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskDetails() {
		return taskDetails;
	}

	public void setTaskDetails(String taskDetails) {
		this.taskDetails = taskDetails;
	}
	
	
	
}
