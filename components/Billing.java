package components;

import java.math.BigDecimal;

public class Billing {

    private String type;
    private BigDecimal value;
    private boolean isRecurring;

    public Billing() {
    }

    public Billing(String type, BigDecimal value, boolean isRecurring) {
        this.type = type;
        this.value = value;
        this.isRecurring = isRecurring;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public void setRecurring(boolean recurring) {
        isRecurring = recurring;
    }
}
