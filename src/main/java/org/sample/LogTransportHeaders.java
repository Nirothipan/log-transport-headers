package org.sample;

import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import java.util.Map;

public class LogTransportHeaders extends AbstractMediator {

    public boolean mediate(MessageContext msgContext) {

        try {

            log.info("Executing " + this.getClass().getSimpleName());

            Map headers = (Map) ((Axis2MessageContext) msgContext).getAxis2MessageContext()
                    .getProperty(org.apache.axis2.context.MessageContext.TRANSPORT_HEADERS);

            if (headers == null || headers.isEmpty()) {
                log.info("No Transport Headers Found");
                return true;
            }

            for (Object name : headers.keySet()) {
                String key = name.toString();
                String value = headers.get(name).toString();
                log.info(key + " " + value);
            }

        } catch (Exception e) {
            log.error("Error while logging TRP Headers", e);
            return false;
        }
        return true;
    }
}
