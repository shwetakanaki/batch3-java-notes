class controlstatements {

    public static void main(String[] args) {
       // control statements : controlling the flow of execution of the program
       // 2 types 
       // conditional statements : if ,if else ,if else if , nested if else ,switch case 
       // looping statements : for , while, do while 
    

       // if : syntax 
    //    if (condition){
    //     block of code 
    //    }

//  if(true){
// System.out.println("this condition is true ");

//     }
//  if(false){
// System.out.println("this condition is false ");

//     }
// System.out.println("this condition is none ");


// syntax:
// if (condition){
//     block of code
// }
// else {
//     block of code
// }



// if(a<b){   // true 
//     System.out.println("a is less than b");
// }
// else {
//     System.out.println("b is greater than a");
// }

// if else if 
// if (condition){
//     block of code 
// }
// else if (condition){
//     block of code 
// }
// else if (condition){
//     block of code 
// }
// else {
//     block of code 
// }

int a=90;

if (a>=2 && a<15){   // false 
    System.out.println("it worls");
}
else if(a>=15 && a<25){  // true 
    System.out.println("not works");
}
else if(a>=25 && a<=30){  //true 
    System.out.println("it works");
}
else if(a<=31){  //true 
    System.out.println("it works");
}
else {
    System.out.println("none of the condition is true");
}



//nested if else
// syntax :
// if (condition){
//     if(condition){
//         block of code
//     }
//     else {
//         block of code 
//     }
// }
// else {
//     block of code

    
// }

// ex:

if(a>70 || a<100){
    if (a%2==0){
        System.out.println("a is even number");
    }
    else {
        System.out.println("a is odd number");
    }
}
else {
    System.out.println("a is not in the range of 70 to 100");
}

}
}
