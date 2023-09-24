package HW2;

public class InfoFormatException extends Exception {
    public InfoFormatException(String info) {
        super("Not supported info format in field: \"" + info + "\"");
    }
}

