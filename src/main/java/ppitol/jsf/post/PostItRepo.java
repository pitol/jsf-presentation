package ppitol.jsf.post;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Named
public class PostItRepo {

	@PersistenceContext
	private EntityManager em;
	
	public void save(PostIt post) {
		em.persist(post);
	}
	
	@SuppressWarnings("unchecked")
	public List<PostIt> getAllPosts() {
		return em.createNamedQuery("PostIt.all").getResultList();
	}
}
