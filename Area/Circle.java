import java.util.Scanner;
public class Circle{
  
  public float getArea(){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter radius of circle");
    float r=sc.nextInt();
    
    float area= (float)3.14*r*r;
    return area;
  }

}