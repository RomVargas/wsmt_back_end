package com.nglobal.status.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nglobal.status.management.persistence.entity.NextActivities;;

@Repository
public interface NextActivitiesRepo extends JpaRepository<NextActivities, Long>{

}
