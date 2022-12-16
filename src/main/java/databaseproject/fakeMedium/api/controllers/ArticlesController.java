package databaseproject.fakeMedium.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import databaseproject.fakeMedium.business.abstracts.ArticleService;
import databaseproject.fakeMedium.core.utilities.results.DataResult;
import databaseproject.fakeMedium.entities.concretes.Article;

@RestController
@RequestMapping("api/articles")
@CrossOrigin
public class ArticlesController {
	
	@Autowired
	private ArticleService articleService;

	public ArticlesController(ArticleService articleService) {
		super();
		this.articleService = articleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Article>> getAll(){
		return this.articleService.getAll();
	}

}
