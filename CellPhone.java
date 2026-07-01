public class CellPhone {
    public String model = "unknown";
    public String [] contacts = new String[3];
    public int storedContacts;

    public void printDetails(){
        System.out.println("Phone Model "+ this.model);
        System.out.println("Contacts Stored "+ this.storedContacts);
        if(this.storedContacts>0){
            System.out.println("Stored Contacts: ");
            for(int i=0;i < this.storedContacts;i++){
                System.out.println(contacts[i]);
            }
        }
    }
    public void storeContact(String contact){
        if(storedContacts==3){
            System.out.println("Memory full. New contact can't be stored.");
        }
        else {
            this.contacts[storedContacts] = contact;
            storedContacts++;
            System.out.println("Contact Stored");
        }
    }
}

//Tester:
// public class Tester4 {
//     public static void main(String[]args){
//         CellPhone phone1 = new CellPhone();
//         phone1.printDetails();
//         phone1.model ="Nokia 1100";
//         System.out.println("1##################");
//         phone1.storeContact("Joy - 01834");
//         System.out.println("===================");
//         phone1.printDetails();
//         System.out.println("2##################");
//         phone1.storeContact("Toya - 01334");
//         phone1.storeContact("Aayan - 01135");
//         System.out.println("===================");
//         phone1.printDetails();
//         System.out.println("3##################");
//         phone1.storeContact("Sani - 01441");
//         System.out.println("===================");
//         phone1.printDetails();
//     }
// }
