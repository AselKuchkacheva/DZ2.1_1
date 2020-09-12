package com.company;

public final class Flats extends Blocks{

    private final int quantityRooms;
    private int number;

    public Flats(String nameCondo, String address, Name_blocks block, int amount, int number, int quantityRooms) {
        super(nameCondo, address, block, amount);
        this.number = number;
        this.quantityRooms = quantityRooms;
    }

    public int getNumber() {
        return number;
    }

    public int getQuantityRooms() {
        return quantityRooms;
    }

    @Override

    public int getQuant (int quantity, Name_blocks block){

        System.out.println("Количество квартир в блоке - " + block + " = " + quantity);

        return quantity;
    }


}
