/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgabstract;
import java.util.Scanner;

/**
 *
 * @author ajee
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        employee obj1[]=new employee[n];
        System.out.println(obj[n]);
    }
    
}
abstract class employee
{
    String name;
    String age;
    String hourrate;

employee(String h,String a,string b )
    {
        name =a;
        age=b;
        hourrate=h;
        name="abc";
        age="18";
        hourrate="20000";
 }
public String toString()
{
  return "name-->"+name+"age-->"+age+"hourrate-->"+hourrate;  
}
}


