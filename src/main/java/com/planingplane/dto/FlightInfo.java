package com.planingplane.dto;

import java.util.List;
import java.util.StringJoiner;

public class FlightInfo {
    private String airline;  // 항공사 정보
    private String totalPrice;  // 총 가격
    private String flightUrl;  // 항공편 URL
    private List<SubFlightInfo> subFlightInfo;  // 출발/도착 정보 및 기타 세부 정보

    // 생성자
    public FlightInfo(String airline, String totalPrice, String flightUrl, List<SubFlightInfo> subFlightInfo) {
        this.airline = airline;
        this.totalPrice = totalPrice;
        this.flightUrl = flightUrl;
        this.subFlightInfo = subFlightInfo;
    }

    // Getter와 Setter들 추가
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getFlightUrl() {
        return flightUrl;
    }

    public void setFlightUrl(String flightUrl) {
        this.flightUrl = flightUrl;
    }

    public List<SubFlightInfo> getSubFlightInfo() {
        return subFlightInfo;
    }

    public void setSubFlightInfo(List<SubFlightInfo> subFlightInfo) {
        this.subFlightInfo = subFlightInfo;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n", "FlightInfo:\n", "\n");

        joiner.add(String.format("airline: %s", airline));
        joiner.add(String.format("totalPrice: %s", totalPrice));
        joiner.add(String.format("flightUrl: %s", flightUrl));

        if (subFlightInfo != null && !subFlightInfo.isEmpty()) {
            joiner.add("subFlightInfo:");
            for (SubFlightInfo info : subFlightInfo) {
                joiner.add(info.toString());
            }
        } else {
            joiner.add("세부 정보가 없습니다.");
        }

        return joiner.toString();
    }
}
