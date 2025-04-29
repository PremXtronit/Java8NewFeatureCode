package enumclasses;


public enum CodeValue {

    PRR("PRRCode", "PRRValue"),
    PWR("PWRCode", "PWRValue"),
    PFS("PFSCode", "PFSValue"),
    RAC("RACCode", "RACValue");

    private String code;
    private String value;

    CodeValue(String code, String value) {
        this.code = code;
        this.setValue(value);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
