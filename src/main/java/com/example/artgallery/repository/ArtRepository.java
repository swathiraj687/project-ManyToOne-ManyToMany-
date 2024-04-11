/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.artgallery.repository;

import com.example.artgallery.model.Art;
import com.example.artgallery.model.Artist;

import java.util.ArrayList;

public interface ArtRepository {
    ArrayList<Art> getArts();

    Art addArt(Art art);

    Art getArtById(int artId);

    Art updateArt(int artId, Art art);

    void deleteArt(int artId);

    Artist getArtArtists(int artId);
}