class test{
    public test(){  // zero parametraised
     System.out.println("hello world ");
    }
    public test(int a){  // parametraised
        System.out.println("a value "+ a);
    }

    public void demo(){
          System.out.println("this is the demo function");
    }

}



public class constructor {
    public static void main(String[] args) {
        
     test t1=new test();
     t1.demo();
     test t2=t1;
    t2= new test();
    t1.test();

    //   int a=90;
    //   a=80;

    //  new test();
    //  new test();
    //   System.out.println(t1);
    //  test t2= new test(90);
    //   System.out.println(t2);


    
    }
}
