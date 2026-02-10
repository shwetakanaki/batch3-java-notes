class variables {
    static int a; // declaration
    static int b=20;
    static int c,d=30;
    static char f;
public static void main(String[] args) {
    a=10; // initialization
    // c=90;
    // d=100;
    System.out.println(c); //30
    System.out.println(d);//30
    System.out.println(f);
    System.out.println("a value is "+a+" b value is "+b);
     System.out.println("a value is "+a+b); // 1020
      System.out.println("a value is "+(a+b)); //30
}
    
}
