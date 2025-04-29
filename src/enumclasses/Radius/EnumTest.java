package enumclasses.Radius;


public class EnumTest {

    public static void main(String[] args) {
        enumInSwitch(RadiusPacketStatus.START);
    }

    private static void enumInSwitch(RadiusPacketStatus radiusPacketStatus) {

        switch (radiusPacketStatus) {
            case START:
                System.out.println("Start Accounting");
                break;
            case STOP:
                System.out.println("Stop Accounting");
                break;
            case UPDATE:
                System.out.println("Update Accounting");
                break;
            default:
                System.out.println("Only Use Enum value");
        }
    }
}
