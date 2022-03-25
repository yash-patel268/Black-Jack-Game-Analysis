package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ProgramSlicer {
    public static void main(String[] args) {
        //Setup scanner method
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter input filename: ");
        //get file for static analysis
        String inputFile = scnr.next();
        System.out.println("Enter input var: ");
        //get var for static analysis
        String input = scnr.next();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                //if the var is found in file print it
                if(line.contains(input)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
