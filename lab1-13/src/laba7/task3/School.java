package laba7.task3;

public class School {
    public int numberOfSchool;

    public School(int numberOfSchool) {
        this.numberOfSchool = numberOfSchool;
    }

    public void setValues(int numberOfSchool) {
        this.numberOfSchool = numberOfSchool;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "  номер школы: " + numberOfSchool;
    }
}
