package com.nglobal.status.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nglobal.status.management.persistence.entity.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long>{

}
