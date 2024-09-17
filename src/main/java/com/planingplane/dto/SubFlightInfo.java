package com.planingplane.dto;

public class SubFlightInfo {
    private String departTime;
    private String departAirport;
    private String duration;
    private String arriveTime;
    private String arriveAirport;

    private String airline;
    private String airlineLogoImage;

    // 생성자
    public SubFlightInfo(String departTime, String departAirport, String duration, String arriveTime, String arriveAirport, String airline, String airlineLogoImage) {
        this.departTime = departTime;
        this.departAirport = departAirport;
        this.duration = duration;
        this.arriveTime = arriveTime;
        this.arriveAirport = arriveAirport;
        this.airline = airline;
        this.airlineLogoImage = airlineLogoImage;
    }

    @Override
    public String toString() {
        return String.format("airline: %s, airlineLogoImage: %s\ndepartTime: %s, departAirport: %s, duration: %s, arriveTime: %s, arriveAirport: %s",
                airline,airlineLogoImage,departTime, departAirport, duration, arriveTime, arriveAirport);
    }
}
