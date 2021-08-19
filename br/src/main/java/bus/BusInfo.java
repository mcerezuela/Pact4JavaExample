package bus;

public class BusInfo {
    String station;
    String nr;
    String eta;


    public BusInfo(String station, String nr, String eta) {
        this.station=station;
        this.nr = nr;
        this.eta = eta;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }
}
