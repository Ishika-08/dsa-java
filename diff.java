import java.util.Scanner;
//a program to find to difference between sum and products of digits of an integer

class Diff{
  public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
  
  System.out.println("Enter the number");
  int n= sc.nextInt();
  int sum=0, product=1;

  while(n!=0){
    sum = sum + (n%10);
    product= product * (n%10);
    n /= 10;    
  }

  System.out.println(product-sum);
}
}