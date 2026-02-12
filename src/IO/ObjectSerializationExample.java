package IO;

import java.io.*;

public class ObjectSerializationExample {
    public static void main(String[] args) {
        Product prod1 = new Product("tv", 200, 2);
        try {
            FileOutputStream fos = new FileOutputStream("myobj.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(prod1);
            oos.close();
            fos.close();
            FileInputStream fis = new FileInputStream("myobj.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Product prodcopy = (Product) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(prodcopy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
