package Input_Output_Streams;

import java.io.*;

public class Exetrnal_deSerialization_EXample implements Externalizable {
    String first_name;
    String last_name;
    int age;

    // No-arg constructor required for Externalizable
    public Exetrnal_deSerialization_EXample() {
    }

    public Exetrnal_deSerialization_EXample(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(first_name);
        out.writeUTF(last_name);
        out.writeInt(age); // Correct for int
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        first_name = in.readUTF();
        last_name = in.readUTF();
        age = in.readInt(); // Correct for int
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "C:\\Users\\SK NAZEER PASHA\\Desktop\\Alice.txt";

        // Serialize the object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        Exetrnal_deSerialization_EXample obj = new Exetrnal_deSerialization_EXample("Shaik", "Khajabi", 25);
        oos.writeObject(obj);
        oos.close();

        // Deserialize the object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Object o = ois.readObject();
        ois.close();

        Exetrnal_deSerialization_EXample e = (Exetrnal_deSerialization_EXample) o;
        System.out.println("Deserialized: " + e.first_name + " " + e.last_name + " " + e.age);
    }
}
