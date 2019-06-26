package examples.aaronhoskins.com.recyclerandlistviews;

import java.util.ArrayList;

public class DummyGameDatabaseHelper {
    public ArrayList<VideoGame> getAllGames() {
        ArrayList<VideoGame> returnList = new ArrayList<>();
        //VideoGame callOfDuty = new VideoGame("Call of Duty", "FPS", true, 4, "M", "Run around, kill people, teabag the dead","");
        returnList.add(new VideoGame("Call of Duty", "FPS", true, 4, "M", "Run around, kill people, teabag the dead",""));
        returnList.add(new VideoGame("Halo", "FPS", true, 3, "M", "Run around, kill people, teabag the dead",""));
        returnList.add(new VideoGame("Mario Brothers I", "Family", true, 2, "M", "Run around, kill people, teabag the dead",""));
        returnList.add(new VideoGame("The Last of Us", "Story", false, 5, "M", "Run around, kill people, teabag the dead",""));
        returnList.add(new VideoGame("Grand Theft Auto", "Driving", true, 4, "M", "Run around, kill people, teabag the dead",""));
        returnList.add(new VideoGame("Sonic", "Family", false, 1, "M", "Run around, kill people, teabag the dead",""));
        returnList.add(new VideoGame("Devil May Cry", "Story", false, 3, "M", "Run around, kill people, teabag the dead",""));
        returnList.add(new VideoGame("Kingdom Hearts", "Family", false, 5, "M", "Run around, kill people, teabag the dead",""));
        returnList.add(new VideoGame("Fallout", "Big Map", true, 2, "M", "Run around, kill people, teabag the dead",""));
        returnList.add(new VideoGame("Minesweeper", "Bored at Office", false, 1, "M", "Run around, kill people, teabag the dead",""));
        returnList.add(new VideoGame("Hoover", "Driving", false, 3, "M", "Run around, kill people, teabag the dead",""));

        return returnList;
    }
}
