package com.company;

import java.util.Random;

public class Blocks extends Condo{

    private Name_blocks block;
    private int quantity;

    public Blocks (String nameCondo, String address, Name_blocks block, int quantity) {
        super(nameCondo, address);
        this.block = block;
        this.quantity = quantity;
    }

    public Name_blocks getBlock() {
        return block;
    }

    public int getQuantity() {
        return quantity;
    }



    public void getQuant (){

    }


    public final int getQuant (int quantity ){

        System.out.println("Количество квартир " + quantity);

       return quantity;
    }

    public int getQuant (int quantity, Name_blocks block ){

        System.out.println("Количество квартир в блоке  " + block + " = " + quantity);

        return quantity;
    }



}
