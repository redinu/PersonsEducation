
public class Person {
	
	private Education education;
	private Job job;
	
	public Person(){
		this.education = new Education();
		this.job = new Job();
	}


	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}


	public Job getJob() {
		return job;
	}


	public void setJob(Job job) {
		this.job = job;
	}

	

	
	
	
	

}
