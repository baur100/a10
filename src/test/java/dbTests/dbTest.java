package dbTests;

import helpers.DbAdapter;
import models.Artist;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class dbTest {
    @Test
    public void getPlaylistForUser(){
        List<Playlist> pls = DbAdapter.getUsersPlaylists(170);
        for (Playlist pl:pls){
            System.out.println(pl.getName()+" "+pl.getId());
        }
    }
    @Test
    public void getPlaylistById(){
        Playlist pl = DbAdapter.getPlaylistsById(156);
        System.out.println(pl.getName());
    }
    @Test
    public void getArtists(){
        List<Artist> art = null;
        try {
            art = DbAdapter.getArtists();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(art);
        Assert.assertEquals(art.size(),55);
    }
}

