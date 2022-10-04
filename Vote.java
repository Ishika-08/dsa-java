import java.util.Scanner;
class Vote{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the age:");
    int n= sc.nextInt();
    eligiblity(n);
  }

  static void eligiblity(int n){
    if(n>=18){
      System.out.println("This person is eligible for voting!!");
    }
    else{
      System.out.println("This person is not eligible for voting!!");
    }
  }
}