package variables;

public class demo {
	int rollid=578;
	 String name="monkey";
	 double sal=5000.34;
     String dept="engineer";
     
	static int emplyid=234;
	static String emplyname="Luffy";
	static double emplysal=5000.34;
	static String emplydept="developer";
	

	public static void main(String[] args) {
		demo obj=new demo();
		 int mark=90;
		 double salary=50000.35;
		 String name="monkey D Luffy";
		 char grade='o';
		 
		 System.out.println("mark is "+mark);
		 System.out.println("salary is "+salary);
		 System.out.println("name is "+name);
		 System.out.println("grade is "+grade);
		 
		 System.out.println("------------------------------------");
		 System.out.println("id is "+demo.emplyid);
		 System.out.println("name  is "+demo.emplyname);
		 System.out.println("salary is "+demo.emplysal);
		 System.out.println("department is "+demo.emplydept);
		 System.out.println("------------------------------------");
		 System.out.println("rollid is "+obj.rollid);
		 System.out.println("name is "+obj.name);
		 System.out.println("salary is "+obj.sal);
		 System.out.println("dept is "+obj.dept);

	}

}
