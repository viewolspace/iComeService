package com.icome.dao;

import com.icome.pojo.Album;
import com.icome.pojo.query.AlbumQuery;

import java.util.List;

/**
 * Created by lenovo on 2019/1/2.
 */
public interface IAlbumDAO {

    int saveAlbum(Album list);

    int delAlbum(int id);

    int delDirAlbum(int dirId);

    Album getAlbum(int id);

    List<Album> queryAlbum(AlbumQuery query);


}
