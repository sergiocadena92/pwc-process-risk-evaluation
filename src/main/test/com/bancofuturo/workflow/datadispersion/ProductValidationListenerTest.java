package com.bancofuturo.workflow.datadispersion;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * User: sergio <br/>
 * Date: 12/19/20 <br/>
 * Time: 12:14 AM <br/>
 *
 * @author Sergio Cadena
 */
@RunWith(MockitoJUnitRunner.class)
public class ProductValidationListenerTest {

    @Rule
    public ProcessEngineRule rule = new ProcessEngineRule();

    @Test
    @Deployment
    public void testWorkFlow() {
        RuntimeService runtimeService = rule.getRuntimeService();
        runtimeService.startProcessInstanceByKey("dispersion-datos");

        TaskService taskService = rule.getTaskService();
        Task singleResult = taskService.createTaskQuery().singleResult();
        Assert.assertEquals("My task", singleResult.getName());
    }
}
