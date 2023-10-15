package com.iyke;

public class App 
{
    public static void main( String[] args )
    {
        Tesla tesla = new Tesla("cjahsyt", "Tesla", "2020", 70000.00, 4, "white","automatic",210000, "hybrid", false, 4, false);
        Car toyota = new Toyota("cp683kja", "Toyota", "2020", 40000.00, 4, "black", "automatic", 0, "Electric", false, 4, 4);
        System.out.println(toyota);
        System.out.println(tesla);
    }
}
