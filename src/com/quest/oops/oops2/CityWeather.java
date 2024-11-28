package com.quest.oops.oops2;

public class CityWeather {
    private String cityName;
    private double temperature;
    private double humidity;
    private String condition;

    public CityWeather(String cityName, double temperature, double humidity, String condition) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    public String getCityName() {
        return cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public String getCondition() {
        return condition;
    }
}
