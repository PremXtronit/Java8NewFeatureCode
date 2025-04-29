package enumclasses;


public enum Currency {

    ONE(1) {
        public String color() {
            return "Blue";
        }
    },
    TWO(2) {
        public String color() {
            return "Red-orange";
        }
    },
    FIVE(5) {
        public String color() {
            return "Green";
        }
    },
    TEN(10) {
        public String color() {
            return "Orange-violet";
        }
    };
    private int value;

    public abstract String color();

    private Currency(int value) {
        this.setValue(value);
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
