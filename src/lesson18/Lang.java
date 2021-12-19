package lesson18;

public enum Lang {

    ARM("Armenia",12000),
    RU("Russia"),
    ENG("USA");

    private String cauntryName;
    private int caunt;

    Lang(String cauntryName) {
        this.cauntryName = cauntryName;
    }

    Lang(String cauntryName, int caunt) {
        this.cauntryName = cauntryName;
        this.caunt = caunt;
    }

    public String getCauntryName() {
        return cauntryName;
    }

    public int getCaunt() {
        return caunt;
    }
}
