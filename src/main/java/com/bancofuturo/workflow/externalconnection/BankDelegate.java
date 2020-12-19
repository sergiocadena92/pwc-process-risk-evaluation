package com.bancofuturo.workflow.externalconnection;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * User: sergio <br/>
 * Date: 12/18/20 <br/>
 * Time: 5:58 PM <br/>
 *
 * @author Sergio Cadena
 */
public class BankDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable("esRecibido", true);
    }
}
