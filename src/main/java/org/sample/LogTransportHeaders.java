package org.sample;

import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import java.util.Map;

/**
 * This class is used to log all the transport headers in WSO2 ESB / EI.
 */
public class LogTransportHeaders extends AbstractMediator {

    public boolean mediate(MessageContext msgContext) {

        try {
            Map headers = (Map) ((Axis2MessageContext) msgContext).getAxis2MessageContext()
                    .getProperty(org.apache.axis2.context.MessageContext.TRANSPORT_HEADERS);

            if (headers == null || headers.isEmpty()) {
                log.info("No Transport Headers Found");
                return true;
            }

            log.info("=======================================================");

            for (Object name : headers.keySet()) {
                String key = name.toString();
                String value = headers.get(name).toString();
                log.info(key + " " + value);
            }

            log.info("=======================================================");

        } catch (Exception e) {
            log.error("Error while logging TRP Headers", e);
            return false;
        }
        return true;
    }
}
