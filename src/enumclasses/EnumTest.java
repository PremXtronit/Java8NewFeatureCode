package enumclasses;


public class EnumTest {

    public static void main(String[] args) {

        System.out.println(ShipmentStatus.PFS);
        System.out.println(ShipmentStatus.PFS.getCode());

        System.out.println(CodeValue.PFS);
        System.out.println(CodeValue.PFS.getCode());
        System.out.println(CodeValue.PFS.getValue());

        enumSwitch(ShipmentStatus.RAC);

        TaskStatus[] taskStatuses = TaskStatus.values();
        for (TaskStatus taskStatus : taskStatuses) {
            System.out.println(taskStatus + "   " + taskStatus.ordinal());
        }

        TaskStatus taskStatus = TaskStatus.NEW;
        System.out.println(taskStatus);
    }

    public static void enumSwitch(ShipmentStatus shipmentStatus) {

        switch (shipmentStatus) {
            case PRR:
                System.out.println(ShipmentStatus.PRR.getCode());
                break;
            case PWR:
                System.out.println(ShipmentStatus.PWR.getCode());
                break;
            case PFS:
                System.out.println(ShipmentStatus.PFS.getCode());
                break;
            case RAC:
                System.out.println(ShipmentStatus.RAC.getCode());
                break;
            default:
        }
    }
}
