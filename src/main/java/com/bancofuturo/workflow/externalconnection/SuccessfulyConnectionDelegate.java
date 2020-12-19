package com.bancofuturo.workflow.externalconnection;

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
public class SuccessfulyConnectionDelegate implements JavaDelegate {
    Logger logger = Logger.getLogger(SuccessfulyConnectionDelegate.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.log(Level.WARNING, "*************************************************************************************************************");
        logger.log(Level.INFO, "La conexión con la entidad externa fue exitosa");
        logger.log(Level.WARNING, "*************************************************************************************************************");
    }
}
