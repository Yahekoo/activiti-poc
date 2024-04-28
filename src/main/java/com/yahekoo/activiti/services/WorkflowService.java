package com.yahekoo.activiti.services;

import com.yahekoo.activiti.models.out.WorkflowGenereicResponse;
import org.activiti.engine.task.Task;

import java.util.List;

public interface WorkflowService {
    WorkflowGenereicResponse claimTask(String taskId, String assigneeName);

    WorkflowGenereicResponse completeTask(String taskId);

    List<Task> getTaskListOfGroup(String groupName);

    List<Task> getTaskListOfUser(String userName);

    /*
    List<Task> tasks = taskService.createTaskQuery().taskAssignee("kermit").list();

     List<Task> tasks = taskService.createTaskQuery().taskCandidateUser("kermit");

This will retrieve all tasks where kermit is a candidate user, i.e. the formal expression contains user(kermit). This will also retrieve all tasks that are assigned to a group where kermit is a member of (e.g. group(management), if kermit is a member of that group and the Activiti identity component is used). The groups of a user are resolved at runtime and these can be managed through the IdentityService.
     */


    boolean verifyProcessFinished(String procKey);

    String getProcessIdByKey(String procKey);

    String startProcessInstanceByKey(String procKey);

    String startProcessInstanceById(String procId);

    String getTaskDescription(Task task);


}
