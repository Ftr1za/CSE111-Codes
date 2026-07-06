public class Employee {
    public String name;
    public double salary = 30000.0;
    public String designation = "junior";

    public void newEmployee(String name){
        this.name=name;
    }
    public void displayInfo(){
        System.out.println("Employee Name: "+this.name);
        System.out.println("Employee Salary: "+this.salary+" Tk");
        System.out.println("Employee Designation: "+this.designation);
    }
    public void calculateTax(){
        double tax;
        if(this.salary<=30000){
            System.out.println("No need to pay tax");
        }
        else if(this.salary>30000 && this.salary<=50000){
            tax = (salary/100.0)*10;
            System.out.println(this.name+" Tax Amount: "+tax+" Tk");
        }
        else if(this.salary>50000){
            tax = (salary/100.0)*30;
            System.out.println(this.name+" Tax Amount: "+tax+" Tk");
        }
    }
    public void promoteEmployee(String position){
        this.designation= position;
        if(position.equals("senior")){
            this.salary+=25000;
        }
        else if(position.equals("lead")){
            this.salary+=50000;
        }
        else if(position.equals("manager")){
            this.salary+=75000;
        }
        System.out.println(this.name+" has been promoted to "+this.designation);
        System.out.printf("New Salary: %.2f Tk",this.salary);
        System.out.println();
    }
}

//Tester:
// public class Tester9{
//  public static void main(String[] args){
//  Employee emp1 = new Employee();
//  Employee emp2 = new Employee();
//  Employee emp3 = new Employee();

//  emp1.newEmployee("Harry Potter");
//  emp2.newEmployee("Hermione Granger");
//  emp3.newEmployee("Ron Weasley");
//  System.out.println("1 ==========");
//  emp1.displayInfo();
//  System.out.println("2 ==========");
//  emp2.displayInfo();
//  System.out.println("3 ==========");
//  emp3.displayInfo();
//  System.out.println("4 ==========");
//  emp1.calculateTax();
//  System.out.println("5 ==========");
//  emp1.promoteEmployee("lead");
//  System.out.println("6 ==========");
//  emp1.calculateTax();
//  System.out.println("7 ==========");
//  emp1.displayInfo();
//  System.out.println("8 ==========");
//  emp3.promoteEmployee("manager");
//  System.out.println("9 ==========");
//  emp3.calculateTax();
//  System.out.println("10 ==========");
//  emp3.displayInfo();
//  }
// }
