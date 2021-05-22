package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entites.concretes.JobPositions;

public interface JobPositionService {
	List<JobPositions>getAll();
}
