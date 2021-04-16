package Helpers;

import models.Artist;
import models.Playlist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBadapter {
    private static Logger logger = LogManager.getLogger(DBadapter.class);
    private static final String USERNAME = "dbuser06";
    private static final String PASSWORD = "pa$$06";
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://104.237.13.60/dbkoel";
    private static Connection connection = null;
    private static Statement statement = null;
    public static List<Playlist> getUsersPlaylists(int userId) {
        List<Playlist> playlistList = new ArrayList<>();
        String querry = "SELECT * FROM dbkoel.playlists p WHERE user_id = "+userId;
        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();

            ResultSet res = statement.executeQuery(querry);
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("name");
                Playlist pl = new Playlist(id, name);
                playlistList.add(pl);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return playlistList;
    }

    public static Playlist getPlaylistById(int playlistId) {
        Playlist playlist = null;
        String querry = "SELECT * FROM dbkoel.playlists p WHERE id = "+playlistId;
        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();

            ResultSet res = statement.executeQuery(querry);
            while (res.next()) {
                int id = res.getInt("id");
                String name = res.getString("name");
                playlist = new Playlist(id, name);
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
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int id = resultSet.getInt("id");
                Artist artist = new Artist(id, name);
                artists.add(artist);
            }
        } catch (ClassNotFoundException err) {
            logger.fatal(err.getMessage());
            throw new ClassNotFoundException(err.getMessage());
        } catch (SQLException err) {
            logger.fatal(err.getMessage());
        } finally {
            if (connection!= null) {
                try {
                    connection.close();
                } catch (SQLException err) {
                    logger.fatal(err);
                }
            }
        }

        return artists;
    }
}
