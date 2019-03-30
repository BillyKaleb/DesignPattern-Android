package com.kaleb.strategypattern.Behaviours.ComboBehaviour;

import android.content.Context;
import android.widget.Toast;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version LongCombos, v 0.1 25/03/19 09.33 by Billy Kaleb Hananto
 */
public class LongCombos implements ComboBehaviourInterface {

    private final Context context;

    public LongCombos(Context context) {
        this.context = context;
    }

    @Override
    public String comboBehaviour() {
        return "Long Combo";
    }

    @Override
    public void toastComboBehaviour() {
        Toast.makeText(context, "This one has Long combo!", Toast.LENGTH_SHORT).show();
    }
}
