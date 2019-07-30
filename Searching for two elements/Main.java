import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
      }
      int search1=in.nextInt();
      int search2=in.nextInt();
      int ele_1_idx=-1;
      int ele_2_idx=-1;
      for(int idx=0;idx<n;idx++){
      if(search1==arr[idx])
      {
      ele_1_idx=idx;
      }
        if(search2==arr[idx]){
        ele_2_idx=idx;
        }
      }
      System.out.println(ele_1_idx);
      System.out.println(ele_2_idx);
    }
}