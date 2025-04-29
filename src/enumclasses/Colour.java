package enumclasses;


public enum Colour {

    GREEN,
    YELLOW {
        @Override
        public void info() {
            System.out.println("stop, indicating it will turn green");
        }
    },
    RED {
        @Override
        public void info() {
            System.out.println("Stop");
        }
    };


    public void info() {
        System.out.println("Proceed");
    }
}
