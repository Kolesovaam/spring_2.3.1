package web.model;

public class Car {
    private String car_mark;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String car_mark, String model, int year) {
        this.car_mark = car_mark;
        this.model = model;
        this.year = year;
    }

    public String getCar_mark() {
        return car_mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setCar_mark(String car_mark) {
        this.car_mark = car_mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
