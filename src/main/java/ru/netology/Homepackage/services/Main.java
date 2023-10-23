package ru.netology.Homepackage.services;

public class Main {
    public static void main(String[] args) {

        CountRestService service = new CountRestService();
        int count = service.calculate(200000, 50000, 0);
        System.out.println((int) count);
    }
}