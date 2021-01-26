public class Constructors {
    private String name;
    private int age;
    private double height; 

    public Constructors(String n, int a, double h) {
        name = n;
        age = a;
        height = h;
    }
    public Constructors(int a) {
        age = a;
    }
    public Constructors(String b) {
        name = b;
    }

    public String getname() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double h) {
        height = h;
    }
    public void info(Constructors a) {
        System.out.println("This person's name is " + name + ", his/her age is " + age + ", and his/her height is " + height + ".");
    }
    public void alterAnimal(String a) { //Alters static variable
        BroCodeMain.animal = a;
    }
}
