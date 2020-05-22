import java.io.*;

class Student{
	private int rollNo;
	private String name;
	private float per;
	
	private static int count;
	
	public Student(){
		rollNo = 0;
		name = "";
		per = 0.0f;
	}
	
	public Student(int rno, String n, float p){
		rollNo = rno;
		name = n;
		per = p;
		count++;
	}
	
	public String toString(){
		return rollNo+"\t"+name+"\t"+per;
	}
	
	public static void dispCount(){
		System.out.println("Objects created="+count);
	}

	public float getPer(){
		return per;
	}
}

public class StudentDemo {
	public static void main(String[] args) 
	throws Exception{
		BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
		String ch="";
		
		do {
			System.out.print("Enter roll no:");
			int rno = Integer.parseInt(br.readLine());
			System.out.print("Enter name:");
			String n = br.readLine();
			System.out.print("Enter percentage:");
			float p = Float.parseFloat(br.readLine());
			Student s = new Student(rno,n,p);
			
			System.out.println(s);
			
			Student.dispCount();
			
			System.out.print("Continue Y/N?");
			ch = br.readLine();
		} while(ch.equals("Y"));


		System.out.print("Enter no.of students:");
		int n = Integer.parseInt(br.readLine());
		
		Student s[] = new Student[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter roll no:");
			int rno = Integer.parseInt(br.readLine());
			System.out.print("Enter name:");
			String name = br.readLine();
			System.out.print("Enter percentage:");
			float p = Float.parseFloat(br.readLine());
			s[i] = new Student(rno,name,p);
		}		
		
		sortStudent(s);
		
		System.out.println("Sorted list:");
		for (Student x : s) {
			System.out.println(x);
		}
	}

	public static void sortStudent(Student t[]){
		int n = t.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if(t[j].getPer() < t[j+1].getPer()){
					Student q = t[j];
					t[j] = t[j+1];
					t[j+1] = q;
				}
			}
		}
	}	
}
