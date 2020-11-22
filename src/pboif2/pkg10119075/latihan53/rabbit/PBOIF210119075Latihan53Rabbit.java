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
Deskripsi Program : Program ini berisi program untuk menampilkan Rabbit utama
 */

public class PBOIF210119075Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rabbit rabbit = new Rabbit("Peter", false,"grass", 4,"grey");
       System.out.println("Hello, his name is "+rabbit.getName());
       System.out.println(rabbit.getName()+" is vegetarian? "+rabbit.isVegetarian());
       System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs");
       System.out.println(rabbit.getName()+" color is "+rabbit.getColor());
    }
    
}