public class Main {
    public static void main(String[] args) {
        //referance type
        CustomerManager customerManager = new CustomerManager();  //Garbage Collector
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
}
