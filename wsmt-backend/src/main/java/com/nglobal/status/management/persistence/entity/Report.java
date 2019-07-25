package com.nglobal.status.management.persistence.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "report")
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_report")
	private int idReport;
	
	@Column(name="id_project")
	@NotNull
	private String idProject;
	
	@Column(name="id_user")
	@NotNull
	private String idUser;
	
	@Column(name="status_report")
	@NotNull
	private int statusReport;
	
	@Column(name="client_name")
	@NotNull
	private String clientName;
	
	@Column(name="project_name")
	@NotNull
	private String projectName;
	
	@Column(name="status")
	@NotNull
	private String status;
	
	@Column(name="scope")
	@NotNull
	private String scope;
	
	@Column(name="schedule")
	@NotNull
	private String schedule;
	
	@Column(name="resources")
	@NotNull
	private String resources;
	
	@Column(name="budget")
	@NotNull
	private String budget;
	
	@Column(name="purchase_order")
	@NotNull
	private String purchaseOrder;
	
	@Column(name="lead_4th")
	@NotNull
	private String lead4th;
	
	@Column(name="num_resources")
	@NotNull
	private int numResources;
	
	@Column(name="business_owner")
	@NotNull
	private String businessOwner;
	
	@Column(name="project_summary")
	@NotNull
	private String projectSummary;
	
	@Column(name="task_name")
	@NotNull
	private String taskName;
	
	@Column(name="target_date")
	@NotNull
	private Date targetDate;
	
	@Column(name="completeness")
	@NotNull
	private int completeness;
	
	@Column(name="mitigation_actions")
	@NotNull
	private String mitigationActions;
	
	@Column(name="notes")
	@NotNull
	private String notes;
}
