package ppitol.jsf.events;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

import org.apache.log4j.Logger;

public class ApplicationEventsListener implements SystemEventListener {

	private static final Logger log = Logger.getLogger(ApplicationEventsListener.class);
	
	@Override
	public void processEvent(SystemEvent event) throws AbortProcessingException {
		log.info("Application Event : " + event.toString());
	}

	@Override
	public boolean isListenerForSource(Object source) {
		return true;
	}
}
