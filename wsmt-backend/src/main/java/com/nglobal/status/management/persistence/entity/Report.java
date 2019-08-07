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
	
	@Column(name="lead_4th")
	@NotNull
	private String lead4th;
	
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
	

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	public Long getIdReport() {
		return idReport;
	}

	public void setIdReport(Long idReport) {
		this.idReport = idReport;
	}

	public String getIdProject() {
		return idProject;
	}

	public void setIdProject(String idProject) {
		this.idProject = idProject;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public int getStatusReport() {
		return statusReport;
	}

	public void setStatusReport(int statusReport) {
		this.statusReport = statusReport;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(String purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public String getLead4th() {
		return lead4th;
	}

	public void setLead4th(String lead4th) {
		this.lead4th = lead4th;
	}

	public int getNumResources() {
		return numResources;
	}

	public void setNumResources(int numResources) {
		this.numResources = numResources;
	}

	public String getBusinessOwner() {
		return businessOwner;
	}

	public void setBusinessOwner(String businessOwner) {
		this.businessOwner = businessOwner;
	}

	public String getProjectSummary() {
		return projectSummary;
	}

	public void setProjectSummary(String projectSummary) {
		this.projectSummary = projectSummary;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}

	public int getCompleteness() {
		return completeness;
	}

	public void setCompleteness(int completeness) {
		this.completeness = completeness;
	}

	public String getMitigationActions() {
		return mitigationActions;
	}

	public void setMitigationActions(String mitigationActions) {
		this.mitigationActions = mitigationActions;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPreparedBy() {
		return preparedBy;
	}

	public void setPreparedBy(String prepared_by) {
		this.preparedBy = prepared_by;
	}

	public int getTaskNumber() {
		return taskNumber;
	}

	public void setTaskNumber(int taskNumber) {
		this.taskNumber = taskNumber;
	}
	
	
}
