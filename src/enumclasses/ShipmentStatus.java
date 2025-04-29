package enumclasses;


public enum ShipmentStatus {

    PRR("PRRCode"),
    PWR("PWRCode"),
    PFS("PFSCode"),
    RAC("RACCode");

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    ShipmentStatus(String code) {
        this.code = code;
    }
}
