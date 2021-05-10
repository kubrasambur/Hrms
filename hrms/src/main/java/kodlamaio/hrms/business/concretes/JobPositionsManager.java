package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionsService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionsDao;
import kodlamaio.hrms.entities.concretes.JobPositions;

@Service
public class JobPositionsManager implements JobPositionsService{

	private JobPositionsDao jobPositionDao;

	@Autowired
	public JobPositionsManager(JobPositionsDao jobPosition) {
		super();
		this.jobPositionDao = jobPosition;
	}

	@Override
	public List<JobPositions> getAll() {
		
		return this.jobPositionDao.findAll();
	}
	
}
