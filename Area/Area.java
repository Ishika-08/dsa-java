import java.util.Scanner;
public class Area{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

    System.out.println("For which shape?");
    String shape= sc.nextLine();
    System.out.println("What you want to find? (Area,Perimeter,Volume)");
    String what= sc.nextLine();


    if(shape.equals("Circle") || shape.equals("circle")){
      System.out.println("Enter the radius of circle:");
      float r= sc.nextFloat();
      Circle c1= new Circle();
      if(what.equals("Area") || what.equals("area")){
        System.out.println("Area of circle with radius " +r+ " is " +c1.getArea(r));
      }
      else if(what.equals("Perimeter") || what.equals("perimeter")){
        System.out.println("Perimeter of circle with radius " +r+ " is " +c1.getPerimeter(r));
      }
  }

    else if(shape.equals("Triangle") || shape.equals("triangle")){
      System.out.println("Enter the sides of triangle:");
      int a= sc.nextInt();
      int b= sc.nextInt();
      int c= sc.nextInt();
      
      Triangle t1= new Triangle();
      if(what.equals("Area") || what.equals("area")){
        System.out.println("Area of Triangle is " +t1.getArea(a,b,c));
      }
      else if(what.equals("Perimeter") || what.equals("perimeter")){
        System.out.println("Perimeter of Triangle is " +t1.getPerimeter(a,b,c));
      }

    }
  }
}