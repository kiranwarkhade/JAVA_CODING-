import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


class Employee
{
 private int empid;
 private String ename;
 private int salary;

 Employee(int empid,String ename, int salary )
 {
this.empid=empid;
this.ename=ename;
this.salary=salary;
 }
 public int getEmpid()
 {
    return empid;
 }

 public String getEname()
 {
return ename;
 }
 public int getSalary()
 {
     return salary;
 }
public String toString()
{
    return empid+" "+ename+" "+salary;
}
}

class CrudDemo
{ 
 public static void main(String[] args) 
 {
    
     try
       {
         
    System.out.println("Start crud Operation");
    List<Employee> c=new ArrayList<Employee>(); 
   Scanner sc=new Scanner(System.in);
  
    int ch;
    do{
      System.out.println("1. INSERT");
      System.out.println("2. DISPLAY");
      System.out.println("3. SEARCH");
      System.out.println("4. DELETE");
      System.out.println("5. UPDATE");
      System.out.println("Enter Your Choice: ");
      ch=sc.nextInt();
      switch (ch) {
          case 1:
          System.out.println("Enter Emp Id: ");
          int eid=sc.nextInt();
          System.out.println("Enter Emp Name: ");
          String ename=sc.next();
          System.out.println("Enter Emp Salary: ");
          int salary=sc.nextInt();
            c.add(new Employee(eid, ename, salary));
              
              break;
              case 2:
              System.out.println("____________________________________");
              Iterator<Employee> i=c.iterator();
              while(i.hasNext())
              {
                  Employee e=i.next();
                 
                  System.out.println(e);
              }
              System.out.println("____________________________________ ");
              break;
              case 3:
              boolean found=false;
              System.out.println("Enter Empid to Search :");
              int id=sc.nextInt();
              System.out.println("_____________________________________");
               i=c.iterator();
              while(i.hasNext())
              {
                  Employee e=i.next();
                  if(e.getEmpid()==id)
                  {
                    
                      System.out.println(e);
                      found=true;
                  }
                     
            }
            if(!found)
            {
                System.out.println("Record Not Found");
            }
            System.out.println("_____________________________________");
           break; 
           case 4:
           found=false;
          System.out.println("Enter Empid to delete :");
          id=sc.nextInt();
          System.out.println("_______________________________________");
          i=c.iterator();
          while(i.hasNext())
          {
              Employee e=i.next();
              if(e.getEmpid()== id)
              {
                 i.remove();
                 found=true; 
              }
          }
          if(!found)
          {
            System.out.println("Record Not Found");  
          }else
          {
              System.out.println("Record is Deleted Successfully...");
          }
          System.out.println("____________________________________");
          break;
          case 5:
          found = false;
          System.out.println("Enter Empid to update :");
          id=sc.nextInt();
          System.out.println("___________________________________");
          ListIterator<Employee> li=c.listIterator();
          while(li.hasNext())
          {
              Employee e=li.next();
              if(e.getEmpid()== id)
              {
                  System.out.println("Enter New Name :");
                  ename=sc.next();
                  System.out.println("Enter New Salary :");
                  salary=sc.nextInt();
                  li.set(new Employee(id, ename, salary));
                  found=true;
              }
          }
          if(!found)
          {
              System.out.println("Record Not Found ");
          }  else 
          {
              System.out.println("Record Updated Successfully...");
          }System.out.println("__________________________________");
          break;
          default:
          
              break;
      }
      
    }while(ch!=0);
  
    

    sc.close();
      }catch(Exception e)
      {
       
          System.out.println("Try Again...");

       }

    
 }   
}
