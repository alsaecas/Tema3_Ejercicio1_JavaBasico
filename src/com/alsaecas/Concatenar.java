package com.alsaecas;

public class Concatenar {
    public static void main(String[] args) {
        String concatenado="";
        String[] nombres = {"Pepe", "Manolo", "Jose", "Pedro"};

        for (String nombre : nombres){
            concatenado = concatenado + nombre;
        }
        System.out.println(concatenado);
    }
}
