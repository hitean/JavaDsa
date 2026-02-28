import java.util.*;


public class functionsAndMethods {
    // print functon
    public static void printName(String name) {
        System.out.println(name);
        return;
    }
    public static int add(int a,int b) {
      return a+b  ;
    }
    public static void main(String[] args) {
        //functions are stored in stack in memory

    int first,sec;
    printName("hitean");

    Scanner sc=new Scanner(System.in);
        first=sc.nextInt();
        sec=sc.nextInt();

        System.out.println(add(first,sec));

    }
}
