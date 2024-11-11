package Bristi;

import java.io.*;
import java.util.*;

class Student implements Serializable {
    private int id;
    private String name;
    private String address;

    Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Address: " + address;
    }
}

public class Filedemo {
    public static void main(String[] args) {
        // Serialize Student List
        try {
            FileOutputStream fout = new FileOutputStream("file3.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            Scanner sc = new Scanner(System.in);
            ArrayList<Student> slList = new ArrayList<>();

            // Take input for 3 students
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter id: ");
                int id = sc.nextInt();
                sc.nextLine();  // Consume newline left-over
                System.out.println("Enter name:");
                String name = sc.nextLine();
                System.out.println("Enter Address:");
                String address = sc.nextLine();

                // Add the student object to the list
                slList.add(new Student(id, name, address));
            }

            // Serialize the student list to file
            out.writeObject(slList);
            out.close();
            System.out.println("Student list serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Deserialize Student List
        try {
            FileInputStream fin = new FileInputStream("file3.txt");
            ObjectInputStream in = new ObjectInputStream(fin);

            // Read the list of students from the file
            ArrayList<Student> readList = (ArrayList<Student>) in.readObject();
            in.close();

            // Print out the deserialized student objects
            for (Student student : readList) {
                System.out.println(student); // Calls toString method
            }

        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}
