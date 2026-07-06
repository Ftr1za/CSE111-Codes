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