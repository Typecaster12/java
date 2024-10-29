
/*
class Employee{
    //attributes
    String name;
    int salary;

    //function to print name;
    public String printName(){
       return name;
    }

    //function to print salary;
    public int printSalary(){
        return salary;
    }

    //function to change name;
    public void changeName(String n){
        name = n;
    }
}
 */

//2nd qurstion
/*
class CellPhone{
    //mehtods;
    public void ring(){
        System.out.println("Ringing....");
    }

    public void call(){
        System.out.println("Calling....");
    }
}
 */


//3rd question;
//initialise the side of square and  write method to find its area and perime;
/*
class Square{
    int side;

    //methods;
    public int calculateArea(){
        int area = side*side;
        return area;
    }

    public int calculatePerimeter(){
        int perime = 4*side;
        return perime;
    }
}
 */


//4th question;
class Tommy{
    public void Hit(){
        System.out.println("Hiting the enemy");
    }

    public void Run(){
        System.out.println("Running from enemy");
    }

    public void Fire(){
        System.out.println("firing on the enemy");
    }
}

public class OopsConcepts {
    public static void main(String[] args){

        //object of Employee class;
        /*(
        Employee emp1 = new Employee();
        emp1.name = "Harsh";
        emp1.salary = 200;

        System.out.println(emp1.printName());
        System.out.println(emp1.printSalary());

        //changing the name
        emp1.changeName("Tony");
        System.out.println(emp1.printName());
         */


        //2nd questions's object;
        /*
        CellPhone phn = new CellPhone();
        phn.call();
        phn.ring();
         */


        //3rd question;
        /*
        Square sq = new Square();
        sq.side = 15;

        System.out.println(sq.calculateArea());
        System.out.println(sq.calculatePerimeter());
         */


        //4th question;
        Tommy gta = new Tommy();

        gta.Hit();
        gta.Fire();
        gta.Run();
    }
}
