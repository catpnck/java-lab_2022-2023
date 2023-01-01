package laba7.task5;

public class CarModel {
    protected String carModel;

    public CarModel(String carModel) {
        this.carModel = carModel;
    }

    public void print() {
        System.out.println(getClass().getSimpleName() + ". Модель машины: " + carModel);
    }
}
