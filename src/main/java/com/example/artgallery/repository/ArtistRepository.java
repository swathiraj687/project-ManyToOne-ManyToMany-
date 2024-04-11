/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.artgallery.repository;

import com.example.artgallery.model.Artist;
import com.example.artgallery.model.Art;
import com.example.artgallery.model.Gallery;

import java.util.ArrayList;
import java.util.List;

public interface ArtistRepository {
    ArrayList<Artist> getArtists();

    Artist getArtistById(int artistId);

    Artist addArtist(Artist artist);

    Artist updateArtist(int artistId, Artist artist);

    void deleteArtist(int artistId);

    List<Art> getArtistArts(int artistId);

    List<Gallery> getArtistGalleries(int artistId);
}