package com.bancofuturo.workflow.datadispersion;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

/**
 * User: sergio <br/>
 * Date: 12/18/20 <br/>
 * Time: 9:35 PM <br/>
 *
 * @author Sergio Cadena
 */
public class ProductValidationListener implements ExecutionListener {
    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        boolean appOne = (boolean)delegateExecution.getVariable("esInformacionConsistenteAppOne");
        boolean appTwo = (boolean)delegateExecution.getVariable("esInformacionConsistenteAppTwo");
        boolean appThree = (boolean)delegateExecution.getVariable("esInformacionConsistenteAppThree");

        delegateExecution.setVariable("informacionConsistente", (appOne && appTwo && appThree));
    }
}
