package dao;

import java.util.List;

import entity.Favorite;

public interface FavoriteDao {

	void save(Favorite  f);
	List<Favorite>  findFavoriteByTag(String tagname);
}
