package accountbalance;

public class GettersandSetters {
	private String name;
	private int age;
	
	
public void setName(String name){
   this.name = name;
   }
	 public void printValuesNow() {
		 System.out.print("The boy's name is  " + name +  " " + ",and he's" + age + "old" );
	 }
	
public void ageMethod(int age) {
		this.age = age; 
}
	 public String getName() {
		  return this.name;
	 }
	  public int getAge() {
		  return this.age;
	  }
	 
	

	public static void main(String[] args) {
	GettersandSetters mike = new GettersandSetters();
   mike.setName("Michael");
    mike.ageMethod(26);
  mike.printValuesNow();
	
	System.out.print("The boy's name is  " + mike.getName()  +  " " + ",and he's" + mike.getAge() + " " + "old" );	}

}
