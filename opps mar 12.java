// An example of method overloading
class Student {
    String name,surname;
    int rollNo;
   
    public void showStudentDetails(String name) {
        System.out.println("The name of the student is " + name);
    }
 
    public void showStudentDetails(int rollNo) {
        System.out.println("the roll no of the student is "+ rollNo);
    }
 
    public void showStudentDetails(String name, String surname, int rollNo) {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(rollNo);
    }
   
   // Main Method
   public static void main(String args[]){
     
         // Student object Created
         Student st=new Student();
     
         // Method Overloading
         st.showStudentDetails("Ank");
         st.showStudentDetails(3);
         st.showStudentDetails("Ank","Na",3);
   }

 }


 /////////////////////////////////////////////////////////
 // Method Overriding Example

// Base Class
class Parent {
    void show() { System.out.println("Parent's show()"); }
}

// Inherited class
class Child extends Parent {
    // This method overrides show() of Parent
    @Override void show()
    {
        super.show();
        System.out.println("Child's show()");
    }
}

// Driver class
class Main {
    public static void main(String[] args)
    {
        Parent obj = new Child();
        obj.show();
    }
}


//////////////////////////////////////
// abstraction
//implementation of abstraction through abstract class
abstract class Animal {
    abstract void walk();
    void eat()
    {
        System.out.println("The animal is eating.");
    }
    Animal()
    {
        System.out.println(
            "An Animal is going to be created.");
    }
}

class Cow extends Animal {
    Cow() { System.out.println("You have created a Cow"); }
    void walk() { System.out.println("Cow is walking."); }
}

class Goat extends Animal {
    Goat()
    {
        System.out.println("You have created a Goat");
    }
    void walk() { System.out.println("Goat is walking."); }
}

public class OOPS {
    public static void main(String args[])
    {
        Cow cow = new Cow();
        cow.walk();
        cow.eat();
        Goat goat = new Goat();
        goat.walk();
        goat.eat();
    }
}
/////////////////////////////////////////////////////////
// encapsulation
//simple demonstration of encapsulation
//It has a private data member and getter and setter methods.  
public class Student{  
    //private data members  
    private String name;  
      private int rollNo;
    //public getter method to access the name  
    public String getName(){  
        return name;  
    }  
  //public getter method to access rollNo  
    public int getRollNo(){  
        return rollNo;  
    } 
//public setter method to set name  
    public void setName(String name){  
            this.name=name  
    }  
  //public setter method to set rollNo  
    public void setRollNo(int rollNo){  
            this.rollNo=rollNo;  
    }  
}  
  /////////////////////////////////////
//   object/
class Student{
    String name;
    String surname;
    int rollNo;
    Student(String studentName, String studentSurname, int studentRollNo){
      this.name= studentName;
      this.surname = studentSurname;
      this.rollNo= studentRollNo;
    }
    public void getStudentDetails(){
      System.out.println("The name of the student is "+ this.name +" "+ this.surname);
      System.out.println("The roll no of the student is "+ this.rollNo);
    }
  }
  class OOPS{
     public static void main(String args[]) {
         Student student1 = new Student("Vivek", "Yadav" , 20);
         student1.getStudentDetails();
     }
  }
  