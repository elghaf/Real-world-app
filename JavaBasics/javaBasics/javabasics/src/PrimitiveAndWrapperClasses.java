public class PrimitiveAndWrapperClasses {
    
    public static void main(String[] args){
        /*
         * Declaration of primiteve variabels
         */
        int primitiveInt = 5;
        double primitiveDouble = 3.5;
        boolean primitiveBool = true;

        /*
         * Convert primitive variable to wrapper objects
         */
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        Boolean wrapperBoolean = Boolean.valueOf(primitiveBool);

        /*
         * print the value of the wrapper object
         */
        System.out.println("wrapper int : " + wrappedInt);
        System.out.println("wrapper Double : " + wrapperDouble);
        System.out.println("wrapper Bool : " + wrapperBoolean);
    }
}
