package ppitol.jsf;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UICommand;
import javax.faces.component.UIInput;
import javax.inject.Inject;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

import org.apache.log4j.Logger;

import ppitol.jsf.post.PostIt;
import ppitol.jsf.post.PostItRepo;

/**
 * Backing bean for the post-it page
 * @author pitol
 */
@Named
@RequestScoped
public class PostBean {

	private static final Logger log = Logger.getLogger(PostBean.class);
	
	@Inject
	private PostItRepo repo;
	
	@Getter
	@Setter
	private UIInput inputPost;

	@Getter
	@Setter
	private UICommand savePost;
	
	private String postIt;
	
	public String savePostIt() {
		log.info("on savePostIt()");
		
		PostIt post = new PostIt();
		post.setText(postIt);
		
		repo.save(post);
		
		postIt = null;
		return "index";
	}

	public String getPostIt() {
		log.info("on getPostIt(): " + postIt);
		return postIt;
	}

	public void setPostIt(String postIt) {
		log.info("on setPostIt(" + postIt + ")");
		this.postIt = postIt;
	}
}
