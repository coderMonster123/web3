package action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import biz.FavoriteBiz;
import biz.TagBiz;

import com.opensymphony.xwork2.ActionSupport;

import entity.Tag;

@Controller("tagAction")
public class TagAction  extends ActionSupport{

	@Autowired
	private TagBiz  tagBiz;
	private List<Tag> tagList;
	
	public List<Tag> getTagList() {
		return tagList;
	}

	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}

	public String findAllTag()
	{
		tagList=tagBiz.findAllTag();
		return SUCCESS;
	}

	
}
