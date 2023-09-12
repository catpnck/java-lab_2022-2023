package laba7.task3;

public class Task3 {
    public static void main(String[] args) {
        School school = new School(1);
        System.out.println(school);
        school.setValues(2);
        System.out.println(school);

        Liter liter = new Liter(3, 'A');
        System.out.println(liter);
        liter.setValues(4, 'Б');
        System.out.println(liter);

        Class schoolClass = new Class(5, 'В', "7В");
        System.out.println(schoolClass);
        schoolClass.setValues(6, 'Г', "11Г");
        System.out.println(schoolClass);
    }
}
