package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_fp extends Entity {

    GamePanel gp;
    int value = 5;
        boolean exists = true;

    public OBJ_fp(GamePanel gp) {
        super(gp);

        this.gp = gp;

        type = type_consumable;
        name = "Glintstone rock";
        down1 = setup("/objects/glint", gp.tileSize, gp.tileSize);
        description = "[" + name + "]\nRestores your mana by " + value + ".";
    }

    public void use(Entity entity) {
        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You crush the " + name + "!\n" +
            "You feel ancient power within you.";
            this.exists = false;
        entity.mana += value;
        if (gp.player.mana > gp.player.maxMana) {
            gp.player.mana = gp.player.maxMana;
        }
        gp.playSE(11);

    }
}
