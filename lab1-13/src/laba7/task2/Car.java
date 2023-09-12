package laba7.task2;

public class Car extends CarModel {

    public int year;

    public Car(String modelName, int year) {
        super(modelName);
        setProperties(year);
    }

    @Override
    public void setProperties() {
        super.setProperties();
        this.year = 0;
    }

    @Override
    public void setProperties(String modelName) {
        super.setProperties(modelName);
    }

    public void setProperties(int year) {
        this.year = year;
    }

    public void setProperties(String modelName, int year) {
        setProperties(modelName);
        setProperties(year);
    }
}
