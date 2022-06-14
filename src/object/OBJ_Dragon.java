package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Dragon extends Entity {
    boolean exists = true;

    public OBJ_Dragon(GamePanel gp) {
        super(gp);

        type = type_shield;
        name = "Dragon Shield";
        down1 = setup("/objects/shield_blue", gp.tileSize, gp.tileSize);
        
        
        defenseValue = 4;

        description = "[" + name + "]\nPower of an archdragon \n lays in your hands.";
    }
}
