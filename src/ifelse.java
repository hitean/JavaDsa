import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        int age,b;
        b=18;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age   ");
        age =sc.nextInt();
        if(age>b){
            System.out.println("person is adult");
        }else if(age==b){
            System.out.println("person is 18");
        }else System.out.println("person is not adult");

    }
}
