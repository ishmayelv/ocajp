/**
     1.5 Compare and contrast the features and components of Java such as:
     platform independence, object orientation, encapsulation, etc.
     Topics:
     - encapsulation
     - object-oriented
     - performance
     - platform independent
     - robust
     - simple
     - secure
*/

/*
    Benefits of Java:
    - encapsulation
    - object-oriented
    - performance
    - platform independent
    - robust
    - simple
    - secure

    Overview
    ---
    Java combines benefits of compiled and interpreted languages. This results
    in high performance and portability.

    Encapsulation
    ---
    - aspect of object-orientation
    - 'safer' programming, reduces coupling, reduces bugs

    Object-oriented
    ---
    - objects have state and manage their own state
    - more representative of problem domain; greater re-use
    - lower coupling, higher cohesion, changes more isolated
    - less and easier maintenance

    Performance
    ---
    - JVM faster than interpreted language
    - multi-threaded, using multiple CPU cores
    - in some circumstances, JVM can dynamically convert Java bytecode to native code

    Platform independent
    ---
    - Compiles into bytecode that can run on Java VMs on different platforms
    - "Write once, run anywhere"

    Robust
    ---
    - no memory-management, like pointers in C
    - garbage-collection, JVM automatically deallocate un-used objects

    Secure
    ---
    - runs inside the JVM limiting access to operating system

    Simple
    ---
    - no pointers or operator overloading
*/

import lesson5.GarbageCollection;

public class Lesson5 {

    public static void main(String[] args) {
        GarbageCollection gc = new GarbageCollection();
        gc.runGc();
    }

}
