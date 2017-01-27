package com.mckee.david.gta_radio;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by David on 23/12/2016.
 */
public class Radio {

    private static Context context;
    private ArrayList<Playlist> playlists;

    public Radio(Context context)
    {
        this.context = context.getApplicationContext();
        playlists = getPlaylists();
    }

    private ArrayList<Playlist> getPlaylists()
    {
        ArrayList<Playlist> playlists = new ArrayList<>();
        Uri currentPlaylistUri = MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI;

        String idKey = MediaStore.Audio.Playlists._ID;
        String nameKey = MediaStore.Audio.Playlists.NAME;
        String[] columns = { idKey, nameKey};
        ContentResolver resolver = context.getContentResolver();
        Cursor playlistCursor = resolver.query(currentPlaylistUri, columns,
                null, null, null);

        if(playlistCursor != null) {
            try {
                for (Boolean hasItem = playlistCursor.moveToFirst(); hasItem;
                     hasItem = playlistCursor.moveToNext()) {
                    String id = playlistCursor.getString(playlistCursor.getColumnIndex(idKey));
                    String name = playlistCursor.getString(playlistCursor.getColumnIndex(nameKey));
                    Playlist currentPlaylist = new Playlist(id, name);
                    playlists.add(currentPlaylist);
                }
            } catch (Exception ex) {
                ex.getMessage();
            } finally {
                playlistCursor.close();
            }
        }
        return playlists;
    }



}
