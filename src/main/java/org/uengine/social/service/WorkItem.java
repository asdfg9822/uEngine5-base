package org.uengine.social.service;

import org.uengine.kernel.Activity;
import org.uengine.social.entity.WorklistEntity;

import java.util.Map;

/**
 * Created by uengine on 2017. 8. 22..
 * It is an "Associate" object that associates entity - ActivityEntity and value object - desiredState and ResultPayload
 */
public class WorkItem {

    WorklistEntity worklist;
        public WorklistEntity getWorklist() {
            return worklist;
        }
        public void setWorklist(WorklistEntity worklist) {
            this.worklist = worklist;
        }

    Activity activity;
        public Activity getActivity() {
            return activity;
        }
        public void setActivity(Activity activity) {
            this.activity = activity;
        }

    String desiredState;
        public String getDesiredState() {
            return desiredState;
        }
        public void setDesiredState(String desiredState) {
            this.desiredState = desiredState;
        }

    Map<String, Object> parameterValues;
        public Map<String, Object> getParameterValues() {
            return parameterValues;
        }
        public void setParameterValues(Map<String, Object> parameterValues) {
            this.parameterValues = parameterValues;
        }

}
