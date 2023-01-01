package laba7.task5;

public class Task5 {
    public static void main(String[] args) {
        CarModel carModel = new CarModel("Lada Vesta");
        carModel.print();

        CarWithEcologyClass carWithEcologyClass = new CarWithEcologyClass("Tesla Model S", 'A');
        carWithEcologyClass.print();

        Car car = new Car("VW Polo", 2020);
        car.print();

        CarModel carModelEcology = (CarModel) carWithEcologyClass;
        carModelEcology.print();

        CarModel car1 = (CarModel) car;
        car1.print();
    }
}
