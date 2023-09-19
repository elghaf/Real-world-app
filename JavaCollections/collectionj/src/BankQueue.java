import java.util.LinkedList;

public class BankQueue {
    private LinkedList<String> customers = new LinkedList<>();

    // Add a customer to the end of the queue
    public void addCustomer(String customerName) {
        customers.addLast(customerName);
    }

    // Remove and return the next customer from the front of the queue
    public String removeNextCustomer() {
        if (customers.isEmpty()) {
            throw new RuntimeException("Queue is empty. No customers to remove.");
        }
        return customers.removeFirst();
    }

    // Get the number of customers in the queue
    public int getNumCustomers() {
        return customers.size();
    }

    // Peek at the name of the next customer in the queue
    public String peekNextCustomer() {
        if (customers.isEmpty()) {
            throw new RuntimeException("Queue is empty. No next customer.");
        }
        return customers.getFirst();
    }

    // Peek at the name of the last customer in the queue
    public String peekLastCustomer() {
        if (customers.isEmpty()) {
            throw new RuntimeException("Queue is empty. No last customer.");
        }
        return customers.getLast();
    }

    // Display the names of all the customers in the queue
    public void displayCustomers() {
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}
