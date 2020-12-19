package com.bancofuturo.workflow.cambiolegislacion;

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
public class LegislationWithChangesDelegate implements JavaDelegate {
    Logger logger = Logger.getLogger(LegislationWithChangesDelegate.class.getName());

    final int IMPACT = LegislationWithChangesDelegate.getRandomImpact();

    final int SCOPE = LegislationWithChangesDelegate.getRandomImpact();
    final int TIME = LegislationWithChangesDelegate.getRandomImpact();
    final int QUALITY = LegislationWithChangesDelegate.getRandomImpact();
    final int COST = LegislationWithChangesDelegate.getRandomImpact();


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        final int impactResult = (IMPACT * SCOPE) + (IMPACT * TIME) + (IMPACT * QUALITY) + (IMPACT * COST);
        Urgency urgency = Urgency.getUrgency(impactResult);
        logger.log(Level.WARNING, "*************************************************************************************************************");
        logger.log(Level.WARNING, "Hubo cambios en legislación, es necesario modificar la reglas del negocio esto genera un nivel de urgencia " + urgency.getName());
        logger.log(Level.WARNING, "*************************************************************************************************************");
    }

    static int getRandomImpact() {
       return new Random().nextInt((3 - 1) + 1) + 1;
    }
}
