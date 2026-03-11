class Gvlv{

    // global variable : the variable which is declared outside the function and inside the class
    // it can be accessed with in the same class or different class or different package  
    // it can declared as static or non static
    //
    int a=10;
    static int x;

    // local varibale : the variable which is declared inside the method is called as lv 
    //it can be accessed with in the same method where it is declared 
    // local variable must and should initialise the value 
    // it should not be static or non static 

    public static void test(){
   int x=90;
   int a=70;
    System.out.println("local"+x);
    System.out.println(Gvlv.x);
    System.out.println(new Gvlv().a);

    }
   public static void main(String[] args){
  
    System.out.println("global"+new Gvlv().a);
    //  System.out.println("global"+b);
      
     test();
     

   }
}