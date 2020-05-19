package student;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Student{
	String name,email;char gender;float CGPA;int year;
	
	public void setName(String name){
		this.name = name;
	}
    public String getName(){
		return name;	}
   
	
	
    public void setEmail(String email){
		this.email = email;
	}
    public String getEmail(){
	return email;	
	}


	
    public void setCgpa(float CGPA){
	this.CGPA= CGPA;
}
	public float getCgpa(){
	return CGPA;	
	}

	
	public void setGender(char gender){
		this.gender= gender;
		}
	public char getGender(){
		return gender;
	}
	
	
	public void setYear(int year){
		this.year=year;
	}
    public int getYear(){
    	return year;
    }
}





public class StudDemo {
	
static int c;
	public static void main(String[]args)
	{
		int n,choice,y;
		System.out.println("How many student/s are there ?");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		in.nextLine();
		
		ArrayList<Student> students = new ArrayList<Student>(n);
		
		for(int i=1;i<=n;i++)
		{
			Student student = new Student();
			
			System.out.println("Enter the requested informations on Student "+(i));
			int x;
			do {
		         
				 System.out.println("Name ");
		         String name = in.nextLine();
		         String regexx = "^[a-zA-Z]+$";
		         Pattern patternn = Pattern.compile(regexx);
		         Matcher matcherr = patternn.matcher(name);
		         if (matcherr.matches() == true) {
		             x= 1;
		             student.setName(name);
		         } else {
		             System.out.println("invalid name.name should only contain letters");
		             x= 0;
		         }
		     } while (x == 0);
			
			
			do
			{
			System.out.println("Email");
			String email=in.nextLine();
			String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
			
			Pattern pattern=Pattern.compile(regex);
			
			
			Matcher matcher=pattern.matcher(email);
			if(matcher.matches()==true)
			{
				x=1;
			student.setEmail(email);
			}
			else 
			{

				System.out.println("Invaid email address, please re-enter email");
			  x=0;
			}
			}
			while(x==0);
			do 
			{
			System.out.println("CGPA");
			float CGPA=in.nextInt();
			if((0<=CGPA)&&(CGPA<=4))
			{
			student.setCgpa(CGPA);
			x=1;
			}
			else
			{
				System.out.println(CGPA+" is invaid CGPA (it must be between 0 and four(0-4) . Please re-enter ");
				x=0;
			}
			}
			while(x==0);
		
			in.nextLine();
			do 
			{
			System.out.println("Gender (M/F) ");
			char gender=in.next().charAt(0);
			if(gender=='f'||gender=='F'||gender=='m'||gender=='M')
			{
				student.setGender(gender);
			x=1;
		}
			else
			{
				System.out.println(gender+ " is invalid gender please press M if male and F if female >>");
				x=0;
			}}
			while(x==0);
			

			do
			{
			System.out.println("Year of birth");
			int year=in.nextInt();
			
			if((1900<=year)&&(year<=2019))
			{
				student.setYear(year);
			x=1;
			}
			else
			{
				System.out.println(year+" is an invalid year. Please re-enter your year of birth >>");
			x=0;
			}
			}
			
			while(x==0);
			in.nextLine();
			
			students.add(student);
			
		}
		
		
		do 
		{
		  System.out.println(" Students information is stord in database >> What do you want to do next  press 1 to see options ");
		  y=in.nextInt();
		  if(y==1)
		  {
			  System.out.println("\tPress 1 : TO add new student \n\tPress 2 : To edit student information \n\t Press 3: To delete student from list \n\t Press 4 : To display list \n\t Press 5 : To exit ");
		  choice=in.nextInt();
		  
		  switch(choice)
		  {
		  case 1:
			  int n1;
			  System.out.println("+ + + + + + + + + + + + + + Welcome to adding zone+ + + + + + + + + + + + + + + ");
			  System.out.println("How many students do you want to add ?");
			  n1=in.nextInt();
			  in.nextLine();
			  for(int i=0;i<n1;i++)
			  {
				  Student student = new Student();
					
					System.out.println("Enter the requested informations on Student "+(i));
					
					int x;
					do {
				         
						 System.out.println("Name ");
				         String name = in.nextLine();
				         String regexx = "^[a-zA-Z]+$";
				         Pattern patternn = Pattern.compile(regexx);
				         Matcher matcherr = patternn.matcher(name);
				         if (matcherr.matches() == true) {
				             x= 1;
				             student.setName(name);
				         } else {
				             System.out.println("invalid name.name should only contain letters");
				             x= 0;
				         }
				     } while (x == 0);
					do
					{
					System.out.println("Email");
					String email=in.nextLine();
					String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
					
					Pattern pattern=Pattern.compile(regex);
					
					
					Matcher matcher=pattern.matcher(email);
					if(matcher.matches()==true)
					{
						x=1;
					student.setEmail(email);
					}
					else 
					{

						System.out.println("Invaid email address, please re-enter email");
					  x=0;
					}
					}
					while(x==0);
					do 
					{
					System.out.println("CGPA");
					float CGPA=in.nextInt();
					if((0<=CGPA)&&(CGPA<=4))
					{
					student.setCgpa(CGPA);
					x=1;
					}
					else
					{
						System.out.println(CGPA+" is invaid CGPA (it must be between 0 and four(0-4) . Please re-enter ");
						x=0;
					}
					}
					while(x==0);
				
					in.nextLine();
					do 
					{
					System.out.println("Gender (M/F) ");
					char gender=in.next().charAt(0);
					if(gender=='f'||gender=='F'||gender=='m'||gender=='M')
					{
						student.setGender(gender);
					x=1;
				}
					else
					{
						System.out.println(gender+ " is invalid gender please press M if male and F if female >>");
						x=0;
					}}
					while(x==0);
					students.add(student);

					do
					{
					System.out.println("Year of birth");
					int year=in.nextInt();
					
					if((1900<=year)&&(year<=2019))
					{
						student.setYear(year);
					x=1;
					}
					else
					{
						System.out.println(year+" is an invalid year. Please re-enter your year of birth >>");
					x=0;
					}
					}
					
					while(x==0);
					in.nextLine();
					
					students.add(student);
					
			  }
			  System.out.println("Updated list of students >>");
			  System.out.println("  S T U D E N T S '    I N F O R M A T I O N ");
			  System.out.println("---------------------------------------------");
			  System.out.println("No_    Name\t\tEmail\t\t\tGender\tCGPA  Year");
				System.out.println("____|________________|_________________________|_______|_____|_____|");
				for(int i=0;i<n+n1;i++)
				{
				Student stu = (Student)students.get(i+1);
				System.out.println(i+1+")   "+stu.getName()+"\t\t"+stu.getEmail()+"\t"+stu.getGender()+"\t"+stu.getCgpa()+"  "+stu.getYear()+"E.c");
				System.out.println("`````````````````````````````````````````````````````````````````````");
				}
			  
break;
		  case 2: 
			  
			  int no;
			  System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ Welcome to editing zone~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
System.out.println("Enter the number of the student to edit information ");
no=in.nextInt();
in.nextLine();
Student stu = (Student)students.get(no);
System.out.println("Student at number "+no+" is "+stu.getName());
System.out.println("Enter the new information on student "+stu.getName());
int x;
do {
     
	 System.out.println("Name ");
     String name = in.nextLine();
     String regexx = "^[a-zA-Z]+$";
     Pattern patternn = Pattern.compile(regexx);
     Matcher matcherr = patternn.matcher(name);
     if (matcherr.matches() == true) {
         x= 1;
         stu.setName(name);
     } else {
         System.out.println("invalid name.name should only contain letters");
         x= 0;
     }
 } while (x == 0);
do
{
System.out.println("Email");
String email=in.nextLine();
String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

Pattern pattern=Pattern.compile(regex);


Matcher matcher=pattern.matcher(email);
if(matcher.matches()==true)
{
	x=1;
stu.setEmail(email);
}
else 
{

	System.out.println("Invaid email address, please re-enter email");
  x=0;
}
}
while(x==0);
do 
{
System.out.println("CGPA");
float CGPA=in.nextInt();
if((0<=CGPA)&&(CGPA<=4))
{
stu.setCgpa(CGPA);
x=1;
}
else
{
	System.out.println(CGPA+" is invaid CGPA (it must be between 0 and four(0-4) . Please re-enter ");
	x=0;
}
}
while(x==0);

in.nextLine();
do 
{
System.out.println("Gender (M/F) ");
char gender=in.next().charAt(0);
if(gender=='f'||gender=='F'||gender=='m'||gender=='M')
{
	stu.setGender(gender);
x=1;
}
else
{
	System.out.println(gender+ " is invalid gender please press M if male and F if female >>");
	x=0;
}}
while(x==0);
students.add(stu);

do
{
System.out.println("Year of birth");
int year=in.nextInt();

if((1900<=year)&&(year<=2019))
{
	stu.setYear(year);
x=1;
}
else
{
	System.out.println(year+" is an invalid year. Please re-enter your year of birth >>");
x=0;
}
}

while(x==0);
in.nextLine();

students.add(stu);

System.out.println(stu.getName()+"s' edited information ");
System.out.println("Name == "+stu.getName()+" Email == "+stu.getEmail()+" Gender == "+stu.getGender()+" Year of birth == "+stu.getYear()+"CGPA == "+stu.getCgpa());

System.out.println("  S T U D E N T S '    I N F O R M A T I O N    A F T E R    E D I T I O N    O F "+stu.getName());
System.out.println("-------------------------------------------------------------------------------------------");
System.out.println("No_    Name\t\tEmail\t\t\tGender\tCGPA  Year");
System.out.println("____|________________|_________________________|_______|_____|_____|");
for(int i=0;i<n;i++)
{
Student stu1 = (Student)students.get(i+1);
System.out.println(i+1+")   "+stu1.getName()+"\t\t"+stu1.getEmail()+"\t"+stu1.getGender()+"\t"+stu1.getCgpa()+"  "+stu1.getYear()+"E.c");
System.out.println("`````````````````````````````````````````````````````````````````````");
}
break;
		
		  case 3:
			  
			  System.out.println("X X X X X X X X X X X X X X Welcome to deleting zone X X X X X X X X X X X X X X X\n");
			

			  
			  System.out.println("Enter the number of the student to remove student  ");
			  no=in.nextInt();
Student stud = (Student)students.get(no);

			  
			  System.out.println("Student at number "+no+" is "+stud.getName());
		students.remove(no);

		System.out.println("  S T U D E N T S '    I N F O R M A T I O N    A F T E R    D E L E T I O N   O F "+stud.getName());
		  System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("No_    Name\t\tEmail\t\t\tGender\tCGPA  Year");
		System.out.println("____|________________|_________________________|_______|_____|_____|");
		for(int i=0;i<n-1;i++)
		{
		Student stu1 = (Student)students.get(i+1);
		System.out.println(i+1+")   "+stu1.getName()+"\t\t"+stu1.getEmail()+"\t"+stu1.getGender()+"\t"+stu1.getCgpa()+"  "+stu1.getYear()+"E.c");
		System.out.println("`````````````````````````````````````````````````````````````````````");
		}

		
		break;
			  
		  case 4:
			  
			  System.out.println(" D I S P L A Y I N G   S T U D E N T S '    I N F O R M A T I O N ");
		  System.out.println("---------------------------------------------");
		System.out.println("No_    Name\t\tEmail\t\t\tGender\tCGPA  Year");
		System.out.println("____|________________|_________________________|_______|_____|_____|");
		for(int i=0;i<n;i++)
		{
		Student stu1 = (Student)students.get(i+1);
		System.out.println(i+1+")   "+stu1.getName()+"\t\t"+stu1.getEmail()+"\t"+stu1.getGender()+"\t"+stu1.getCgpa()+"  "+stu1.getYear()+"E.c");
		System.out.println("`````````````````````````````````````````````````````````````````````");
		}
			  break;
			  
		  case 5:
			  System.exit(5);
break;
default:
	System.out.println("Do you want further operation ?? \n If so press 1");
	break; 	 
	}
		  }
	c=in.nextInt();	 



	

			  }
	
while(c==1);	}
	


}

