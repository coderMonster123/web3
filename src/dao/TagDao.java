package dao;

import java.util.List;

import entity.Tag;

public interface TagDao {

	void saveOrUpdate(Tag t);
	Tag  findTagByName(String  name);
	List<Tag>  findAllTag();
	
}
