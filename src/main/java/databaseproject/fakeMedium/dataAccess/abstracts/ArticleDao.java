package databaseproject.fakeMedium.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import databaseproject.fakeMedium.entities.concretes.Article;

public interface ArticleDao extends JpaRepository<Article, Integer>{
	
	Article getByArticleTitle(String articleTitle);

}
