package com.nglobal.status.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nglobal.status.management.persistence.entity.ProjectAssigned;

@Repository
public interface ProjectAssignedRepo extends JpaRepository<ProjectAssigned, Long>{

}
