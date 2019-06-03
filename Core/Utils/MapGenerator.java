package byog.Core.Utils;

import byog.TileEngine.TETile;

abstract class MapGenerator {
    String type;
    int H;
    int W;

    abstract TETile[][] generate();
}
