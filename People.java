public class People{
    public String name;
    public int age; 

    public void Setname(String n)
    {
       this.name = n;
    }
    public String getname() {
        
        return this.name;

    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
