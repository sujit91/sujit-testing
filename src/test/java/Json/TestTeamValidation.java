package Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

import java.io.FileReader;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

public class TestTeamValidation {
    JSONArray players;

    public void setUp() throws Exception {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("team.json");
        JSONObject team = (JSONObject) jsonParser.parse(reader);
        players = (JSONArray) team.get("players");
    }

    @Test
    public void testForeignPlayers() {
        int foreignPlayerCount = 0;
        for (Object player : players) {
            JSONObject playerJson = (JSONObject) player;
            if (!playerJson.get("country").equals("India")) {
                foreignPlayerCount++;
            }
        }
        assertEquals(4, foreignPlayerCount);
    }
}
