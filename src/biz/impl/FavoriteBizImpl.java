package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.FavoriteDao;
import dao.TagDao;
import entity.Favorite;
import entity.Tag;

import biz.FavoriteBiz;

@Service("favoriteBiz")
@Transactional
public class FavoriteBizImpl implements FavoriteBiz {

	@Autowired
	private FavoriteDao   favoriteDao;
	@Autowired
	private TagDao  tagDao;

	@Override
	public void save(Favorite f) {
	     
		favoriteDao.save(f);
		String str[]= f.getTags().split(",");
		for (String name : str) {
		 Tag  t=tagDao.findTagByName(name);
		 if(t==null)
		 {
			 //ÐÂÔö
			 t= new Tag();
			 t.setCount(1);
			 t.setName(name);
		 }
		 else
		 {
			 //ÐÞ¸Ä
			 t.setCount(t.getCount()+1);
		 }
		 tagDao.saveOrUpdate(t);
		}
	}

	@Override
	public List<Favorite> findFavoriteByTag(String tagname) {
		// TODO Auto-generated method stub
		return favoriteDao.findFavoriteByTag(tagname);
	}


	
		
		
	
	
}
