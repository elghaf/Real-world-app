public class AnonymousInnerClasses {
    /*create a class Animal2 */
    public static void main(String[] args){
        Animal2 animal = new Animal2(){
            @Override
            public void makeSound(){
                System.out.println("nany nandayoo");
            }

        };
        animal.makeSound();
    }
    

public static abstract class Animal2{
           public abstract void makeSound();
    }
    
}
