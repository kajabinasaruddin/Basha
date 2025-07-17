package Input_Output_Streams;
import java.io.*;
public class Object_output_Stream_Example implements Serializable{
    String name;
    int age;
    int year;

    public Object_output_Stream_Example(String name, int age, int year) {
        this.name = name;
        this.age = age;
        this.year = year;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) throws IOException {
        Object_output_Stream_Example ob=new Object_output_Stream_Example("yamini",22,2002);
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        FileOutputStream obj=new FileOutputStream(f);
        ObjectOutputStream obj1=new ObjectOutputStream(obj);
        obj1.writeObject(ob);
        System.out.println("serialization completed");

    }
}
