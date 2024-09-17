package com.planingplane.adapter.triple;

import com.planingplane.dto.FlightInfo;

import java.util.List;

public interface TriplePort {
    List<FlightInfo> scrape(String url);
}
