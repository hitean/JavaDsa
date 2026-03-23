package Strings;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String name="tony";
        String fullName="Hitean Kumar";
        String sentence ="Hey, I am Hitean Kumar";

        Scanner sc=new Scanner(System.in);
        String tingu=sc.next();// after space no character will be included
        System.out.println(tingu);

        sc.nextLine(); //remove the things from the buffer

        System.out.println("full line");
        String tinguline=sc.nextLine();// to take full line as input
        System.out.println(tinguline);

        System.out.println(tinguline.length());
    }
}
