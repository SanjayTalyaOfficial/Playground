// import the respective packages
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main{
  public static void main (String[] args) throws IOException{
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    File oldFile = new File(s);
    String snew = sc.next();
    File newFile = new File(snew);
    if(oldFile.renameTo(newFile))
      System.out.println("Renamed successfully");
    else
      System.out.println("error");
  }
}