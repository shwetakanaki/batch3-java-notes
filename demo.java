class test{
     int a=90;
public  void cloud1(){
    System.out.println("hello world");
}

}



public class demo {

public  void cloud2(){
    System.out.println("hello world");
    
    new test().cloud1();
}

    public static void main(String[] args) {

        new demo().cloud2(); 
        System.out.println(new test().a);
  
        
        
    }
}
