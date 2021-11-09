package com.learing;

public class DemoMain {
    public static void main(String[] args) {
        Student newStu = new Student(); //vediamo che è possibile accedere alla classe Student perché è NELLO STESSO PACKAGE
        newStu.note = 10; //POSSIAMO ACCEDERE A QUESTA VARIABILE PERCHE' E' PUBLIC
        newStu.packNote = 10; //POSSIAMO ACCEDERE ANCHE A QUESTA PERCHE' protected = visibile nello stesso package
    }
}
