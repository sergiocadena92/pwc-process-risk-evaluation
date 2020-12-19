package com.bancofuturo.workflow.cambiolegislacion;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * User: sergio <br/>
 * Date: 12/18/20 <br/>
 * Time: 6:19 PM <br/>
 *
 * @author Sergio Cadena
 */
public class LegislationWithOutChangesDelegate implements JavaDelegate {
    Logger logger = Logger.getLogger(LegislationWithOutChangesDelegate.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.log(Level.WARNING, "*************************************************************************************************************");
        logger.log(Level.INFO, "No son necesarios cambios en las reglas del negocio ");
        logger.log(Level.WARNING, "*************************************************************************************************************");
    }
}
