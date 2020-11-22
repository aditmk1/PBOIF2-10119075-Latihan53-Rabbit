/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan53.rabbit;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan Rabbit
 */
public class Rabbit extends Animal {
    private String color;
    private String name;

    public Rabbit(boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
    }
    
    

    public Rabbit(String name,boolean vegetarian, String food, int legs,String color) {
        super(vegetarian, food, legs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        System.out.println("Peter color is grey");
        return color;
    }

    public String getName() {
        System.out.println("Hello,his name is Peter");
        return name;
    }
            

}