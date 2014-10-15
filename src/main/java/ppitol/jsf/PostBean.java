package ppitol.jsf;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UICommand;
import javax.faces.component.UIInput;
import javax.inject.Inject;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;
import ppitol.jsf.post.PostIt;
import ppitol.jsf.post.PostItRepo;

/**
 * Backing bean for the post-it page
 * @author pitol
 */
@Named
@RequestScoped
@Getter
@Setter
public class PostBean {

	@Inject
	private PostItRepo repo;
	
	private UIInput inputPost;
	private UICommand savePost;
	
	private String postIt;
	
	public String savePostIt() {
		PostIt post = new PostIt();
		post.setText(postIt);
		
		repo.save(post);
		
		postIt = null;
		return "index";
	}
	
	public List<PostIt> getAll() {
		List<PostIt> all = repo.getAllPosts();
		return all;
	}
}
