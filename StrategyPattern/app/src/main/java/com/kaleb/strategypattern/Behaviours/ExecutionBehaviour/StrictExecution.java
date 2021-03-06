package com.kaleb.strategypattern.Behaviours.ExecutionBehaviour;

import android.content.Context;
import android.widget.Toast;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version StrictExecution, v 0.1 25/03/19 09.34 by Billy Kaleb Hananto
 */
public class StrictExecution implements ExecutionBehaviourInterface {

    private final Context context;

    public StrictExecution(Context context) {
        this.context = context;
    }

    @Override
    public String executionBehaviour() {
        return "Strict Execution";
    }

    @Override
    public void toastExecutionBehaviour() {
        Toast.makeText(context, "This one has Strict execution!", Toast.LENGTH_SHORT).show();
    }
}
