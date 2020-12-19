package com.bancofuturo.workflow.externalconnection;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

/**
 * User: sergio <br/>
 * Date: 12/18/20 <br/>
 * Time: 2:20 PM <br/>
 *
 * @author Sergio Cadena
 */
public class ExternalConnectionDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable("hayConexion", new Random().nextBoolean());
    }
}
