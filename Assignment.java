public class Assignment {
    public int tasks;
    public String difficulty;
    public boolean submission;

    public void printDetails(){
        System.out.println("Number of tasks: "+this.tasks);
        System.out.println("Difficulty level: "+this.difficulty);
        System.out.println("Submission required: "+this.submission);
    }
    public String makeOptional(){
        String s;
        if(this.submission == true){
            s ="Assignment will not require submission";
            this.submission=false;
        }
        else{
            s ="Submission is already not required";
        }
        return s;
    }
}
