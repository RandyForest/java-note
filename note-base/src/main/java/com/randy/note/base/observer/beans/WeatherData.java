package com.randy.note.base.observer.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        float oldTemperature = this.temperature;
        this.temperature = temperature;
        changeSupport.firePropertyChange("temperature", oldTemperature, this.temperature);

    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        float oldHumidity = this.humidity;
        this.humidity = humidity;
        changeSupport.firePropertyChange("humidity", oldHumidity, this.humidity);
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        float oldPressure = this.pressure;
        this.pressure = pressure;
        changeSupport.firePropertyChange("pressure", oldPressure, this.pressure);
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        changeSupport.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        changeSupport.removePropertyChangeListener(propertyChangeListener);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
    }
}
