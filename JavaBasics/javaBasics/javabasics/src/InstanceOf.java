public class InstanceOf {
    public static void main(String[] args){
        //main application entry

        // array of object : lets create a function or loop to see the type of instance

        Object[] objects =  {
            10,
            "Hello",
            true,
            20.5
        };
        //Loop through the array and use instanceOf to determine the type of each instance
        for (Object obj : objects) {
            if (obj instanceof Integer) {
                System.out.println("Integer: " + obj);
            } else if (obj instanceof String) {
                System.out.println("String: " + obj);
            } else if (obj instanceof Boolean) {
                System.out.println("Boolean: " + obj);
            } else if (obj instanceof Double) {
                System.out.println("Double: " + obj);
            } else {
                System.out.println("Unknown type: " + obj);
            }
        }
    }
}
