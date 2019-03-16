package models.domain;

public class Teacher {
    private Integer tId;

    private String tName;

    public Teacher(Integer tId, String tName) {
        this.tId = tId;
        this.tName = tName;
    }

    public Teacher() {
        super();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }
}