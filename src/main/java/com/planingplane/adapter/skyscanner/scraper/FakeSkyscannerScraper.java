package com.planingplane.adapter.skyscanner.scraper;

import com.planingplane.adapter.skyscanner.SkyscannerPort;
import com.planingplane.dto.FlightInfo;
import com.planingplane.dto.SubFlightInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Qualifier("fake")
public class FakeSkyscannerScraper implements SkyscannerPort {

    @Override
    public List<FlightInfo> scrape(String url) {
        // Define SubFlightInfo objects
        SubFlightInfo subFlight1 = new SubFlightInfo("오전 11:20", "ICN", "17시간 20분", "오후 9:40", "PRG", "LO", "//www.skyscanner.net/images/airlines/small/LO.png");
        SubFlightInfo subFlight2 = new SubFlightInfo("오전 9:55", "PRG", "13시간 25분", "오전 6:20", "ICN", "LO", "//www.skyscanner.net/images/airlines/small/LO.png");

        SubFlightInfo subFlight3 = new SubFlightInfo("오후 11:05", "ICN", "16시간 15분", "오전 8:20", "PRG", "KL", "//www.skyscanner.net/images/airlines/small/KL.png");
        SubFlightInfo subFlight4 = new SubFlightInfo("오후 7:20", "PRG", "14시간 05분", "오후 4:25", "ICN", "KL", "//www.skyscanner.net/images/airlines/small/KL.png");

        SubFlightInfo subFlight5 = new SubFlightInfo("오후 9:40", "ICN", "16시간 50분", "오전 7:30", "PRG", "AY", "//www.skyscanner.net/images/airlines/small/AY.png");
        SubFlightInfo subFlight6 = new SubFlightInfo("오전 11:35", "PRG", "16시간 45분", "오전 11:20", "ICN", "AY", "//www.skyscanner.net/images/airlines/small/AY.png");

        SubFlightInfo subFlight7 = new SubFlightInfo("오후 11:05", "ICN", "16시간 15분", "오전 8:20", "PRG", "KL", "//www.skyscanner.net/images/airlines/small/KL.png");
        SubFlightInfo subFlight8 = new SubFlightInfo("오후 6:30", "PRG", "14시간 55분", "오후 4:25", "ICN", "KL", "//www.skyscanner.net/images/airlines/small/KL.png");

        SubFlightInfo subFlight9 = new SubFlightInfo("오후 9:40", "ICN", "16시간 50분", "오전 7:30", "PRG", "AY", "//www.skyscanner.net/images/airlines/small/AY.png");
        SubFlightInfo subFlight10 = new SubFlightInfo("오전 8:10", "PRG", "20시간 10분", "오전 11:20", "ICN", "AY", "//www.skyscanner.net/images/airlines/small/AY.png");

        SubFlightInfo subFlight11 = new SubFlightInfo("오전 11:20", "ICN", "17시간 20분", "오후 9:40", "PRG", "LO", "//www.skyscanner.net/images/airlines/small/LO.png");
        SubFlightInfo subFlight12 = new SubFlightInfo("오후 7:20", "PRG", "14시간 05분", "오후 4:25", "ICN", "KL", "//www.skyscanner.net/images/airlines/small/KL.png");

        SubFlightInfo subFlight13 = new SubFlightInfo("오후 9:40", "ICN", "16시간 50분", "오 오전 7:30", "PRG", "AY", "//www.skyscanner.net/images/airlines/small/AY.png");
        SubFlightInfo subFlight14 = new SubFlightInfo("오전 9:55", "PRG", "13시간 25분", "오전 6:20", "ICN", "LO", "//www.skyscanner.net/images/airlines/small/LO.png");

        // Define FlightInfo objects
        FlightInfo flight1 = new FlightInfo("LOT", "₩1,059,600", "/transport/d/sela/2024-10-06/prg/prg/2024-10-24/sela/config/12409-2410061120--32093-1-15538-2410062140|15538-2410240955--32093-1-12409-2410250620?adults=1&adultsv2=1&cabinclass=economy&children=0&childrenv2=&infants=0&ref=home", Arrays.asList(subFlight1, subFlight2));
        FlightInfo flight2 = new FlightInfo("LOT", "₩1,007,800", "/transport/d/sela/2024-10-06/prg/prg/2024-10-24/sela/config/12409-2410061120--32093-1-15538-2410062140|15538-2410240710--32093-1-12409-2410250620?adults=1&adultsv2=1&cabinclass=economy&children=0&childrenv2=&infants=0&ref=home", Arrays.asList(subFlight3, subFlight4));
        FlightInfo flight3 = new FlightInfo("KLM (네덜란드항공)", "₩1,480,900", "/transport/d/sela/2024-10-06/prg/prg/2024-10-24/sela/config/12409-2410062305--32132-1-15538-2410070820|15538-2410241920--32132-1-12409-2410251625?adults=1&adultsv2=1&cabinclass=economy&children=0&childrenv2=&infants=0&ref=home", Arrays.asList(subFlight5, subFlight6));
        FlightInfo flight4 = new FlightInfo("핀에어", "₩1,456,900", "/transport/d/sela/2024-10-06/prg/prg/2024-10-24/sela/config/12409-2410062140--32317-1-15538-2410070730|15538-2410241135--32317-1-12409-2410251120?adults=1&adultsv2=1&cabinclass=economy&children=0&childrenv2=&infants=0&ref=home", Arrays.asList(subFlight7, subFlight8));
        FlightInfo flight5 = new FlightInfo("KLM (네덜란드항공)", "₩1,513,400", "/transport/d/sela/2024-10-06/prg/prg/2024-10-24/sela/config/12409-2410062305--32132-1-15538-2410070820|15538-2410241830--32132-1-12409-2410251625?adults=1&adultsv2=1&cabinclass=economy&children=0&childrenv2=&infants=0&ref=home", Arrays.asList(subFlight9, subFlight10));
        FlightInfo flight6 = new FlightInfo("핀에어", "₩1,510,300", "/transport/d/sela/2024-10-06/prg/prg/2024-10-24/sela/config/12409-2410062140--32317-1-15538-2410070730|15538-2410240810--32317-1-12409-2410251120?adults=1&adultsv2=1&cabinclass=economy&children=0&childrenv2=&infants=0&ref=home", Arrays.asList(subFlight11, subFlight12));
        FlightInfo flight7 = new FlightInfo("LOT + KLM (네덜란드항공)", "₩1,630,880", "/transport/d/sela/2024-10-06/prg/prg/2024-10-24/sela/config/12409-2410061120--32093-1-15538-2410062140|15538-2410241920--32132-1-12409-2410251625?adults=1&adultsv2=1&cabinclass=economy&children=0&childrenv2=&infants=0&ref=home", Arrays.asList(subFlight13, subFlight14));
        FlightInfo flight8 = new FlightInfo("핀에어 + LOT", "₩1,665,363", "/transport/d/sela/2024-10-06/prg/prg/2024-10-24/sela/config/12409-2410062140--32317-1-15538-2410070730|15538-2410240955--32093-1-12409-2410250620?adults=1&adultsv2=1&cabinclass=economy&children=0&childrenv2=&infants=0&ref=home", Arrays.asList(subFlight11, subFlight12));

        // Return the list of FlightInfo objects
        return Arrays.asList(flight1, flight2, flight3, flight4, flight5, flight6, flight7, flight8);
    }
}
