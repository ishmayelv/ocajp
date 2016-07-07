package javabasics;

/**
 * Created by paulr on 7/4/2016.
 */
public class GarbageCollection {

    public static void main(String... args) {
        System.gc(); // only 'suggests' that GC run, not guaranteed

        /*
        An object is eligible for garbage collection when it is no longer
        reachable, meaning:
        - the object no longer has any references pointing to it
        - all references to the object have gone out of scope
         */

    }

    /*
        when an object is garbage-collected,
        finalize may run zero or one time only.
        It will never run twice, even if the object is not successfully GC'ed
        It will run zero times if the GC doesn't have the time or need to run
        it. e.g. the program complete the main() method straight away
     */
    protected void finalize() {

    }
}
