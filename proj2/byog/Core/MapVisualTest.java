package byog.Core;
import byog.TileEngine.TERenderer;
import byog.TileEngine.TETile;
import byog.TileEngine.Tileset;
import java.util.ArrayList;



public class MapVisualTest {
    private static final int WIDTH = 65;
    private static final int HEIGHT = 36;

    public static void testGenerateRooms() {
        TERenderer ter = new TERenderer();
        ter.initialize(WIDTH, HEIGHT);
        TETile[][] world = new TETile[WIDTH][HEIGHT];
        initializeWorld(world);
        MapGenerator.generateRooms();
        ter.renderFrame(world);
    }

    /**public static void testBranchOffThisRoom() {
        TERenderer ter = new TERenderer();
        ter.initialize(WIDTH, HEIGHT);
        TETile[][] world = new TETile[WIDTH][HEIGHT];
        initializeWorld(world);
        ArrayList<MapGenerator.Room> rooms = new ArrayList<>();
        MapGenerator.Position position = new MapGenerator.Position(2, 2);
        MapGenerator.Room start = new MapGenerator.Room(position,6, 6, new MapGenerator.Position(3,2));
        rooms.add(start);
        MapGenerator.Position position1 = MapGenerator.generateRandomExit(start);
        MapGenerator.Room room1 = MapGenerator.branchOffThisRoom(start, position1);
        rooms.add(room1);
        MapGenerator.Position position2 = MapGenerator.generateRandomExit(start);
        MapGenerator.Room room2 = MapGenerator.branchOffThisRoom(start, position2);
        rooms.add(room2);
        MapGenerator.drawSingleRoom(rooms.get(0), world);
        for (int i = 1; i < rooms.size(); i++) {
            MapGenerator.drawRoomAndExit(rooms.get(i), world);
        }
        ter.renderFrame(world);
    } */

    public static void testGenerateRandomRoom() {
        TERenderer ter = new TERenderer();
        ter.initialize(WIDTH, HEIGHT);
        TETile[][] world = new TETile[WIDTH][HEIGHT];
        initializeWorld(world);

    }

    private static void initializeWorld(TETile[][] t) {
        for (int x = 0; x < WIDTH; x += 1) {
            for (int y = 0; y < HEIGHT; y += 1) {
                t[x][y] = Tileset.NOTHING;
            }
        }
    }

    public static void main(String[] args){
        testGenerateRooms();
    }

}
