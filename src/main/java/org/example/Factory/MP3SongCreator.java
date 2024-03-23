package org.example.Factory;

import Model.Song;

public class MP3SongCreator extends SongCreator
{

    @Override
    public Song createSong(String filePath, String title, String artist)
    {
        MP3Song song = new MP3Song(title, artist);
        song.setFilePath(filePath);
        return song;
    }
}
