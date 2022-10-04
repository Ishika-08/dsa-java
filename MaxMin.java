import java.util.Scanner;
class MaxMin{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int x= sc.nextInt();
    int y= sc.nextInt();
    int z= sc.nextInt();
    System.out.println("Largest number is: " +num(x,y,z));
    
  }

  public static int num(int a, int b, int c){
    if(a>b && a>c){
      return a;
    }
    if(b>a && b>c){
      return b;
    }
    if(c>a && c>b){
      return c;
    }
  return 0;
  }
}