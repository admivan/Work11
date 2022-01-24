package ru.dolgov;

public class Orange implements Fruit{
    /**
     * Возвращаем вес одного фрукта
     * @return
     */
    @Override
    public float getWeight() {
        return 1.5F;
    }

    @Override
    public String toString() {
        return "Апельсинов";
    }
}
