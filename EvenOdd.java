import java.util.Scanner;
class EvenOdd{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number:");
    int a= sc.nextInt();
    evenOdd(a);
  }

  static void evenOdd(int n){
    if(n%2 == 0){
      System.out.println(n+ " is an Even number");
    }
    
    else{
      System.out.println(n+ " is an Odd number");
    }
  }
}