package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_speedBoost extends Entity {
    boolean exists = true;
    GamePanel gp;
    public OBJ_speedBoost(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = type_consumable;
        name = "Lean";
        down1 = setup("/objects/speedBoost", gp.tileSize, gp.tileSize);
        description = "[" + name + "]\nI LOVE LEAN.";
    }
    public void use(Entity entity) {
        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You have drank lean. \nYou have been granted +3 speed.";
        gp.player.speed+=3;
        gp.playSE(2);
    }
}
