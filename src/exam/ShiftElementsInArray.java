package exam;
import java.util.Arrays;
import java.util.Scanner;
public class ShiftElementsInArray {

  static void rotate(int[] arr)
  {
    int x = arr[arr.length-1], i;
    for (i = arr.length-1; i > 0; i--)
      arr[i] = arr[i-1];
    arr[0] = x;
  }

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println(Arrays.toString(arr));

      rotate(arr);

      System.out.println("Rotated Array is");
      System.out.println(Arrays.toString(arr));
    }



}
