package fm.douban.app.service;

import fm.douban.app.pojo.Singer;

import java.util.List;

public interface SingerService {

    /**
     * 增加一个歌手
     */
    Singer addSinger(Singer singer);

    /**
     * 根据歌手id查询歌手
     */
    Singer get(String singerId);

    /**
     * 查询全部歌手
     */
    List<Singer> getAll();

    /**
     * 修改歌手,只能修改名称、头像、主页、相似的歌手id
     */
    boolean modify(Singer singer);

    /**
     * 根据id主键删除歌手
     */
    boolean delete(String singerId);
}
