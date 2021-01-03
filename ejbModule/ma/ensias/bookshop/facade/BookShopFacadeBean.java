package ma.ensias.bookshop.facade;

import java.util.Collection;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.ensias.bookshop.persistance.Article;
import ma.ensias.bookshop.utils.BookShopFacade;

/**
 * Session Bean implementation class BookShopFacadeBean
 */
@Stateless(mappedName = "BookShopFacade")
@LocalBean
public class BookShopFacadeBean implements BookShopFacadeBeanRemote, BookShopFacadeBeanLocal {

	@PersistenceContext(unitName = "bookShopUnit")
	protected EntityManager em;
    /**
     * Default constructor. 
     */
    public BookShopFacadeBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Collection getAllArticlesFromFiliere(String filiere) {
		return BookShopFacade.getAllArticlesFromFiliere(filiere);
	}

	@Override
	public Collection getAllArticles() {
		Query req=em.createQuery("select a from Article a");
		return req.getResultList();
	}

	@Override
	public void addArticle(Article article) {
			em.persist(article);
	}

	@Override
	public void deleteArticle(int numeroArticle) {
		em.createQuery("delete from Article a where a.numeroArticle=:numeroArticle").setParameter("numeroArticle", numeroArticle).executeUpdate();
	}

}
