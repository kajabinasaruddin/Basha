package Input_Output_Streams;
import java.io.*;

public class Externalization_Example implements Externalizable {
    String first_name;
    String last_name;
    int age;
    public Externalization_Example(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
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
/*
    This method is used to manually specify how to serialize (write) your object's fields to an output stream.
 */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        /*
        out.writeUTF(first_name);
        1.Writes the first_name string to the output stream using UTF-8 encoding.
        2.It also includes the length of the string automatically.
        3.Safe for null and handles special characters.
         */
        out.writeUTF(first_name);
        // same as out.wrietUTF();
        out.writeUTF(last_name);
        //Writes the age as a single byte (range: 0 to 255).
        out.write(age);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        first_name=in.readUTF();
        last_name=in.readUTF();
        age=in.read();
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Externalization_Example obj=new Externalization_Example("shaik","khajabi",20);
        File f=new File("C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj);
        System.out.println("serialization done");

    }

}
