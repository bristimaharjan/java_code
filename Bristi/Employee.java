package Bristi;

import java.util.*;
import java.io.*;

public class Employee implements Serializable{
    static int empno;
    String ename;
    int salary;
    Employee(int empno,String ename,int salary){
        this.empno=empno;
        this.ename=ename;
        this.salary=salary;
    }
     //display
      public String toString(){
        return empno+" "+ename+" "+salary;
      }
      class EmployeeDemo{
          public static  void main(String[] args) throws Exception{
              Scanner scan = new Scanner(System.in);
              Scanner scan1 = new Scanner(System.in);
              File file =new File("employee.txt");
              ArrayList<Employee>al =new ArrayList<Employee>();
              ObjectOutputStream out= null;
              ObjectInputStream in=null;
              ListIterator li =null;

           
              int choice =-1;
              while(choice!=0){
                 System.out.println("1.Insert");

                 System.out.println("2.Display");

                 System.out.println("3.Search");

                 System.out.println("Enter your choice");
                  choice= scan.nextInt();
                 switch(choice){
                     case 1:
                         System.out.println("Enter how many employee you want");
                         int n = scan.nextInt();
                         for(int i=0;i<n;i++){
                             System.out.println("Enter Employee No:");
                             int empno=scan.nextInt();
                             System.out.println("Enter Employee Name:");
                             String ename =scan1.nextLine();
                             System.out.println("Enter Employee Salary:");
                             int salary=scan.nextInt();
                             al.add(new Employee(empno,ename,salary));
                            }
                         
                            out=new ObjectOutputStream(new FileOutputStream(file));
                            out.writeObject(al);
                            out.close();
                      
                     case 2:
                     if(file.isFile()){
                        in=new ObjectInputStream(new FileInputStream(file));
                        al=(ArrayList<Employee>)in.readObject();
                         in.close();;
                         li=al.listIterator();
                         while(li.hasNext())
                         System.out.println(li.next());
                          System.out.println("----------------");
                     }else{
                        System.out.println("file not exist ...!");
                     }
                         break;
                             
                     case 3:
                     if(file.isFile()){
                        in=new ObjectInputStream(new FileInputStream(file));
                        al=(ArrayList<Employee>)in.readObject();
                         in.close();;
            
                        boolean found =false;
                     System.out.println("Enter empno to search :");
                     empno=scan.nextInt();
                     li=al.listIterator();
                     while(li.hasNext()){
                        Employee e =(Employee)li.next();
                        if(e.empno==empno){
                            System.out.println(e);
                            found=true;
                             
                        }
                    }
                    if(!found)
                    System.out.println("Record not found");
                     
            
                      System.out.println("----------------");

                     }else{
                        System.out.println("file not exist ...!");
                     }
                     
                     break;

                 }

             }

          }
      }

}

