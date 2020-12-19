package com.bancofuturo.workflow.datadispersion;

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
public class FailedProductCreationDelegate implements JavaDelegate {
    Logger logger = Logger.getLogger(FailedProductCreationDelegate.class.getName());

    final int IMPACT = FailedProductCreationDelegate.getRandomImpact();

    final int SCOPE = FailedProductCreationDelegate.getRandomImpact();
    final int TIME = FailedProductCreationDelegate.getRandomImpact();
    final int QUALITY = FailedProductCreationDelegate.getRandomImpact();
    final int COST = FailedProductCreationDelegate.getRandomImpact();


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        final int impactResult = (IMPACT * SCOPE) + (IMPACT * TIME) + (IMPACT * QUALITY) + (IMPACT * COST);
        Urgency urgency = Urgency.getUrgency(impactResult);
        logger.log(Level.WARNING, "*************************************************************************************************************");
        logger.log(Level.WARNING, "La información del producto no es consistente esto genera un nivel de urgencia " + urgency.getName());
        logger.log(Level.WARNING, "*************************************************************************************************************");
    }

    static int getRandomImpact() {
       return new Random().nextInt((3 - 1) + 1) + 1;
    }
}
