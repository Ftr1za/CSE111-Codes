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
