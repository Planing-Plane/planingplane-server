package com.planingplane.adapter.skyscanner;

import com.planingplane.dto.FlightInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface SkyscannerPort {
    List<FlightInfo> scrape(String url);
}
