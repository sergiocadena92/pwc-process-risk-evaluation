package com.bancofuturo.workflow.fusionbanco;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

/**
 * User: sergio <br/>
 * Date: 12/18/20 <br/>
 * Time: 9:33 PM <br/>
 *
 * @author Sergio Cadena
 */
public class BankPrepareFusionDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        delegateExecution.setVariable("estaLista", new Random().nextBoolean());
    }
}
