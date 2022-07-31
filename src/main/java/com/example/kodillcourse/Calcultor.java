package com.example.kodillcourse;


import java.lang.*;


public class Calcultor {

    public int AplusB(int a, int b) {
        return a + b;
    }

    public int AminesB(int a, int b) {
        return a - b;
    }
}
    class Application {
        public static void main(String[] args) throws Exception {
            Calcultor calcultor = new Calcultor();
            int result = calcultor.AplusB(99, 66);
            int result1 = calcultor.AminesB(955, 32);


            System.out.println(result);
            System.out.println(result1);

        }
    }




