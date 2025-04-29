package enumclasses.Radius;


public enum RadiusPacketStatus {

    START("start"),
    STOP("stop"),
    UPDATE("update");

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    RadiusPacketStatus(String code) {
        this.code = code;
    }
}
