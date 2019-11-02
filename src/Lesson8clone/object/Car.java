package Lesson8clone.object;

import java.util.Objects;

public class Car implements Cloneable {
    private String brand;
    private String color;
    private Owner owner;  //объект

    public Car(String brand, String color, Owner owner) {
        setBrand(brand);
        setColor(color);
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        //проверка входящих данных
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", owner=" + owner +
                '}';
    }

    // переопределять иклз и хэшкод


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) &&
                color.equals(car.color) &&
                owner.equals(car.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, owner);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //my realization
        return super.clone();//неполное клонирование
        //для полного клонирования необходима дополнительная реализация
        //почитать про клонирование
    }

    public void setColor(String color) {
        //проверка входящих данных
        this.color = color;



    }
}
