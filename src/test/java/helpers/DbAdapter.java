package helpers;

import models.Artist;
import models.Playlist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pageObjects.MainPage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    private static Logger logger = LogManager.getLogger(DbAdapter.class);
    private final static String USERNAME = "dbuser06";
    private final static String PASSWORD = "pa$$06";
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://104.237.13.60/dbkoel";
    private static Connection connection = null;
    private static Statement statement = null;

    public static List<Playlist> getUsersPlaylists(int userId){
        List<Playlist> playlists = new ArrayList<>();
        String query = "select * FROM playlists p where user_id = "+userId;
        try {
            connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            statement = connection.createStatement();

            ResultSet res = statement.executeQuery(query);
            while (res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                Playlist pl = new Playlist(id,name);
                playlists.add(pl);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return playlists;
    }

    public static Playlist getPlaylistsById(int playlistId){
        Playlist playlist = null;
        String query = "select * FROM playlists p where id = "+playlistId;
        try {
            connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            statement = connection.createStatement();

            ResultSet res = statement.executeQuery(query);
            while (res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                playlist = new Playlist(id,name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return playlist;
    }

    public static List<Artist> getArtists() throws ClassNotFoundException {
        String query = "SELECT * from artists";
        List<Artist> artists = new ArrayList<>();

        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int id = resultSet.getInt("id");
                Artist artist = new Artist(id, name);
                artists.add(artist);
            }

        } catch (ClassNotFoundException err){
            logger.fatal(err.getMessage());
            throw new ClassNotFoundException(err.getMessage());
        } catch (SQLException err){
            logger.fatal(err.getMessage());
        } finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException err){
                    logger.fatal(err.getMessage());
                }
            }
        }
        return artists;
    }
}
