public class methods {

    // methods or function: it is set of block of code which will execute whenever it is called 
    // modularity and code reusabilty 
    // two types 
    // built in :  main ,reverse (), charAt() etc 
    // user defined : zero  parametraised , parametraised 
    // syntax
    // access_specifiers access_modifiers  return_type method_name(parameters){
//     block of code;
// } 

    public static void main(String[] args) {
        // System.out.println(c);
        // test.demo(7,8);
        // System.out.println(test.a);
      demo(5,7);
      System.out.println(a);
    }


    static  int a=90;
    public static int demo(int a,int b){  // declaration ,parametarised function 
      System.out.println("this is the parametraised method  "+a);
  return 0;  //defination

}
}
