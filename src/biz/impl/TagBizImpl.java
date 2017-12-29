package biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.TagDao;
import entity.Tag;

import biz.FavoriteBiz;
import biz.TagBiz;

@Service("tagBiz")
@Transactional
public class TagBizImpl implements TagBiz {

	@Autowired
	private TagDao  tagDao;

	@Override
	public List<Tag> findAllTag() {
		// TODO Auto-generated method stub
		return tagDao.findAllTag();
	}


	
}
