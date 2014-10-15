package ppitol.jsf.events;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.log4j.Logger;

public class PostItPhaseListener implements PhaseListener {

	private static final long serialVersionUID = 1L;
	
	private static final Logger log = Logger.getLogger(PostItPhaseListener.class);

	@Override
	public void afterPhase(PhaseEvent event) {
		log.info("afterPhase: " + event.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		log.info("beforePhase: " + event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
}
