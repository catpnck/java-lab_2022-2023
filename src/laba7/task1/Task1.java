package laba7.task1;

public class Task1 {
    public static void main(String[] args) {
        CarModel carModel = new CarModel("Lada Vesta");
        System.out.println(carModel);

        Car car1 = new Car("Lada Vesta");
        Car car2 = new Car("Lada Vesta", "red");

        System.out.println(car1);
        System.out.println(car2);

    }
}
