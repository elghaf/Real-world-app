public class EqualsAndHachCode {
    
    public static void main(String[] args){
                // Creating instances of Person
                Person person1 = new Person("John", "Doe", 30, System.currentTimeMillis());
                Person person2 = new Person("Jane", "Smith", 25, System.currentTimeMillis());
                Person person3 = new Person("John", "Doe", 30, System.currentTimeMillis());
        
                // Testing the equals method
                System.out.println("person1 equals person2: " + person1.equals(person2)); // Should be false
                System.out.println("person1 equals person3: " + person1.equals(person3)); // Should be true
        
                // Testing hashCode
                System.out.println("HashCode of person1: " + person1.hashCode());
                System.out.println("HashCode of person2: " + person2.hashCode());
                System.out.println("HashCode of person3: " + person3.hashCode());
    }
}
