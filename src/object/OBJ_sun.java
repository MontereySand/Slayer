package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_sun extends Entity {
    boolean exists = true;

    public OBJ_sun(GamePanel gp) {
        super(gp);

        type = type_shield;
        name = "Sunlight Shield";
        down1 = setup("/objects/shield_wood", gp.tileSize, gp.tileSize);
        defenseValue = 1;
        description = "[" + name + "]\n \"Grossly Incandecent...\"";
    }
}
