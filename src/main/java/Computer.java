public class Computer {

   //Create a class to represent a Computer. A computer should have a numeric value representing how much storage space it has
    // (which will be different for every computer) and a string representing the model of printer it is connected to.
    // Every computer starts without a printer connected.

    int storage;
    String printer = "";

    public Computer(int storage) {
        this.storage = storage;
    }

    //Use a getter to find out how much storage a computer has
    public int getStorage() {
        return this.storage;
    }

    //Write a method to add more storage to the computer. We will need to say how much extra storage we want to add when we call the method.
    public void addStorage(int storage){
        this.storage = this.storage + storage;
    }

    //Use a setter to update the printer property for the computer.
    public void setPrinter(String printer) {
        this.printer = printer;
    }

    public String getPrinter() {
        return this.printer;

    }

    // 5. Write a method to print a message.
    // To test this works *without* a printer too you can comment out the code for question 4

    public void printMessage(String message) {
        if (!printer.isEmpty()) {
            System.out.println( message );
        }

    }
}
