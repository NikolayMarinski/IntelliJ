package bg.smg;

public abstract class Vehicle {

    boolean isActive;

    abstract void Drive();

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
