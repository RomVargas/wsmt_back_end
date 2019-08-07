package com.nglobal.status.management.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "issues_risk")
public class IssuesRisk implements Serializable{

	@Id
	@Column(name="id_report")
	@NotNull
	private Long idReport;
	
	@Column(name="item_id")
	@NotNull
	private String itemId;
	
	@Column(name="risk_detail")
	@NotNull
	private String riskDetail;
}
