package laba7.task1;

public class CarModel {

    private String modelName;

    public CarModel(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + modelName;
    }
}
