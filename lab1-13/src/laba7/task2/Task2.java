package laba7.task2;

public class Task2 {
    public static void main(String[] args) {
        CarModel carModel = new CarModel("Lada Vesta");
        System.out.println(carModel.getModelName() + " " + carModel.getModelNameLength());
        carModel.setProperties();
        System.out.println(carModel.getModelName() + " " + carModel.getModelNameLength());
        carModel.setProperties("VW Polo");
        System.out.println(carModel.getModelName() + " " + carModel.getModelNameLength());

        Car car = new Car("Lada Vesta", 2020);
        System.out.println(car.getModelName() + " " + car.getModelNameLength() + " " + car.year);
        car.setProperties();
        System.out.println(car.getModelName() + " " + car.getModelNameLength() + " " + car.year);
        car.setProperties("VW Polo");
        System.out.println(car.getModelName() + " " + car.getModelNameLength() + " " + car.year);
        car.setProperties(2020);
        System.out.println(car.getModelName() + " " + car.getModelNameLength() + " " + car.year);
        car.setProperties("Kia Rio", 2022);
        System.out.println(car.getModelName() + " " + car.getModelNameLength() + " " + car.year);
    }
}
