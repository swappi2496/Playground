import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
  int a=in.nextInt();
  int b=in.nextInt();
  System.out.println(power_of_a_number(a,b));
}
  public static int power_of_a_number(int a,int b)
  {
  int power=1;
    while(b>=1){
    power=power*a;
      b--;
    }
    return power;
  }
}