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


        int n = 10;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }



    }
}
