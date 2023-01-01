package laba7.task3;

public class Liter extends School {

    public char liter;

    public Liter(int numberOfSchool, char liter) {
        super(numberOfSchool);
        this.liter = liter;
    }

    public void setValues(int numberOfSchool, char liter) {
        super.setValues(numberOfSchool);
        this.liter = liter;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " номер школы: " + numberOfSchool + " параллель: " + liter;
    }
}
