package com.bancofuturo.workflow.externalconnection;

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
public class FailedConnectionDelegate implements JavaDelegate {
    Logger logger = Logger.getLogger(FailedConnectionDelegate.class.getName());

    final int IMPACT = FailedConnectionDelegate.getRandomImpact();

    final int SCOPE = FailedConnectionDelegate.getRandomImpact();
    final int TIME = FailedConnectionDelegate.getRandomImpact();
    final int QUALITY = FailedConnectionDelegate.getRandomImpact();
    final int COST = FailedConnectionDelegate.getRandomImpact();


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        final int impactResult = (IMPACT * SCOPE) + (IMPACT * TIME) + (IMPACT * QUALITY) + (IMPACT * COST);
        Urgency urgency = Urgency.getUrgency(impactResult);
        logger.log(Level.WARNING, "*************************************************************************************************************");
        logger.log(Level.WARNING, "La conexión con la entidad externa fallo esto genera un nivel de urgencia de solución " + urgency.getName());
        logger.log(Level.WARNING, "*************************************************************************************************************");
    }

    static int getRandomImpact() {
       return new Random().nextInt((3 - 1) + 1) + 1;
    }
}
