
import java.util.*;
import java.io.*;
class User implements Serializable{
    int id;
    String name;
    String address;
    public User(int id, String name, String address){
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
class UserManager{
    public void addUser(User user) {
        List<User> users = new ArrayList<>();
        try {
            FileInputStream fin = new FileInputStream("UserData.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            try{
                while(true){
                    users.add((User)in.readObject());
                }
            }catch(EOFException e){
            }
            in.close();
            fin.close();
        }catch(Exception e){
        }
        users.add(user);
        try{
            FileOutputStream fout = new FileOutputStream("UserData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            for(User u : users){
                out.writeObject(u);
            }
            out.close();
            fout.close();
            //System.out.println("User added successfully.");
        }catch(IOException e){
            System.out.println("An error occured while processing the file.");
        }
    }
    public void viewUser(){
        try{
            FileInputStream fin = new FileInputStream("UserData.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            System.out.println();
            System.out.printf("%-10s %-30s %-30s", "ID", "Name", "Address");
            System.out.println();
            System.out.println("______________________________________________________");
            try{
                while(true){
                    User user = (User)in.readObject();
                    System.out.printf("%-10s %-30s %-30s", user.getId(), user.getName(), user.getAddress());
                    System.out.println();
                }
            }catch(ClassNotFoundException e){
                System.out.println("Error: File not found.");
            }
        }catch (IOException e){
            System.out.println("Error processing the file.");
        }
    }
}
public class ReadWriteDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager obj = new UserManager();
        for(int i=0; i<5; i++) {
            System.out.print("Enter id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name : ");
            String name = sc.nextLine();
            System.out.print("Enter address : ");
            String address = sc.nextLine();
            obj.addUser(new User(id, name, address));
        }
        System.out.println("Users added successfully.");
        obj.viewUser();
    }
}
