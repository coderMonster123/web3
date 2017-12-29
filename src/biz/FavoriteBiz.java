package biz;

import java.util.List;

import entity.Favorite;

public interface FavoriteBiz {

    void save(Favorite f);
    public List<Favorite> findFavoriteByTag(String tagname);
}
