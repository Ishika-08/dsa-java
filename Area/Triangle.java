import java.lang.Math;
public class Triangle{
  public int getArea(int a, int b, int c){
    int s = (int) (a+b+c)/2;
    int area=  (int) Math.sqrt(s* (s-a)* (s-b)* (s-c));
    return area;
  }

  public int getPerimeter(int a, int b, int c){
    int s = a+b+c;
    return s;
  }
}