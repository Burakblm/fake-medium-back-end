package databaseproject.fakeMedium.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import databaseproject.fakeMedium.business.abstracts.ArticleService;
import databaseproject.fakeMedium.core.utilities.results.DataResult;
import databaseproject.fakeMedium.core.utilities.results.SuccessDataResult;
import databaseproject.fakeMedium.dataAccess.abstracts.ArticleDao;
import databaseproject.fakeMedium.entities.concretes.Article;

@Service
public class ArticleManager implements ArticleService{
	
	private ArticleDao articleDao;
	
	public ArticleManager(ArticleDao articleDao) {
		super();
		this.articleDao = articleDao;
	}

	@Override
	public DataResult<List<Article>> getAll() {
		return new SuccessDataResult<List<Article>>(
				this.articleDao.findAll(),"Data Listelendi");
	}

}
