public class loopingstatement {


    public static void main(String[] args) {
        // for loopingstatement : when you know exact end or index value where to stop 
        // syntax
        //   for(initialialization ; condition ; increment/decrement){
        //     block of code 
        //   }

        // for (int i=0;i<=3;i++  ){  //false 
        //     System.out.println(i);  //0  1 2 3
        // }

        // nested for loop : for loop inside another for loop 
        // syntax
        //   for (initialialization ; condition ; increment/decrement){  outer for loop 
        //     for (initialialization ; condition ; increment/decrement){  inner for loop
        //         block of code 
        //     }
    //     block of code
   // }

    // out 3
    // inner 3

    //  for (int i=1;i<=3;i++){  //t  1  2 3  f
    //     for (int j=1;j<=3;j++){ //t  f
    //         System.out.println(j);  // 1 2 3   1 2 3  1 2 3
    //     }
    //     System.out.println();
    //  }


     // * * *
     // * * * 
     // * * * 

     //*
     //* *
     //* * *
     

     //* * *
     //  * *
     //    *

     //    *
    //   * *
    // * * *


    


    //  for (int i=1;i<=3;i++  ){ 
    //     for(int j=1;j<=3;j++) {
    //         System.out.print("* ");  //0  1 2 3
    //     }
    //     System.out.println();
    // }


        // while 
        // do while 
    
    //       for (int i=3;i>=1;i--){  // 3  2 1
    //           for (int k=1;k<=3-i;k++)  // 1 f  1
    //     {
    //       System.out.print("  ");  
    //     }
    //     for(int j=1;j<=i;j++) {
    //         System.out.print(" *");  //0  1 2 3
    //     }
      
    //     System.out.println();
    // }


    //         for (int i=1;i<=3;i++){  // 3  2 1
    //           for (int k=1;k<=3-i;k++)  // 1 f  1
    //     {
    //       System.out.print("  ");  
    //     }
    //     for(int j=1;j<=i;j++) {
    //         System.out.print(" *");  //0  1 2 3
    //     }
      
    //     System.out.println();
    // }


//   char a='A';

//             for (int i=1;i<=3;i++){  // 3  2 1
        
//         for(int j=1;j<=3;j++) {
//             System.out.print(a+" ");  // A
//             // a++;  //0  1 2 3
//         }
//       a++; 
//         System.out.println();
//     }
//     }
    

    // A B C
    // D E F
    // G H I

    // A B C   i=1  j  
    // 1 2 3   i=2  k
//     // A B C   i=3  j



//      char a='A';
//      int b=1;
//      boolean c=true;

//             for (int i=1;i<=3;i++){  // 3  2 1
//         if(c==true){
//         for(int j=1;j<=3;j++) {
//             System.out.print(a+" ");  // A
//             a++;  //0  1 2 3
//         }
//     }
// else{
//         for(int k=1;k<=3;k++){
//               System.out.print(b+" ");
//               b++;
//         }
// }
//         System.out.println();
//     }
    //while : when we dontknow the exact ending 
    // syntax : while (condition){
    //     block of code 
    // }

// boolean a=true;

// while(a==true ){
//     System.out.println("hello world");
//     a=false;
// }

//   System.out.println("======");
// int c=10;
// while(c>1){ //c=1
//     System.out.println(c);
//     c--;

// }

//   System.out.println("======");
// //c=1
// while(c<20){ //20
//      System.out.println(c);
//      c++;
// }
//   System.out.println("======");

// while(c!=4){
//     System.out.println(c);
//     c--;
// }

//do while :   before checking the condition atleast one time the do statement to be executed 
// do { 
//     block of code;
// } while (condition);

boolean d=true;
do{
    System.out.println("hello world");
    d=false;
}while(d==true);


int c=9;

do{
System.out.println(c);
c--;
}while(c>1);







    }


}
