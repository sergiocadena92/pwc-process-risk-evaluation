package com.bancofuturo.workflow.sla;

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
public class SuccessfulySLADelegate implements JavaDelegate {
    Logger logger = Logger.getLogger(SuccessfulySLADelegate.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.log(Level.WARNING, "*************************************************************************************************************");
        logger.log(Level.INFO, "El proveedor cumple con los SLA adecuadamente");
        logger.log(Level.WARNING, "*************************************************************************************************************");
    }
}
