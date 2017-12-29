package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.TagDao;
import entity.Tag;

public class TagDaoImpl extends HibernateDaoSupport implements TagDao {

	@Override
	public void saveOrUpdate(Tag t) {
		this.getHibernateTemplate().merge(t);
	}

	@Override
	public Tag findTagByName(String name) {
		List<Tag> list = this.getHibernateTemplate().find(
				"from Tag where name=?", name);
		if (list.size() == 0)
			return null;
		else
			return list.get(0);
	}

	@Override
	public List<Tag> findAllTag() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Tag");
	}

	

}
