package com.sbs.starter.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sbs.starter.dto.Article;

@Component // 이것을 사용해야 Autowired에 의한 연결에 적용된다.
public class ArticleDaoImpl implements ArticleDao {
	public List<Article> getList() {
		Article article1 = new Article(1, "2019-08-20 12:12:12", "제목1", "내용1");
		Article article2 = new Article(2, "2019-08-20 12:12:13", "제목2", "내용2");
		Article article3 = new Article(3, "2019-08-20 12:12:14", "제목3", "내용3");
		
		List<Article> list = new ArrayList<>();
		
		list.add(article1);
		list.add(article2);
		list.add(article3);
		
		return list;
	}
}

// 여기서 마이바티스가 대신 작업하도록 한다. (마이바티스는 진짜 DB에서 가져오는 것.)