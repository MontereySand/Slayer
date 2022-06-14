package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Axe extends Entity {
    boolean exists = true;

    public OBJ_Axe(GamePanel gp) {
        super(gp);


        type = type_axe;
        name = "Weathered Battle Axe";
        down1 = setup("/objects/axe", gp.tileSize, gp.tileSize);
        attackValue = 3;
        attackArea.width = 60;
        attackArea.height = 60;
        description = "[" + name + "]\nAn old rusty axe \n still able to bring down foes.";
    }
}
