package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entites.concretes.JobPositions;

public interface JobPositionDao extends JpaRepository <JobPositions,Integer>{

}
