class ParentClass {
    // Final method cannot be overridden
    public final void displayMessage() {
        System.out.println("This is a final method from ParentClass.");
    }
}

class ChildClass extends ParentClass {
    // Attempting to override this method will cause a compile-time error
    // public void displayMessage() {
    //     System.out.println("Trying to override final method.");
    // }
}

public class Final {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.displayMessage();  // Calls the final method from ParentClass
    }
}
