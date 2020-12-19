package com.bancofuturo.workflow.fusionbanco;

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
public class FusionReadyDelegate implements JavaDelegate {
    Logger logger = Logger.getLogger(FusionReadyDelegate.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.log(Level.WARNING, "*************************************************************************************************************");
        logger.log(Level.INFO, "La fusión bancaria esta autorizada");
        logger.log(Level.WARNING, "*************************************************************************************************************");
    }
}
