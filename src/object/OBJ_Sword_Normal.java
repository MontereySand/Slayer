package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Sword_Normal extends Entity {
    boolean exists = true;

    public OBJ_Sword_Normal(GamePanel gp) {
        super(gp);

        type = type_sword;
        name = "Wolfknight Greatsword";
        down1 = setup("/objects/sword_normal", gp.tileSize, gp.tileSize);
        attackValue = 2;
        attackArea.width = 150;
        attackArea.height = 150;
        description = "[" + name + "]\nOld greatsword.";
    }
}
