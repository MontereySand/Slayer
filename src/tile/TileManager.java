package tile;

import main.GamePanel;
import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {

    GamePanel gp;
    public Tile[] tile;
    public int[][] mapTileNum;

    public TileManager(GamePanel gp) {
        this.gp = gp;

        tile = new Tile[50];
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage();
        loadMap("/maps/worldV2.txt");
    }

    public void getTileImage() {
        // PLACEHOLDER
        setup(0, "grass00.png", false);
        setup(1, "grass00.png", false);
        setup(2, "grass00.png", false);
        setup(3, "grass00.png", false);
        setup(4, "grass00.png", false);
        setup(5, "grass00.png", false);
        setup(6, "grass00.png", false);
        setup(7, "grass00.png", false);
        setup(8, "grass00.png", false);
        setup(9, "grass00.png", false);
        // PLACEHOLDER


        setup(10, "grass00.png", false);
        setup(11, "grass01.png", false);
        setup(12, "water00.png", true);
        setup(13, "water01.png", true);
        setup(14, "water02.png", true);
        setup(15, "water03.png", true);
        setup(16, "water04.png", true);
        setup(17, "water05.png", true);
        setup(18, "water06.png", true);
        setup(19, "water07.png", true);
        setup(20, "water08.png", true);
        setup(21, "water09.png", true);
        setup(22, "water10.png", true);
        setup(23, "water11.png", true);
        setup(24, "water12.png", true);
        setup(25, "water13.png", true);
        setup(26, "road00.png", false);
        setup(27, "road01.png", false);
        setup(28, "road02.png", false);
        setup(29, "road03.png", false);
        setup(30, "road04.png", false);
        setup(31, "road05.png", false);
        setup(32, "road06.png", false);
        setup(33, "road07.png", false);
        setup(34, "road08.png", false);
        setup(35, "road09.png", false);
        setup(36, "road10.png", false);
        setup(37, "road11.png", false);
        setup(38, "road12.png", false);
        setup(39, "earth.png", false);
        setup(40, "wall.png", true);
        setup(41, "tree.png", true);
        setup(42, "hole.png", false);
        setup(43, "hole2.png", false);
        setup(44, "door.png", true);
        setup(45, "rock.png", false);
        setup(46, "bonfire.png", false);
    }

    public void setup(int index, String imagePath, boolean collision) {
        UtilityTool uTool = new UtilityTool();

        try {
            tile[index] = new Tile();
            tile[index].image = ImageIO.read(getClass().getResourceAsStream("/tiles/" + imagePath));
            tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize, gp.tileSize);
            tile[index].collision = collision;
        } catch (IOException e) {
        	e.printStackTrace();
        }
    }

    public void loadMap(String filePath) {
        try {
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;

            while (col < gp.maxWorldCol && row < gp.maxWorldRow) {
                String line = br.readLine();

                while (col < gp.maxWorldCol) {
                    String[] numbers = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;
                }

                if (col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }

            br.close();
        } catch (Exception e) {
            //
        }
    }

    public void draw(Graphics2D g2) {
        int worldCol = 0;
        int worldRow = 0;

        while (worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {
            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
                worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
                worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
                worldY - gp.tileSize < gp.player.worldY + gp.player.screenY)
            {
                g2.drawImage(tile[tileNum].image, screenX, screenY, null);
            }
            worldCol++;

            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;
            }
        }
    }
}
