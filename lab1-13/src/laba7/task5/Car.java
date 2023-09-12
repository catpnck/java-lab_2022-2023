package laba7.task5;

public class Car extends CarModel {
    protected int year;

    public Car(String carModel, int year) {
        super(carModel);
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + ". Модель машины: " + carModel
                + ". Год выпуска: " + year);
    }
}
