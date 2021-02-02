// import the respective packages
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main{
  public static void main (String[] args) throws IOException{
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String  filename = sc.next();
    File oldFile = new File(filename);
    if(oldFile.delete())
      System.out.println("File deleted");
    else
      System.out.println("File was not deleted");
  }
}