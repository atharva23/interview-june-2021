package exam;
import java.util.Scanner;
public class ConvertToBinary {

  public static String toBinary(int n) {

    int binary[] = new int[40];
    int index = 0;
    while(n > 0){
      binary[index++] = n%2;
      n = n/2;
    }
    for(int i = index-1;i >= 0;i--){
      System.out.print(binary[i]);
    }
    System.out.println();//new line
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    return "";
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(toBinary(n));

  }
}
