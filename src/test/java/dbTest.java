import Helpers.DBadapter;
import models.Playlist;
import org.testng.annotations.Test;

import java.util.List;

public class dbTest {
    @Test
    public void getPlaylistForUser(){
        List<Playlist> pls = DBadapter.getUsersPlaylists(170);
        for (Playlist pl:pls) {
            System.out.println(pl.getName()+" "+pl.getId());
        }
    }

    @Test
    public void getPlaylistById(){
        Playlist pl = DBadapter.getPlaylistById(156);
        System.out.println(pl.getName());
    }
}
