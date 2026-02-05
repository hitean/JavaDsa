import org.w3c.dom.ls.LSOutput;

public class pattern {
    public static void main(String[] args) {
        // soild rectangle
//        ************
//        ************
//        ************
//        ************
//
//        for(int j=1;j<=4;j++) {
//            for (int i = 1; i <= 20; i++)System.out.print("*");
//            System.out.println("\n");}

        // Border Rectangle
        // ************
//         *          *
//         *          *
//         ************

//
//        for(int i=1;i<=4;i++) {
//
//            if(i==1||i==4){
//            for (int j = 1; j <= 12; j++) {
//                System.out.print("*");
//            }}else{
//                System.out.print("*          *");
//            }
//
//            System.out.println("");
//        }


//        *
//        **
//        ***
//        ****

//for(int i=1;i<=50;i++){
//  for(int j=1;j!=i;j++)  {
//        System.out.print("*");
//    }
//    System.out.println();
//}



// ****
// ***
// **
// *

//for(int i=1;i<=10;i++){
//  for(int j=10;j!=i;j--)  {
//        System.out.print("*");
//    }
//    System.out.println();
//}


////           *
////          **
////         ***
////        ****
//       int n=4;
//
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//
//1
//12
//123
//1234

//        int n =4;
//        for(int i=1;i<=n;i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }

//1234
//123
//12
//1

//
//        int n = 10;
//
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

// Row 1: 1
// Row 2: 2 3
// Row 3: 4 5 6
// Row 4: 7 8 9 10
// Row 5: 11 12 13 14 15

//        int n=5,number=1;
//
//        for(int i =1;i<=n;i++){
//            for(int j =1;j<=i;j++){
//                System.out.print(number);
//                number++;
//            }
//            System.out.println(" ");
//        }


// Row 1: 1
// Row 2: 0 1
// Row 3: 1 0 1
// Row 4: 0 1 0 1
// Row 5: 1 0 1 0 1

//        int n=5;
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++) {
//                System.out.print(( (i + j) % 2 == 0 ) ? 1 : 0);
//            }
//            System.out.println("");
//        }
//


//Advance Patterns
// *      * 1s 6sp 1s
// **    ** 2s 4sp 2s
// ***  *** 3s 2sp 3s
// ******** 4s 0sp 4s
// ******** 4s 0sp 4s
// ***  *** 3s 2sp 3s
// **    ** 2s 4sp 2s
// *      * 1s 6sp 1s

        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }










    }
}
