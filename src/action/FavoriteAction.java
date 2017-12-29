package action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import biz.FavoriteBiz;

import com.opensymphony.xwork2.ActionSupport;

import entity.Favorite;

@Controller("favoriteAction")
public class FavoriteAction extends ActionSupport {

	@Autowired
	private FavoriteBiz favoriteBiz;

	private Favorite favorite;

	private String tagname;

	private List<Favorite> favoriteList;

	public List<Favorite> getFavoriteList() {
		return favoriteList;
	}

	public void setFavoriteList(List<Favorite> favoriteList) {
		this.favoriteList = favoriteList;
	}

	public String getTagname() {
		return tagname;
	}

	public void setTagname(String tagname) {
		this.tagname = tagname;
	}

	public Favorite getFavorite() {
		return favorite;
	}

	public void setFavorite(Favorite favorite) {
		this.favorite = favorite;
	}

	public String addFavorite() {
		favoriteBiz.save(favorite);
		return SUCCESS;
	}

	public String findFavoriteByTag() throws UnsupportedEncodingException {
		tagname = new String(tagname.getBytes("iso-8859-1"), "gbk");
		favoriteList = favoriteBiz.findFavoriteByTag(tagname);
		return SUCCESS;
	}
}
