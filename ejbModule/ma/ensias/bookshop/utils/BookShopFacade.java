package ma.ensias.bookshop.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ma.ensias.bookshop.persistance.Article;

public class BookShopFacade {
	

	public static Collection getAllArticlesFromFiliere(String filiere) {
		List<Article> listArticles=new ArrayList<Article>();
		if (filiere.equals("filiere 1")) {
			listArticles.add(new Article(1, 1, 10));
			listArticles.add(new Article(2, 2, 20));
			listArticles.add(new Article(3, 3, 30));
		} else if (filiere.equals("filiere 2")) {
			listArticles.add(new Article(10, 10, 100));
			listArticles.add(new Article(20, 20, 200));
			listArticles.add(new Article(30, 30, 300));
		}
		return listArticles;
	}

	public static Collection getAllArticles() {
		List<Article> listArticles=new ArrayList<Article>();
		listArticles.add(new Article(1, 1, 10));
		listArticles.add(new Article(2, 2, 20));
		listArticles.add(new Article(3, 3, 30));
		listArticles.add(new Article(10, 10, 100));
		listArticles.add(new Article(20, 20, 200));
		listArticles.add(new Article(30, 30, 300));
		return listArticles;
	}

	public static  void addArticle(Article article) {
		List<Article> listArticles=new ArrayList<Article>(); 
		listArticles.add(new Article(article.getNumeroArticle(), article.getLibelle(), article.getPrix()));
		System.out.println("Article ajouté: "+article.getNumeroArticle()+" "+article.getLibelle()+" "+ article.getPrix());

	}
}
