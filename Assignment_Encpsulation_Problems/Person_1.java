package Assignment_Encpsulation_Problems;
public class Person_1 {
    private String name;
    private int age;
    public Person_1(String name,int age){
        this.name=name;
        this.age=age;}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public int getAge() {
        return age;}
    public void setAge(int age) {
        this.age = age;}
    public static void main(String[] args) {
        Person_1 obj=new Person_1("alice",20);
        obj.setName("bob");
        obj.setAge(30);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
