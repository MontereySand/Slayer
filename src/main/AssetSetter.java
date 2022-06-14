package main;

import entity.NPC_OldMan;
import monster.MON_abyss;
import object.OBJ_Axe;
import object.OBJ_speedBoost;
import object.OBJ_Estus;
import object.OBJ_Dragon;
import object.OBJ_fp;

public class AssetSetter {

    GamePanel gp;
    boolean exists = true;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        int i = 0;
        // gp.obj[i] = new OBJ_Key(gp);
        // gp.obj[i].worldX = gp.tileSize * 25;
        // gp.obj[i].worldY = gp.tileSize * 23;
        // i++;
        // gp.obj[i] = new OBJ_Key(gp);
        // gp.obj[i].worldX = gp.tileSize * 21;
        // gp.obj[i].worldY = gp.tileSize * 19;
        // i++;

        gp.obj[i] = new OBJ_speedBoost(gp);
        gp.obj[i].worldX = gp.tileSize * 26;
        gp.obj[i].worldY = gp.tileSize * 21;
        gp.obj[i].exists=true;
        i++;

        gp.obj[i] = new OBJ_Axe(gp);
        gp.obj[i].worldX = gp.tileSize * 33;
        gp.obj[i].worldY = gp.tileSize * 21;
        gp.obj[i].exists=true;
        i++;
        gp.obj[i] = new OBJ_Dragon(gp);
        gp.obj[i].worldX = gp.tileSize * 35;
        gp.obj[i].worldY = gp.tileSize * 21;
        gp.obj[i].exists=true;
        i++;
        gp.obj[i] = new OBJ_Estus(gp);
        gp.obj[i].worldX = gp.tileSize * 22;
        gp.obj[i].worldY = gp.tileSize * 27;
        gp.obj[i].exists=true;
        i++;
        gp.obj[i] = new OBJ_fp(gp);
        gp.obj[i].worldX = gp.tileSize * 29;
        gp.obj[i].worldY = gp.tileSize * 22;
        gp.obj[i].exists=true;
        if(gp.obj[i].exists==false){
            gp.obj[i] = new OBJ_fp(gp);
            gp.obj[i].worldX = gp.tileSize * 29;
            gp.obj[i].worldY = gp.tileSize * 22;
            gp.obj[i].exists=true; 
        }
        i++;
    }

public void setNPC() {
        gp.npc[0] = new NPC_OldMan(gp);
        gp.npc[0].worldX = gp.tileSize * 21;
        gp.npc[0].worldY = gp.tileSize * 21;

        gp.npc[1] = new NPC_OldMan(gp);
        gp.npc[1].worldX = gp.tileSize * 10;
        gp.npc[1].worldY = gp.tileSize * 10;
    }

    public void setMonster() {
        for(int i = 0; i < 30; i++) {
            gp.monster[i] = new MON_abyss(gp);
            gp.monster[i].worldX = (int) (gp.tileSize * (Math.random()*30 + 10));
            gp.monster[i].worldY = (int) (gp.tileSize * (Math.random()*30 + 10));
        }

        // for (int j = 1; j < 30; j++) {
        //     gp.monster[j] = new MON_GreenSlime(gp);
        //     gp.monster[j].worldX = (int) (gp.tileSize * (Math.random()*40 + 1));
        //     gp.monster[j].worldY = (int) (gp.tileSize * (Math.random()*40 + 1));
        //     for(int k = 0; k < gp.monster.length; k++) {
        //         if(gp.monster[k].worldX == gp.monster[j].worldX && gp.monster[k].worldY == gp.monster[j].worldY) {
        //             while (gp.monster[k].worldX == gp.monster[j].worldX && gp.monster[k].worldY == gp.monster[j].worldY) {
        //                 gp.monster[j].worldX = (int) (gp.tileSize * (Math.random()*40 + 1));
        //                 gp.monster[j].worldY = (int) (gp.tileSize * (Math.random()*40 + 1));
        //             }
        //         }
        //     }
        // }
        // gp.monster[i] = new MON_GreenSlime(gp);
        // gp.monster[i].worldX = gp.tileSize * 21;
        // gp.monster[i].worldY = gp.tileSize * 38;
        // i++;
        // gp.monster[i] = new MON_GreenSlime(gp);
        // gp.monster[i].worldX = gp.tileSize * 23;
        // gp.monster[i].worldY = gp.tileSize * 42;
        // i++;
        // gp.monster[i] = new MON_GreenSlime(gp);
        // gp.monster[i].worldX = gp.tileSize * 24;
        // gp.monster[i].worldY = gp.tileSize * 37;
        // i++;
        // gp.monster[i] = new MON_GreenSlime(gp);
        // gp.monster[i].worldX = gp.tileSize * 34;
        // gp.monster[i].worldY = gp.tileSize * 42;
        // i++;
        // gp.monster[i] = new MON_GreenSlime(gp);
        // gp.monster[i].worldX = gp.tileSize * 38;
        // gp.monster[i].worldY = gp.tileSize * 42;
        // i++;
    }
}
