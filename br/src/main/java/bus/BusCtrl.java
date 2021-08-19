package bus;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BusCtrl {

    @RequestMapping("/bus/{station}/{nr}")
    public BusInfo bus(@PathVariable String station, @PathVariable String nr) {
        String eta = getEtaBasedOnGpsAndOtherAdcancedStuff();
        BusInfo b = new BusInfo(station, nr, eta);
        return b;
    }

    private String getEtaBasedOnGpsAndOtherAdcancedStuff() {
        Random rn = new Random();
        int min = 0;
        int max = 5;
        int eta = rn.nextInt(max - min + 1) + min;
        if(eta>0) return ""+eta;
        return "now";
    }


}

// http://localhost:8111/bus/Central-park/201