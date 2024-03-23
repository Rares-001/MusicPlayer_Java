package org.example.Factory;

import org.example.Model.Song;

public abstract class SongCreator
{
    public abstract Song createSong(String title, String artist, String filePath);
}
