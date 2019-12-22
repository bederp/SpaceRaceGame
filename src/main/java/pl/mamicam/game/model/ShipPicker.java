package pl.mamicam.game.model;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class ShipPicker extends VBox {
    private ImageView squareImage;
    private ImageView shipImage;

    private String squareNotChoosen = "/ships/grey_button.png";
    private String squareChoosen = "/ships/choosen_button.png";

    private SHIP ship;

    private boolean isSquareChoosen;

    public ShipPicker(SHIP ship) {
        squareImage = new ImageView(squareNotChoosen);
        shipImage = new ImageView(ship.getUrlShip());
        this.ship = ship;
        isSquareChoosen = false;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.getChildren().add(squareImage);
        this.getChildren().add(shipImage);
    }

    public SHIP getShip() {
        return ship;
    }

    public boolean isSquareChoosen() {
        return isSquareChoosen;
    }

    public void setIsSquareChoosen(boolean isSquareChoosen) {
        this.isSquareChoosen = isSquareChoosen;
        String imageToSet = this.isSquareChoosen ? squareChoosen : squareNotChoosen;
        squareImage.setImage(new Image(imageToSet));
    }
}
