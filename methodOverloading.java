public class overloadedMethod {
    //two functions having same name but different parameters are overloading function;
    //function number1;
    public static void hello(){
        System.out.println("Hello there");
    }


    //function 2;
    public static void hello(String name){
        System.out.println("Hello there " + name);
    }


    //function 3;
    public static void hello(String name1, String name2){
        System.out.println("Hello there " + name1 + " and " + name2);
    }


    public static void main(String[] args){
        //function 1;
        hello();

        //function 2;
        hello("harsh");

        //function 3;
        hello("tony", "rody");
    }
}
