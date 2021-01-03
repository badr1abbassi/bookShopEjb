package ma.ensias.bookshop.facade;

import java.util.Collection;

import javax.ejb.Local;

import ma.ensias.bookshop.persistance.Article;

@Local
public interface BookShopFacadeBeanLocal {
	public Collection getAllArticlesFromFiliere(String filiere);
	public Collection getAllArticles();
	public void addArticle(Article article);
	public void deleteArticle(int numArticle);
}
