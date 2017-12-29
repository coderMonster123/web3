package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.FavoriteDao;
import entity.Favorite;

public class FavoriteDaoImpl  extends HibernateDaoSupport implements FavoriteDao{

	@Override
	public void save(Favorite f) {
	this.getHibernateTemplate().save(f);
		
	}

	@Override
	public List<Favorite> findFavoriteByTag(String tagname) {
		
		return this.getHibernateTemplate().find("from Favorite where tags like ?", "%"+tagname+"%");
	}


	

}
