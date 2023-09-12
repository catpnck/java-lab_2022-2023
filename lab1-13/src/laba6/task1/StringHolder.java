package laba6.task1;

public class StringHolder {
    private String text;
    private char chr;

    public void setValues(String text) {
        this.text = text;
    }

    public void setValues(char chr) {
        this.chr = chr;
    }

    public void setValues(char[] charArray) {
        if (charArray.length == 1) {
            this.chr = charArray[0];
        } else if (charArray.length > 1) {
            text = new String(charArray);
        }
    }

    public String getText() {
        return text;
    }

    public char getChr() {
        return chr;
    }
}
