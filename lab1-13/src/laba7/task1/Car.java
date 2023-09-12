package laba7.task1;

public class Car extends CarModel {

    private String color;

    public Car(String modelName) {
        super(modelName);
    }

    public Car(String modelName, String color) {
        this(modelName);
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + getModelName() + ", " + color;
    }
}
