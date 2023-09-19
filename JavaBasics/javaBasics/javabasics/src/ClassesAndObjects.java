public class ClassesAndObjects {
    public static void main(String[] args) {
        Car car = new Car("Toyta", "Camry", 2020);
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println(car.toString());
        

    }



    public static class Car {
        public String make;
        public String model;
        public int year;

        public Car(String ma, String mo, int yea) {
            this.make = ma;
            this.model = mo;
            this.year = yea;
        }
        @Override
        public String toString(){
            return "Details: " + this.year + " " + this.make + " " + this.model;
        }


    }
}
