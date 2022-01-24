package ru.dolgov;

public class Apple implements Fruit{
    /**
     * Возвращаем вес одного фрукта
     * @return
     */
    @Override
    public float getWeight() {
        return 1.0F;
    }

    @Override
    public String toString() {
        return "Яблок";
    }
}
