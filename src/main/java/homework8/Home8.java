package homework8;

public class Home8 {
    public static void main(String[] args){

        Furniture table = new Furniture();
        table.name = "table";
        table.color = "white";
        table.size = "long";
        table.type = "round";
        table.price = 350;

//        System.out.println("Table is " +table.color+ ", " +table.size+ " " +table.type+ " and cost " +table.price);

//        table.delivery();

//        String info = table.getIngo();
//        System.out.println(info);


        Furniture chair = new Furniture();
        chair.name = "chair";
        chair.color = "brown";
        chair.size = "small";
        chair.type = "on wheel";
        chair.price = 250;

//        System.out.println(chair.color+ " " +chair.name+ " cost"+ " " +chair.price);

//        chair.delivery();

//        String info = chair.getIngo();
//        System.out.println(info);


        Device iPhone = new Device();
        iPhone.name = "iPhone";
        iPhone.color = "gray";
        iPhone.size = "mini";
        iPhone.memory = 64;

//        System.out.println(iPhone.name+ " " +iPhone.color+ " and memory is " +iPhone.memory);

//        iPhone.repair();

//        String info = iPhone.timeOfRepair();
//        System.out.println(info);

        Device laptop = new Device();
        laptop.name = "laptop";
        laptop.color = "gold";
        laptop.size = "max";
        laptop.memory = 256;

//        System.out.println(laptop.name+ " " +laptop.size+ ", " +laptop.color+ " color it memory is " + iPhone.memory);

//        laptop.repair();

//        String info = laptop.timeOfRepair();
//        System.out.println(info);

        Cosmetics lipstick = new Cosmetics();
        lipstick.name = "lipstick";
        lipstick.brand = "Bobbi Brown";
        lipstick.color = "red";
        lipstick.size = 1.6;
        lipstick.price = 18;

//        System.out.println(lipstick.name+ " " +lipstick.brand+ " " +lipstick.color+ " color - " +lipstick.size+ "ml cost " +lipstick.price);

//        lipstick.inventory();

//        String info1 = lipstick.orders();
//        System.out.println(info1);

        Cosmetics parfume = new Cosmetics();
        parfume.name = "parfume";
        parfume.brand = "Chanel";
        parfume.color = "clear";
        parfume.size = 50;
        parfume.price = 140;

        System.out.println(parfume.brand+ " " +parfume.name+ " cost " +parfume.price);

        parfume.inventory();

        String info2 = parfume.orders();
        System.out.println(info2);


    }
}
