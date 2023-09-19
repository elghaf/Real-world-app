public class InheritanceChallange {
    public static void main(String[] args) {
        // Step 6: Create an array of `Animal` objects
        Animal[] animals = new Animal[4];
        animals[0] = new Lion("Simba", 5);
        animals[1] = new Dog("Buddy", 3, "Golden Retriever");
        animals[2] = new Cat("Whiskers", 2, 9);
        animals[3] = new Animal("Generic Animal", 1);
        // Step 7: Loop through the array and print name, age, and sound of each animal
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name);
            System.out.println("Age: " + animal.age);
            animal.makeSound();
            System.out.println();
        }

    }

    public static class Animal {
        public String name;
        public int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeSound() {
            System.out.println("the animal makes this sound animals");
        }
    }

    public static class Dog extends Animal {
        public String breed;

        public Dog(String breed, int age, String name) {
            super(name, age);
            this.breed = breed;
        }

        @Override
        public void makeSound() {
            System.out.println("this dog make rouf rouf");
        };
    }

    public static class Cat extends Animal {
        public int lives;

        public Cat(String name, int age, int lives) {
            super(name, age);
            this.lives = lives;
        }

        // Step 5: Override the `makeSound` method
        @Override
        public void makeSound() {
            System.out.println("The cat meows");
        }
    }

    // Step 6: Create a `Lion` class that extends `Animal`
    public static class Lion extends Animal {

        public Lion(String name, int age) {
            super(name, age);
        }

        // Override the `makeSound` method for the Lion
        @Override
        public void makeSound() {
            System.out.println("The lion roars");
        }

    }
}
