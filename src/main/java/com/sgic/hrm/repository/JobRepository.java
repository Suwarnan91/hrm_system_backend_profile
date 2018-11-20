package com.sgic.hrm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.hrm.entity.Job;
public interface JobRepository extends JpaRepository<Job, Integer>{

}
