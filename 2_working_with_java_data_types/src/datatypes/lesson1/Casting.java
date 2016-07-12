package datatypes.lesson1;

/*
    Explicit casting is required when 'narrowing' types, i.e.
    trying to put a value from a larger type into a smaller type.
    Literals that fit into the range of the smaller types will not require a
    cast. However literals that exceed the range, and expressions, will require
    an explicit cast.

    Remember that whole number literals are stored as int by default.
 */
public class Casting {

    public static void main(String[] args) {
        /*
            byte has range -128 to 127
         */
        byte b = -128; // int literal in range, no cast required
        byte b2 = (byte)128; // int literal exceed range, cast required

        byte b3 = 126;
        byte b4 = 1;
        byte b5 = (byte)(b3 + b4); // b4 and b4 promoted to int, cast required

        byte b6 = 126;
        byte b7 = (byte)(b6 + 1); // b6 and 1 promoted to int, cast required
    }
}