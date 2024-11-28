package com.quest.oops.oops2;

public class WeatherReportGenerator implements WeatherOperation {

    @Override
    public void addCityWeather(CityWeather[] cities, int index, String cityName, double temperature, double humidity, String condition) {
        cities[index] = new CityWeather(cityName, temperature, humidity, condition);
    }

    @Override
    public void displayAllCities(CityWeather[] cities, int count) {
        System.out.println("\nDisplaying All Cities:");
        for (int i = 0; i < count; i++) {
            CityWeather city = cities[i];
            System.out.println((i + 1) + ". City: " + city.getCityName() +
                    ", Temperature: " + city.getTemperature() + "°C" +
                    ", Humidity: " + city.getHumidity() + "%" +
                    ", Condition: " + city.getCondition());
        }
    }

    @Override
    public CityWeather getCityHighTemperature(CityWeather[] cities, int count) {
        CityWeather highestTempCity = cities[0];
        for (int i = 1; i < count; i++) {
            if (cities[i].getTemperature() > highestTempCity.getTemperature()) {
                highestTempCity = cities[i];
            }
        }
        return highestTempCity;
    }

    @Override
    public CityWeather getCityLowTemperature(CityWeather[] cities, int count) {
        CityWeather lowestTempCity = cities[0];
        for (int i = 1; i < count; i++) {
            if (cities[i].getTemperature() < lowestTempCity.getTemperature()) {
                lowestTempCity = cities[i];
            }
        }
        return lowestTempCity;
    }

    @Override
    public void displayCityHighHumidity(CityWeather[] cities, int count, double threshold) {
        System.out.println("\nCities with Humidity > " + threshold + "%:");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (cities[i].getHumidity() > threshold) {
                System.out.println(cities[i].getCityName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cities found.");
        }
    }

    @Override
    public void generateWeatherReport(CityWeather[] cities, int count) {
        System.out.println("\nGenerating Reports:");

        // Grouping cities by condition
        System.out.println("\nCities grouped by condition:");
        String sunnyCities = "Sunny: ";
        String rainyCities = "Rainy: ";

        for (int i = 0; i < count; i++) {
            if (cities[i].getCondition().equals("Sunny")) { // Case-sensitive comparison
                sunnyCities += cities[i].getCityName() + ", ";
            } else if (cities[i].getCondition().equals("Rainy")) { // Case-sensitive comparison
                rainyCities += cities[i].getCityName() + ", ";
            }
        }

        if (sunnyCities.endsWith(", ")) sunnyCities = sunnyCities.substring(0, sunnyCities.length() - 2);
        if (rainyCities.endsWith(", ")) rainyCities = rainyCities.substring(0, rainyCities.length() - 2);

        System.out.println(sunnyCities);
        System.out.println(rainyCities);

        // Calculate average temperature
        double totalTemp = 0;
        for (int i = 0; i < count; i++) {
            totalTemp += cities[i].getTemperature();
        }
        double averageTemp = totalTemp / count;
        System.out.println("\nAverage Temperature: " + String.format("%.2f", averageTemp) + "°C");

        // Generate alerts
        System.out.println("\nAlerts:");
        for (int i = 0; i < count; i++) {
            if (cities[i].getTemperature() > 40) {
                System.out.println("Heatwave Alert: " + cities[i].getCityName() +
                        " is experiencing extreme heat (" + cities[i].getTemperature() + "°C)!");
            }
        }
    }
}
