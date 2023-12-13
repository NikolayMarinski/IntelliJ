package bg.smg;

import java.sql.Driver;

public class Car extends Vehicle implements Comparable<Car>{

    private String marka;
    private String model;
    private int makeYear;

    public Car() {
    }

    public Car(String marka, String model, int makeYear) {
        this.marka = marka;
        this.model = model;
        this.makeYear = makeYear;
    }

    @Override
    public int compareTo(Car o) {
        if(this.getMakeYear() > o.getMakeYear()){
            return 1;
        }
        else if(this.getMakeYear() < o.getMakeYear()){
            return -1;
        }
        else{
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", makeYear=" + makeYear +
                '}';
    }

    @Override
    void Drive() {
        if(isActive == true){
            System.out.println("It drives");
    }

}

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }
}
