package laba7.task3;

public class Class extends Liter {

    public String className;

    public Class(int numberOfSchool, char liter, String className) {
        super(numberOfSchool, liter);
        this.className = className;
    }

    public void setValues(int numberOfSchool, char liter, String className) {
        super.setValues(numberOfSchool, liter);
        this.className = className;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " номер школы: " + numberOfSchool + " параллель: " + liter + " класс: "
                + className;
    }
}
