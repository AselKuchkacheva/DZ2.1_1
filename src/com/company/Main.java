package com.company;

public class Main {

    public static void main(String[] args) {
	// В главном классе (Main) Создать
        // объект класса 2-го уровня (objectA) и
        // 2 объекта класса 3-го уровня (objectB, objectC),
        // также распечатать все свойства объектов и
        // вызвать перегруженные методы через каждый из экземпляров ваших объектов.


        Blocks block = new Blocks("Чистый Бишкек", "ул. Манаса, 10", Name_blocks.A, 20);
        System.out.println(block.getNameCondo() + "  " + block.getAddress() + "  " + block.getBlock() + "  "
                + block.getQuantity());
        block.getQuant();  //вот здесь у меня вопрос



        Flats flat1 = new Flats("Чистый Бишкек", "ул. Манаса, 10", Name_blocks.B, 25, 1, 2);
        System.out.println("Блок " + flat1.getBlock() + "  " + "Номер комнаты " + flat1.getNumber() + "  " +  "Количество комнат " + flat1.getQuantityRooms());

        flat1.getQuant(20,Name_blocks.A);

        Flats flat2 = new Flats("Чистый Бишкек", "ул. Манаса, 10", Name_blocks.C, 30, 2, 3);
        System.out.println("Блок " + flat2.getBlock() + "  " + "Номер комнаты " + flat2.getNumber() + "  " +  "Количество комнат " + flat2.getQuantityRooms() +
                "  " + "Название кондо " + flat2.getNameCondo());

        flat2.getQuant(25);





    }
}
