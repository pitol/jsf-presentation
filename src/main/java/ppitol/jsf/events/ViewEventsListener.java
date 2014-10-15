package ppitol.jsf.events;

import javax.faces.component.UIViewRoot;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

import org.apache.log4j.Logger;

public class ViewEventsListener implements SystemEventListener {

	private static final Logger log = Logger.getLogger(ViewEventsListener.class);
	
	@Override
	public void processEvent(SystemEvent event) throws AbortProcessingException {
		log.info("Event on view: " + event.toString());
	}

	@Override
	public boolean isListenerForSource(Object source) {
		if (source instanceof UIViewRoot) {
			return true;
		}
		return false;
	}
}
