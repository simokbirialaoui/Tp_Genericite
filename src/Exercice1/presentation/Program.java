package Exercice1.presentation;

import Exercice1.metier.StorageGenerique;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        StorageGenerique<Integer> storageInt = new StorageGenerique();
        storageInt.addElement(1);
        storageInt.addElement(2);
        storageInt.addElement(3);
        System.out.println("Elements in storageInt:");

        for(int i = 0; i < storageInt.getSize(); ++i) {
            System.out.println(storageInt.getElement(i));
        }

        StorageGenerique<String> storageString = new StorageGenerique();
        storageString.addElement("Hello");
        storageString.addElement("World");
        storageString.addElement("!");
        System.out.println("\nElements in storageString:");

        for(int i = 0; i < storageString.getSize(); ++i) {
            System.out.println((String)storageString.getElement(i));
        }

        StorageGenerique<Double> storageDouble = new StorageGenerique();
        storageDouble.addElement(3.14);
        storageDouble.addElement(2.718);
        storageDouble.addElement(1.0);
        System.out.println("\nElements in storageDouble:");

        for(int i = 0; i < storageDouble.getSize(); ++i) {
            System.out.println(storageDouble.getElement(i));
        }

    }
}