package week4_assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCheck {
    public static void main(String[] args) {
        try {
            File myFile = new File("Fila.txt");
            Scanner reader = new Scanner(myFile);

            System.out.println("File found!!!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
