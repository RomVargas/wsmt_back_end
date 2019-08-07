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
@Table(name = "next_activities")
public class NextActivities implements Serializable{

	@Id
	@Column(name="id_report")
	@NotNull
	private Long idReport;
	
	@Column(name="item_id")
	@NotNull
	private String itemId;
	
	@Column(name="item_detail")
	@NotNull
	private String itemDetail;
}
