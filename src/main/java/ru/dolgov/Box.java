package ru.dolgov;

import java.util.ArrayList;

public class Box <F extends Fruit>implements Fruit{
    private ArrayList<F> box= new ArrayList<>();//Создаем ArrayList
    private float weight;//переменная для хранения веса

    /**
     * Конструктор коробки
     */
    public Box() {

    }

    /**
     * Сравнение веса коробок
     * @param boxcom Принимаем коробку на вход
     * @return возвращаем результат
     */
    public boolean compare(Box boxcom){
        if (getWeight() == boxcom.getWeight()){
            return true;
        }
        return false;
    }

    /**
     * Считаем вес всей коробки
     * @return возвращаем полученный вес
     */
    @Override
    public float getWeight() {
        System.out.println("Вес "+box.get(1));
        for (F fruit: box){
            weight+= fruit.getWeight(); //Складываем вес всех фруктов
        }
        System.out.println(weight);
        return weight;
    }

    /**
     * Добавляем фрукты
     * @param fruit Получаем вид фрукта
     * @param count Получаем сколько фруктов
     */
    public void addFruit(F fruit, int count){
        for(int i=0; i<count; i++){
            box.add(fruit); //Добавляем фрукты
        }
    }
}
