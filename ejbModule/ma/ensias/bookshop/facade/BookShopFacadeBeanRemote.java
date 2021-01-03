package ma.ensias.bookshop.facade;

import java.util.Collection;

import javax.ejb.Remote;

import ma.ensias.bookshop.persistance.Article;

@Remote
public interface BookShopFacadeBeanRemote {
	public Collection getAllArticlesFromFiliere(String filiere);
	public Collection getAllArticles();
	public void addArticle(Article article);
	public void deleteArticle(int numArticle);
}
