package pl.mamicam.game.model;

public enum SHIP {
    RED("/ships/Ship_type1_red.png"),
    YELLOW("/ships/Ship_type4_yellow.png"),
    GREEN("/ships/Ship_type2_green.png"),
    BLUE("/ships/Ship_type3_blue.png");

    private String urlShip;

    private SHIP(String urlShip) {
        this.urlShip = urlShip;
    }

    public String getUrlShip() {
        return this.urlShip;
    }
}
