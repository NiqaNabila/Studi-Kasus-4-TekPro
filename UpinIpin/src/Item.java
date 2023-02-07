/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Item {
    //Deklarasi Variabel
    private String name;
    private Item(){
        name = "Ipin";
    }
    public Item(String name){
        //this.name = new Item().name;
        this();
        System.out.println(this.name);
    }
}
