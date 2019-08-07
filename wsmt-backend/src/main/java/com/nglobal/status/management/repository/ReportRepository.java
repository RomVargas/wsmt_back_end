package com.nglobal.status.management.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.nglobal.status.management.persistence.entity.Report;

public interface ReportRepository extends CrudRepository<Report, Long>{

	public List<Report> findAll();
}
