/*
Declare, instantiate, initialize and use a one-dimensional array
 */
public class Lesson1 {

    public static void main(String... args) {
        String[] stringArray = new String[10];
        stringArray[0] = "Hi";
        stringArray[3] = "Greetings";

        /*
            Square brackets can be next to variable name, against convention
            Array can be given initial values. Size (.length) is based on these
         */
        int intArray[] = {1,2,3,4};
        System.out.println(intArray.length);

        /*
            A longer syntax using new type[] { }
         */
        boolean[] booleanArray = new boolean[] {true,false};


        /*
            The trailing comma is NOT a mistake!
            It is there for convenience of editing
         */
        int intArray2[] = {1,2,3,4,     };
        System.out.println(intArray2.length);

        /*
            Passing arguments to an array parameter
         */
        new Lesson1().printValues(new String[]{"Hi","There"});

        /*
            Copying an array
            Could use a loop, but the below is preferred and more flexible
         */
        int[] newIntArray = new int[10];
        System.arraycopy(intArray,0,newIntArray,0,intArray.length);

    }

    public void printValues(String[] stuffs) {
        for(String stuff : stuffs) {
            System.out.println(stuff);
        }
    }
}
