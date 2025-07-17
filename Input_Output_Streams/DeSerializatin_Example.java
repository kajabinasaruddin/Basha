package Input_Output_Streams;
import java.io.*;
public class DeSerializatin_Example implements Serializable{
    String First_name;
    String last_name;
    int age;
    private String getLast_name;
    public DeSerializatin_Example(String first_name, String last_name, int age) {
        First_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }
    public String getFirst_name() {
        
        return First_name;
    }
    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        FileInputStream fi=new FileInputStream(f);
        ObjectInputStream ob=new ObjectInputStream(fi);
        Object obj1=ob.readObject();
        Serializatin_Example obj = (Serializatin_Example) obj1;

        System.out.println("completed");
        System.out.println(obj.getFirst_name()+" " +obj.getLast_name()+" "+ obj.getAge());

//        File f=new File("I:\\customer.ser");
//        FileInputStream fos=new FileInputStream(f);
//        ObjectInputStream oos=new ObjectInputStream(fos);
//        Object obj = oos.readObject();
//        Customer c=(Customer)obj;
//        System.out.println(c.getCno()+"-"+c.getCname()+"-"+c.getLoc());

    }
}
