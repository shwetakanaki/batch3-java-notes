class operators {

    // it do some operations between two operands 

    // Arithmetic operators :  +,-,*,/,%,++,--,**,
    // logical operators : &&, ||, !
    // relational operators : >,>=,<,<=,==,!=
    // bitwise operators :  &,| ,^,~, << ,>>
    // assignment operators : =,=+,=-,=*,=/,=%
public static void main(String[] args) {
    int a=10;
    int b=90;
//     System.out.println("addition a and b ="+(a+b)); //100
//     System.out.println("subtraction a and b ="+(a-b)); //-80
//     System.out.println("multiplication a and b ="+(a*b)); //900
//     System.out.println("division a and b ="+(b/a)); //9
//     System.out.println("modulus a and b ="+(b%a)); //0

//     System.out.println("post increament of a=" + (a++)); // 10
//     System.out.println(a); //11
    
//     System.out.println("pre increament of a=" +(++a)); //12
//  System.out.println("pre decreament of a=" +(--a)); //11
//   System.out.println("post decreament of a=" +(a--)); //11
//    System.out.println(a);//10

System.out.println("logical operartors");
System.out.println("=============");
System.out.println(a>b && a<b);

System.out.println(a>b && a<b && a!=b);
System.out.println(a>b || a<b || a!=b);
System.out.println(!(a>b && a!=b|| a<b ));

System.out.println("bitwise operartors");
System.out.println("=============");

System.out.println(a & b);

System.out.println(a |b);


int c=254;
System.out.println((a+c) &b|c);

System.out.println(a<<2);
System.out.println(a>>2);

a+=2;  // a= 10+2
System.out.println(a);

        
    }


    
}
