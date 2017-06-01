import java.util.Arrays;

public class Education {
	
	private String[] school = new String[10];
	
	public String[] getSchool() {
		return school;
	}

	public void setSchool(String[] school) {
		this.school = school;
	}


	public String toString() {
		return "Education [edu=" + Arrays.toString(school) + "]";
	}

	
	
	

}
