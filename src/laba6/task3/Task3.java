package laba6.task3;

public class Task3 {
    public static void main(String[] args) {
        double avg = IntProcessor.average(1, -567, 5689);
        System.out.println(avg);
        double avg1 = IntProcessor.average(new int[]{1, 567, -7637846});
        System.out.println(avg1);
        int max = IntProcessor.max(1,4,6,99876);
        System.out.println(max);
        int max1 = IntProcessor.max(new int []{7687,9,-11});
        System.out.println(max1);
        int min = IntProcessor.min(8786, -76,-655, 77);
        System.out.println(min);
        int min1 = IntProcessor.min(new int []{686, -87,9876});
        System.out.println(min1);
    }
}
