public class Casting {
    public static void main(String[] args){
        //  Widening Casting
        int varInt = 221;
        double varDouble = varInt; // Automatic casting: int to double
        System.out.println(varInt);      // Outputs 9
        System.out.println(varDouble);   // Outputs 9.0

        // Narrowing Casting
        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}
