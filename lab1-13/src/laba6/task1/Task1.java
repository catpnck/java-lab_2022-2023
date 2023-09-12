package laba6.task1;

public class Task1 {
    public static void main(String[] args) {
        StringHolder holder = new StringHolder();
        holder.setValues("abc");
        System.out.println(holder.getText());
        holder.setValues('a');
        System.out.println(holder.getChr());
        holder.setValues(new char[]{'j'});
        System.out.println(holder.getChr());
        holder.setValues(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(holder.getText());

    }
}
