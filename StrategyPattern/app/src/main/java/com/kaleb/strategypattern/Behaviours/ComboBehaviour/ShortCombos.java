package com.kaleb.strategypattern.Behaviours.ComboBehaviour;

import android.content.Context;
import android.widget.Toast;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version ShortCombos, v 0.1 25/03/19 09.33 by Billy Kaleb Hananto
 */
public class ShortCombos implements ComboBehaviourInterface {

    private final Context context;

    public ShortCombos(Context context) {
        this.context = context;
    }

    @Override
    public String comboBehaviour() {
        return "Short Combo";
    }

    @Override
    public void toastComboBehaviour() {
        Toast.makeText(context, "This one has Short combo!", Toast.LENGTH_SHORT).show();
    }
}
