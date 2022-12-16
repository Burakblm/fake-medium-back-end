package databaseproject.fakeMedium.business.abstracts;

import java.util.List;

import databaseproject.fakeMedium.core.utilities.results.DataResult;
import databaseproject.fakeMedium.entities.concretes.Article;

public interface ArticleService {
	
	DataResult<List<Article>> getAll();
	

}
