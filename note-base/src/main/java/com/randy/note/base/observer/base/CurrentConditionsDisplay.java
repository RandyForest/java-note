package com.randy.note.base.observer.base;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Object object) {
        WeatherData subject = (WeatherData) object;
        this.temperature = subject.getTemperature();
        this.humidity = subject.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.printf("温度：%.2f，湿度：%.2f\n", this.temperature, this.humidity);
    }
}
