package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            int div = 0/0;
            System.out.println("PROBANDO.");
        }catch (Exception e){
            System.out.println("Evitar propagación");
        }
    }
}
