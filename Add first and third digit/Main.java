import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int x=num/100;
      int y=num%10;
      int z=x+y;
      System.out.println(z);
		// Type your code here
	}
}