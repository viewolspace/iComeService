package com.icome.dao;

import com.icome.pojo.AlbumDir;

import java.util.List;

/**
 * Created by lenovo on 2019/1/2.
 */
public interface IAlbumDirDAO {

    int saveAlbumDir(AlbumDir dir);

    int delAlbumDir(int id);

    int delAllAlbumDir(int userId);

    List<AlbumDir> list(int userId);

    AlbumDir getAlbumDir(int id);
}
