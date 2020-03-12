package com.nglobal.status.management.persistence.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "report")
public class Report implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id_report")
	private Long idReport;
	
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
	
	@Column(name="team_lead")
	@NotNull
	private String teamlead;
	
	@Column(name="num_resources")
	@NotNull
	private int numResources;
	
	@Column(name="prepared_by")
	@NotNull
	private String preparedBy;
	
	@Column(name="business_owner")
	@NotNull
	private String businessOwner;
	
	@Column(name="project_summary")
	@NotNull
	private String projectSummary;
	
	@Column(name="task_name")
	@NotNull
	private String taskName;
	
	@Column(name="task_number")
	@NotNull
	private int taskNumber;
	
	//@Temporal(TemporalType.DATE)
	@Column(name="target_date")
	@NotNull
	private String targetDate;
	
	@Column(name="completeness")
	@NotNull
	private int completeness;
	
	@Column(name="risk")
	@NotNull
	private String risk;
	
	@Column(name="mitigation_actions")
	@NotNull
	private String mitigationActions;
	
	@Column(name="notes")
	@NotNull
	private String notes;
	
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name="id_report")
	private List<Accomplishments> accomplishments;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_report")
	private List<IssuesRisk> issues;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_report")
	private List<NextActivities> activities;
	

	
	
}
