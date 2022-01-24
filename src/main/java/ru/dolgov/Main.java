package ru.dolgov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Random random = new Random();


    public static void main(String[] args) {
        System.out.print("Задание 1 \n***************\n");

        Object[] arr = {1, 3, 5, 7, 2, 6};//Создание массива
        String[] arrstring = {"A", "F", "E", "R"};//Создание массива
        //индексы генерируются рандомно
        System.out.println(swaparr(arr, random.nextInt(arr.length), random.nextInt(arr.length)));//Передача массива и индекса 1 и 2 для перестановки ихи местами
        System.out.println(swaparr(arrstring, random.nextInt(arrstring.length), random.nextInt(arrstring.length)));//Передача массива и индекса 1 и 2 для перестановки ихи местами

        System.out.print("*************** \nЗадание 2");

        String[] arrconvertstring = {"2", "4", "E", "Q", "3"};//Создание массива
        Integer[] arrсonvertint = {2, 3, 5, 32, 12, 34, 2, 4, 4};//Создание массива
        convert(arrconvertstring);//Вызываем метод и предаем массив
        convert(arrсonvertint);//Вызываем метод и предаем массив

        System.out.print("*************** \nЗадание 3\n");

        Box<Orange> orangeBox1 = new Box<>();//Создание коробки1 с апельсинами
        Box<Orange> orangeBox2 = new Box<>();//Создание коробки2 с апельсинами
        orangeBox1.addFruit(new Orange(), 25);//Добавление фруктов
        orangeBox2.addFruit(new Orange(), 75);//Добавление фруктов
        System.out.println("Вес коробок " + orangeBox1.compare(orangeBox2));//Сравнение веса и вывод в консоль
        Box<Apple> aplleBox1 = new Box<>();//Создание коробки1 с яблоками
        Box<Apple> aplleBox2 = new Box<>();//Создание коробки2 с яблоками
        aplleBox1.addFruit(new Apple(), 25);//Добавление фруктов
        aplleBox2.addFruit(new Apple(), 25);//Добавление фруктов
        System.out.println("Вес коробок " + aplleBox1.compare(aplleBox2));//Сравнение веса и вывод в консоль
    }

    /**
     * Преобразуем массив в ArrayList
     *
     * @param reconvert  //Принимаем массив
     * @param <TConvert> //Принимаем тип массива
     */
    private static <TConvert> void convert(TConvert[] reconvert) {

        ArrayList<TConvert> listconvert = new ArrayList<>(Arrays.asList(reconvert)); //Преобразуем массив ArrayList с типом как у массива
        System.out.println("\n" + listconvert);//Вывод ArrayList
    }

    /**
     * Меняет элементы массива ссылочного типа местами
     *
     * @param arr    Принимаем массив
     * @param index1 принимаем индекс1
     * @param index2 принимаем индекс2
     * @return Возвращаем массив типа String
     */
    private static String swaparr(Object[] arr, int index1, int index2) {
       /* Без 3 переменной не куда так как надо сохранить элемент
        index1+=index2;
        index2=index1-index2;
        index1=index1-index2;
        arr[index1]=arr[index2];
        arr[index2]=arr[index1];*/
        Object swap = arr[index1];//Перекладываем Элемент в переменную для хранения
        arr[index1] = arr[index2];//Перекладываем Элемент с одной ячейки в другую
        arr[index2] = swap;// Перекладываем сохраненную ячейку
        return Arrays.toString(arr);

    }
}
