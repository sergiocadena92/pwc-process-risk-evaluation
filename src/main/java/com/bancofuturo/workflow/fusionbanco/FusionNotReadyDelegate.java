package com.bancofuturo.workflow.fusionbanco;

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
public class FusionNotReadyDelegate implements JavaDelegate {
    Logger logger = Logger.getLogger(FusionNotReadyDelegate.class.getName());

    final int IMPACT = FusionNotReadyDelegate.getRandomImpact();

    final int SCOPE = FusionNotReadyDelegate.getRandomImpact();
    final int TIME = FusionNotReadyDelegate.getRandomImpact();
    final int QUALITY = FusionNotReadyDelegate.getRandomImpact();
    final int COST = FusionNotReadyDelegate.getRandomImpact();


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        final int impactResult = (IMPACT * SCOPE) + (IMPACT * TIME) + (IMPACT * QUALITY) + (IMPACT * COST);
        Urgency urgency = Urgency.getUrgency(impactResult);
        logger.log(Level.WARNING, "*************************************************************************************************************");
        logger.log(Level.WARNING, "No esta lista la adecuación tecnologica para la fusion bancaria esto genera un nivel de urgencia " + urgency.getName());
        logger.log(Level.WARNING, "*************************************************************************************************************");
    }

    static int getRandomImpact() {
       return new Random().nextInt((3 - 1) + 1) + 1;
    }
}
