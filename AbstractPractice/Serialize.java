package AbstractPractice;

import java.io.*;

public class Serialize implements Serializable{
    public static Dog corki = new Dog("corki");
    public static Dog wax = new Dog("wax");
    public static Dog alex = new Dog("alex");
    transient final Cat ass = new Cat("ass");
	public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serialize testing = new Serialize();
        FileOutputStream fos = new FileOutputStream("./Dog.jaehyuck");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(testing);
        os.close();
        
    }
}