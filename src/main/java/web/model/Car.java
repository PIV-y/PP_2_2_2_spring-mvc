package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name;
    private String cabinType;
    private int serialNumber;

    public Car() {
    }

    public Car(String name, String cabinType, int serialNumber) {
        this.name = name;
        this.cabinType = cabinType;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCabinType() {
        return cabinType;
    }

    public void setCabinType(String cabinType) {
        this.cabinType = cabinType;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cabinType='" + cabinType + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
