package com.ajet.module10.day113.designpatterns.behavioural.session.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    WeatherData weatherData;
    private float temperature;
    private int humidity;
    private float pressure;

    @Override
    public void update(float temperature, int humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    public void remove() {
        weatherData.unregister(this);
    }

    public void register() {
        weatherData.register(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + temperature + " Humidity: " + humidity + " Pressure: " + pressure);
    }

}
