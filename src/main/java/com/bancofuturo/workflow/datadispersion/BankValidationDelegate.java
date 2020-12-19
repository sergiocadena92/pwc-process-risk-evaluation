package com.bancofuturo.workflow.datadispersion;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * User: sergio <br/>
 * Date: 12/18/20 <br/>
 * Time: 9:33 PM <br/>
 *
 * @author Sergio Cadena
 */
public class BankValidationDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable("esValidarInformacion", true);
    }
}
