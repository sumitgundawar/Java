import java.io.*;
abstract class Staff{
	protected String name,address;    

	public Staff(String name,String address){
		this.name=name;
               	this.address=address;
       	}
	abstract public void display();
}

class FullTime extends Staff{
	private String department;
        private double salary;

	public FullTime(String name,String address,String department,double salary){
		super(name,address);
		this.department=department;
		this.salary=salary;
	}

	public void display(){
		System.out.println("Name:"+name+
                		"\nAddress:"+address+       
                		"\nDepartment:"+department+
                		"\nSalary:"+salary);     
	}
}
class PartTime extends Staff{
	private int noofhrs;
	private double rate;

	public PartTime(String name,String address,int noofhrs,double rate){
		super(name,address);
		this.noofhrs=noofhrs;
		this.rate=rate;
	}
	public void display(){
		System.out.println("Name:"+name+
				"\nAddress:"+address+
				"\nNumber of hours:"+noofhrs+
				"\nRate per hour:"+rate);        
	}
}

class StaffTest{
	public static void main(String args[]) throws Exception{             
		BufferedReader br=new BufferedReader(
					new InputStreamReader(System.in));             

		System.out.print("Enter no.of staff:");
		int n = Integer.parseInt(br.readLine());

		Staff s[] = new Staff[n];
		String name,address,department;
		double salary,rate;
		int noofhrs;

		for(int i=0;i<n;i++){
			System.out.print("FullTimeStaff(0)/PartTimeStaff(1)?");
			int ch = Integer.parseInt(br.readLine());
			if(ch==0){
				System.out.print("Enter name:");
				name=br.readLine();
				System.out.print("Enter Address:");
				address=br.readLine();
				System.out.print("Enter Department:");
				department=br.readLine();
				System.out.print("Enter Salary:");
				salary=Double.parseDouble(br.readLine());
		                                                                                        				s[i]=new FullTime(name,address,department,salary);
			}
			if(ch==1){
				System.out.print("Enter name:");
				name=br.readLine();
				System.out.print("Enter Address:");
				address=br.readLine();
				System.out.print("Enter no of hrs:");
				noofhrs=Integer.parseInt(br.readLine());
				System.out.print("Enter rate:");
				rate=Double.parseDouble(br.readLine());
                                                                                                				s[i]=new PartTime(name,address,noofhrs,rate);
			}
		}

		for(int i=0;i<n;i++){
			s[i].display();
		}
	}
}
                                                                                
