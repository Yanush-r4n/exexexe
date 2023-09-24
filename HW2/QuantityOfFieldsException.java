package HW2;

public class QuantityOfFieldsException extends Exception {
    public QuantityOfFieldsException(int required, int provided) {
        super("Quantity of fields is " + (provided > required ? "more" : "less") + " then expected. " +
                "Required: " + required + ", but provided: " + provided + ".");
    }
}
