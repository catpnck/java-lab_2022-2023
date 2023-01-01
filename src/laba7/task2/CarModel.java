package laba7.task2;

public class CarModel {

    private String modelName;

    public CarModel(String modelName) {
        this.modelName = modelName;
    }

    public void setProperties() {
        this.modelName = "неизвестный автомобиль";
    }

    public void setProperties(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getModelNameLength() {
        return modelName.length();
    }
}
