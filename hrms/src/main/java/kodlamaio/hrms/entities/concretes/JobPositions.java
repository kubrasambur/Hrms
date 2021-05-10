package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_position")
public class JobPositions {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name = "job_name")
    private String jobName;


    public JobPositions(int id, String jobName) {
        this.id = id;
        this.jobName = jobName;
    }
    
    public JobPositions() {
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getJobName() {
        return jobName;
    }
    
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }








}