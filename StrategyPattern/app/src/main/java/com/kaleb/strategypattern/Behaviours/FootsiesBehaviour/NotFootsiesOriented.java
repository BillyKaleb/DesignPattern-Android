package com.kaleb.strategypattern.Behaviours.FootsiesBehaviour;

import android.content.Context;
import android.widget.Toast;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version NotFootsiesOriented, v 0.1 25/03/19 09.36 by Billy Kaleb Hananto
 */
public class NotFootsiesOriented implements FootsiesBehaviourInterface {

    private final Context context;

    public NotFootsiesOriented(Context context) {
        this.context = context;
    }

    @Override
    public String footsiesBehaviour() {
        return "Not Footsies Oriented";
    }

    @Override
    public void toastFootsiesBehaviour() {
        Toast.makeText(context, "This on is Not Footsies oriented!", Toast.LENGTH_SHORT).show();
    }
}
