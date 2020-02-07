public class Teacher extends People {

    public String faculty;
        
        public Teacher(){
            
            this.faculty = "Coe";
            this.age = 30;
        }
    @Override
    public void printDetails(){
       // printDetails();

       super.printDetails();
        System.out.println("Job: "+ Job);
    }

    public static void main(String[] args)
    {
        Teacher s = new Teacher();
        s.Setname("Film");
        System.out.println("Name: "+ s.getname());
        s.printDetails();
    }
}