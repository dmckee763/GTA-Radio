package com.mckee.david.gta_radio;

/**
 * Created by David on 23/12/2016.
 */
public class Track {
    private String artist;
    private String title;
    private String album;

    public Track(String artist, String title, String album)
    {
        this.artist = artist;
        this.title = title;
        this.album = album;
    }

    public String getArtist()
    {
        return this.artist;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getAlbum()
    {
        return this.album;
    }
}
