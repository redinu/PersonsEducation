
public class PersonApp {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.getJob().setId(01);
		person.getJob().setRole("CEO");
		person.getJob().setSalary(200000);
		System.out.println(person.getJob());
		
		
		String[] scol = person.getEducation().getSchool();
		for(int i= 1; i<=10; i++){
			
		  scol[i-1]= "school" + i; 
			
		}
		person.getEducation().setSchool(scol);
		
		System.out.println(person.getEducation());
		
	}

}
