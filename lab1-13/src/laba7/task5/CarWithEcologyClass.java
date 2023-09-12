package laba7.task5;

public class CarWithEcologyClass extends CarModel {
    protected char ecologyClass;

    public CarWithEcologyClass(String modelName, char ecologyClass) {
        super(modelName);
        this.ecologyClass = ecologyClass;
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + ". Модель машины: " + carModel
                + ". Класс экологичности: " + ecologyClass);
    }
}
