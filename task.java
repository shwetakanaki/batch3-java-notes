public class task {

    public static void main(String[] args) {
        // int a=23;
        // int b=a/2;
        // if(a<=1 || b%2!=0 ){
        //     System.out.println("a is prime number ");
        // }
        // else {
        //     System.out.println("a is not prime number ");
        // }

    int a=0;
    int b=1;
    int c=a+b;
    int n=10;
    System.out.print(a + " "+b+" "+c);
    for(int i=1;i<=10;i++){
        a=b;
        b=c;
        c=a+b;
        System.out.print(" "+c);
    }

    }
    
}
