public class Course {
    public String name;
    public String code;
    public int credit;

    public void updateDetails(String name,String code,int credit){
        this.name = name;
        this.code = code;
        this.credit = credit;
    }
    public void displayCourse(){
        System.out.println("Course Name: "+this.name);
        System.out.println("Course Code: "+this.code);
        System.out.println("Course Credit: "+this.credit);
    }
}

//Tester:
// public class Tester2 {
//     public static void main(String[] args) {
//         Course c1 = new Course();
//         Course c2 = new Course();
//         c1.updateDetails("Programming Language I","CSE110", 3);
//         System.out.println("========== 1 ==========");
//         c1.displayCourse();
//         c2.updateDetails("Data Structures","CSE220", 3);
//         System.out.println("========== 2 ==========");
//         c2.displayCourse();
//         c1.updateDetails("Programming Language II","CSE111", 3);
//         System.out.println("========== 3 ==========");
//         c1.displayCourse();
//     }
// }
