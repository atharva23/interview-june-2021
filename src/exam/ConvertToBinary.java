package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {

    int binary[] = new int[40];
    int index = 0;
    while(decimal > 0){
      binary[index++] = decimal%2;
      decimal = decimal/2;
    }
    for(int i = index-1;i >= 0;i--){
      System.out.print(binary[i]);
    }
    System.out.println();//new line  
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    return "";
  }
}
