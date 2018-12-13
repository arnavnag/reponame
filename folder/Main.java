import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int roll_no = in.nextInt();
    String name = in.next();
    int mark1 = in.nextInt();
    int mark2 = in.nextInt();
    int avg = (mark1+mark2)/2;
    System.out.println(roll_no+" "+name+" "+mark1+" "+mark2+" "+avg);
  }
}