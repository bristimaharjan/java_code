import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User1 implements Serializable {
    private int id;
    private String name;
    private String address;

    public User1(int id, String name, String address) {
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
}

class UserManager {
    private static final String FILE_NAME = "UserData.ser";

    public void addUser(User1 user) {
        List<User1> users = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                users.add((User1) in.readObject());
            }
        } catch (EOFException e) {
            // End of file reached, no action needed
        } catch (IOException | ClassNotFoundException e) {
            // Handle exceptions
        }

        users.add(user);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (User1 u : users) {
                out.writeObject(u);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
        }
    }

    public void viewUser() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            System.out.printf("%-10s %-30s %-30s%n", "ID", "Name", "Address");
            System.out.println("------------------------------------------------------------");

            while (true) {
                User1 user = (User1) in.readObject();
                System.out.printf("%-10d %-30s %-30s%n", user.getId(), user.getName(), user.getAddress());
            }
        } catch (EOFException e) {
            // End of file reached, no action needed
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error processing the file.");
        }
    }
}

public class ReadWriteDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager obj = new UserManager();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter address: ");
            String address = sc.nextLine();
            obj.addUser(new User1(id, name, address));
        }

        System.out.println("Users added successfully.");
        obj.viewUser();
    }
}
