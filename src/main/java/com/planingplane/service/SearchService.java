package com.planingplane.service;

import com.planingplane.adapter.skyscanner.SkyscannerPort;
import com.planingplane.adapter.triple.TriplePort;
import com.planingplane.dto.FlightInfo;
import com.planingplane.dto.SubFlightInfo;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SearchService {

    private final SkyscannerPort skyscannerPort;
    private final TriplePort triplePort;

    public SearchService(@Qualifier("prod") SkyscannerPort skyscannerPort,@Qualifier("prod") TriplePort triplePort) {
        this.skyscannerPort = skyscannerPort;
        this.triplePort = triplePort;
    }

    public void search() {
            String URL = "https://www.skyscanner.co.kr/transport/d/sela/2024-10-06/prg/prg/2024-10-24/sela/?adults=1&adultsv2=1&cabinclass=economy&children=0&childrenv2=&infants=0&ref=home";
//            String URL = "https://triple.guide/air/search/a:ICN-c:MUC-20241127/c:PRG-a:ICN-20241209?multiCity=true&adult=2&cabinTypes=ECONOMY&cabinTypes=PREMIUM_ECONOMY&sort=PRICE&from=hub";
            List<FlightInfo> flightElements = skyscannerPort.scrape(URL);
            System.out.println(flightElements.toString());
    }
}
