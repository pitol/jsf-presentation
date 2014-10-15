package ppitol.jsf.events;

import javax.faces.component.UIInput;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

import org.apache.log4j.Logger;

public class InputEventsListener implements SystemEventListener {

	private static final Logger log = Logger.getLogger(InputEventsListener.class);
	
	@Override
	public void processEvent(SystemEvent event) throws AbortProcessingException {
		log.info("Event on inputPost: " + event.toString());
	}

	@Override
	public boolean isListenerForSource(Object source) {
		if (source instanceof UIInput) {
			UIInput input = (UIInput) source;
			return input.getClientId().contains("inputPost");
		}
		return false;
	}
}
