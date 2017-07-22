package com.example.shubhangi.herodylocation;


public class Merchant {
    private Double lat;
    private Double lng;
    private String id;

    public void Merchant(Double lat,Double lng,String id)
    {
        this.lat=lat;
        this.lng=lng;
        this.id=id;
    }

    public Double getLat(){
        return lat;
    }

    public Double getLng() {
        return lng;
    }

    public String getId() {
        return id;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public void setId(String id) {
        this.id = id;
    }
}
