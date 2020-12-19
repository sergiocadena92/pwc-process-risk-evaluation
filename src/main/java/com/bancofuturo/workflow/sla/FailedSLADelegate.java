package com.bancofuturo.workflow.sla;

import com.bancofuturo.util.Urgency;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * User: sergio <br/>
 * Date: 12/18/20 <br/>
 * Time: 6:19 PM <br/>
 *
 * @author Sergio Cadena
 */
public class FailedSLADelegate implements JavaDelegate {
    Logger logger = Logger.getLogger(FailedSLADelegate.class.getName());

    final int IMPACT = FailedSLADelegate.getRandomImpact();

    final int SCOPE = FailedSLADelegate.getRandomImpact();
    final int TIME = FailedSLADelegate.getRandomImpact();
    final int QUALITY = FailedSLADelegate.getRandomImpact();
    final int COST = FailedSLADelegate.getRandomImpact();


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        final int impactResult = (IMPACT * SCOPE) + (IMPACT * TIME) + (IMPACT * QUALITY) + (IMPACT * COST);
        Urgency urgency = Urgency.getUrgency(impactResult);
        logger.log(Level.WARNING, "*************************************************************************************************************");
        logger.log(Level.WARNING, "El proveedor no cumple con los SLA adecuadamente esto genera un nivel de urgencia " + urgency.getName());
        logger.log(Level.WARNING, "*************************************************************************************************************");
    }

    static int getRandomImpact() {
       return new Random().nextInt((3 - 1) + 1) + 1;
    }
}
