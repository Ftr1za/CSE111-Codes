public class MobilePhone {
    public int contactCount;
    public String [] contactName = new String[0];
    public int nameIndex;
    public int [] contactNum = new int[0];
    public int numIndex;
    public void setContactCapacity(int capacity){
        String [] contacts = new String[capacity];
        this.contactName = contacts;
        int [] numbers = new int[capacity];
        this.contactNum = numbers;
        this.contactCount = capacity;
    }
    public void details(){
        System.out.println("Total Contacts: "+this.nameIndex);
        System.out.println("Contact List:");
        for(int i=0; i<contactName.length;i++){
            if(contactName[i]!=null) {
                System.out.println(contactName[i] + ":" + contactNum[i]);
            }
        }
    }
    public void addContact(String name, int number){
        if(nameIndex<contactCount){
            this.contactName[nameIndex]=name;
            System.out.println("The contact of "+this.contactName[nameIndex]+" is added.");
            nameIndex++;
            this.contactNum[numIndex]=number;
            numIndex++;
        }
        else{
            System.out.println("Storage Full!!");
        }
    }
    public void makeCall(int number){
        boolean check = false;
        for(int i=0; i < contactName.length; i++){
            if(contactNum[i]==number){
                System.out.println("Calling "+this.contactName[i]+" . . .");
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("Calling "+number+" . . .");
        }
    }
}

//Tester:
// public class MobilePhoneTester{
//  public static void main(String args []){
//  MobilePhone m1 = new MobilePhone();
//  MobilePhone m2 = new MobilePhone();
//  m1.setContactCapacity(5);
//  m2.setContactCapacity(100);
//  m1.details();
//  System.out.println("1----------------");
//  m1.addContact("John", 9866);
//  m1.addContact("Maria", 7865);
//  System.out.println("2----------------");
//  m1.details();
//  System.out.println("3----------------");
//  m1.makeCall(9866);
//  System.out.println("4----------------");
//  m1.addContact("Henry", 2365);
//  System.out.println("5----------------");
//  m1.makeCall(7552);
//  m1.makeCall(2365);
//  System.out.println("6----------------");
//  m1.addContact("Gomes", 4589);
//  m1.addContact("Antony", 8421);
//  m1.addContact("Tony", 5789);
//  System.out.println("7----------------");
//  m1.details();
//  }
// }
