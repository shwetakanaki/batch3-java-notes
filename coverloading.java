public class coverloading {
     //defining the multiple constructor with same name  inside class by differing in the no of parameter 
    // postion of the parameter ,datatype of the parameter
    public coverloading(){
    System.out.println("this is the zero parameter constructor ");
    }
    public coverloading(int a){
          System.out.println("this is the parameter constructor  with a value ="+a);

    }
    public coverloading(int b , int a){
  System.out.println("this is the parameter constructor  with a value and b value  ="+a+" "+b);
    }
       public coverloading(float b , int a){
         System.out.println("this is the parameter constructor  with a value and b value  ="+a+" "+b);
    }

     public static void main(String[] args) {
      coverloading c1= new coverloading();
      coverloading c2= new coverloading(6);
      new coverloading(4.0f,2 );
      new coverloading(6, 7);
     }
    
}
