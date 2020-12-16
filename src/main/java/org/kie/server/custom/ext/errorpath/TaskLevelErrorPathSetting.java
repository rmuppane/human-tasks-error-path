package org.kie.server.custom.ext.errorpath;

import java.util.List;

import org.jbpm.services.api.ProcessService;
import org.jbpm.services.api.service.ServiceRegistry;
import org.jbpm.services.task.lifecycle.listeners.TaskLifeCycleEventListener;
import org.kie.api.task.TaskEvent;
import org.kie.api.task.model.OrganizationalEntity;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.server.services.api.KieContainerInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskLevelErrorPathSetting implements TaskLifeCycleEventListener {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TaskLevelErrorPathSetting.class);
	
	private  KieContainerInstance kieContainer;
	
	
	public TaskLevelErrorPathSetting(final KieContainerInstance kieContainer) {
		 this.kieContainer = kieContainer;
	}
	
	public TaskLevelErrorPathSetting() {
	}
	
	public void afterTaskAssignmentsAddedEvent(TaskEvent event, AssignmentType type, List<OrganizationalEntity> entities){
		System.out.println("afterTaskAssignmentsAddedEvent [" + event.getTaskContext().getUserId() +"]");
	}
	
    public void afterTaskClaimedEvent( TaskEvent event) {
    	System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
    }

	public void beforeTaskActivatedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskClaimedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskSkippedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskStartedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskStoppedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskCompletedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskFailedEvent(TaskEvent event) {
		ProcessService ps = (ProcessService)ServiceRegistry.get().service(ServiceRegistry.PROCESS_SERVICE);
		ps.setProcessVariable(event.getTask().getTaskData().getProcessInstanceId(), "taskstatus", "failed");
	}

	public void beforeTaskAddedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskExitedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskReleasedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskResumedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskSuspendedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskForwardedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskDelegatedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void beforeTaskNominatedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskActivatedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskSkippedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskStartedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskStoppedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskCompletedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskFailedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskAddedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskExitedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskReleasedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskResumedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskSuspendedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskForwardedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskDelegatedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}

	public void afterTaskNominatedEvent(TaskEvent event) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName() + " Task perforemd User [" + event.getTaskContext().getUserId() + "] ActualOwner [" + event.getTask().getTaskData().getActualOwner() +"]");
	}
}
