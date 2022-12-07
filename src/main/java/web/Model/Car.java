package web.Model;

public class Car {

    private String model;
    private int nomer;
    private int region;

    public Car () {
    }

    public Car (String model, int nomer, int region) {
        this.model = model;
        this.nomer = nomer;
        this.region = region;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

}
