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
