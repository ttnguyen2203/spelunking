package byog.TileEngine;

import java.awt.Color;

/**
 * Contains constant tile objects, to avoid having to remake the same tiles in different parts of
 * the code.
 *
 * Ex:
 *      world[x][y] = Tileset.FLOOR;
 *
 * The style checker may crash when you try to style check this file due to use of unicode
 * characters. This is OK.
 */

public class Tileset {
    public static TETile PLAYER = new TETile('@', Color.white, Color.black, "player");
    public static final TETile WALL = new TETile('#', new Color(216, 128, 128), Color.darkGray,
            "wall");
    public static final TETile FLOOR = new TETile('·', new Color(128, 192, 128), Color.black,
            "floor");
    public static final TETile NOTHING = new TETile(' ', Color.black, Color.black, "nothing");
    public static final TETile GRASS = new TETile('v', new Color(37, 122, 22), new Color(136, 192, 102), "grass");
    public static final TETile GRASS1 = new TETile('"', new Color(187, 212, 175), new Color(120, 192, 113), "grass");

    public static final TETile WATER = new TETile('≈', new Color(53, 73, 248), new Color(74, 207, 255), "water");
    public static final TETile FLOWER = new TETile('❀', Color.magenta, Color.pink, "flower");
    public static final TETile LOCKED_DOOR = new TETile('█', Color.orange, Color.black,
            "locked door");
    public static final TETile UNLOCKED_DOOR = new TETile('▢', Color.orange, Color.black,
            "unlocked door"); // OLD SAND CHARACTER '▒'
    public static final TETile SAND = new TETile('▒', new Color(219, 198, 0, 255), new Color(219, 198, 0), "sand");
    public static final TETile MOUNTAIN = new TETile('▲', new Color(187, 212, 175), new Color(120, 192, 113), "mountain");
    public static final TETile SNOWM = new TETile('▲', new Color(255, 253, 254), new Color(187, 212, 175), "mountain");


    public static final TETile TREE = new TETile('♠', new Color(25, 110, 54), new Color(107, 156, 87), "tree");
}


