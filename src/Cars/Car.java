package Cars;

import java.util.Objects;

public abstract class  Car {
    //Не забываем делать ветки!!!!!
    //Делаем только комиты, пушим вечером!!!

     protected String car;

    protected Car(String car) {
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public abstract void carType(String type);



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car1 = (Car) o;
        return Objects.equals(car, car1.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car);
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                '}';
    }
}
