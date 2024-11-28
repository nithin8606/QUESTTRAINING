package com.quest.oops.oops2;

public interface WeatherOperation {
    void addCityWeather(CityWeather[] cities, int index, String cityName, double temperature, double humidity, String condition);
    void displayAllCities(CityWeather[] cities, int count);
    CityWeather getCityHighTemperature(CityWeather[] cities, int count);
    CityWeather getCityLowTemperature(CityWeather[] cities, int count);
    void displayCityHighHumidity(CityWeather[] cities, int count, double threshold);
    void generateWeatherReport(CityWeather[] cities, int count);
}
//runtimeexception not use catch block