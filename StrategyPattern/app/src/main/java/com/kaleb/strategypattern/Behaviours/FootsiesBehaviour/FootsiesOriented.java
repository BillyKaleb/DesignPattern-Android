package com.kaleb.strategypattern.Behaviours.FootsiesBehaviour;

import android.content.Context;
import android.widget.Toast;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version FootsiesOriented, v 0.1 25/03/19 09.35 by Billy Kaleb Hananto
 */
public class FootsiesOriented implements FootsiesBehaviourInterface {

    private final Context context;

    public FootsiesOriented(Context context) {
        this.context = context;
    }

    @Override
    public String footsiesBehaviour() {
        return "Footsies Oriented";
    }

    @Override
    public void toastFootsiesBehaviour() {
        Toast.makeText(context, "This one is Footsies oriented!", Toast.LENGTH_SHORT).show();
    }
}
