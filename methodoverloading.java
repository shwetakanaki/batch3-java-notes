public class methodoverloading {
 
    //defining the multiple methods with same name  inside class by differing in the no parameter of 
    //  method ,postion of the parameter ,datatype of the parameter  

    public static void test(){
        System.out.println("this is the zero parameter test()");
    }

    public static void test(int a){
  System.out.println("this is the test(int a) a value is "+a);
    }
    public static void test(int b,int a ){
   System.out.println("this is the test(int b ,int a) a value and b value is "+a+" "+b);
    }
public static void test(float b, char a, int d){
 System.out.println("this is the test(float b ,char a,int d) b value and a value and d value  is "+a+" "+b+""+d);
}

    public static void main(String[] args) {
        test();
        test(7);
        test(4, 9);
        test(8.0f, 's',5 );

        
    }
}
