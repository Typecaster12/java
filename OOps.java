
//this is custom class, so we will create this class out side the public class(class which is already present in side this file
class Pen {
    String color;
    String type;

    // Yes, classes can have their own methods/functions also;
    public void write() {
        System.out.println("Write something");
    }

    // this function will print the color of pen;
    public void printColor() {
        // here THIS keyword will tell the class which object called the function;
        System.out.println(this.color);
    }
}

// this is the public class(not created by us);
public class OOPS {
    public static void main(String args[]) {

        // calling the class's attributes using its object;
        // forming the object;
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "dot";

        // calling the function in the class;
        pen1.write();

        // color, types these are all properties of the object;
        // the methods inside the class and the dataypes in the class is known as
        // object's methods;

        pen1.printColor();

        // 2nd object;
        // here Pen() is a type of function called constrctor;
        Pen pen2 = new Pen();
        pen2.color = "Orange";
        pen2.type = "fountainpen";

        pen2.printColor();
    }
}
