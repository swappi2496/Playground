import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr_size[]=new int[n];
      for(int i =0;i<n;i++){
      arr_size[i]=in.nextInt();
      }
      int max=arr_size[0];
      for(int i=0;i<n;i++){
      if(max < arr_size[i]){
      max=arr_size[i];
      }
      }
      System.out.println(max);
    }
}