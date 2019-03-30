package com.kaleb.strategypattern.Main.Games;

import com.kaleb.strategypattern.Behaviours.ComboBehaviour.LongCombos;
import com.kaleb.strategypattern.Behaviours.ExecutionBehaviour.StrictExecution;
import com.kaleb.strategypattern.Behaviours.FootsiesBehaviour.FootsiesOriented;

import android.content.Context;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version UnielGame, v 0.1 30/03/19 12.45 by Billy Kaleb Hananto
 */
public class UnielGame extends BaseGame {

    public UnielGame(Context context) {
        footsiesBehaviourInterface = new FootsiesOriented(context);
        executionBehaviourInterface = new StrictExecution(context);
        comboBehaviourInterface = new LongCombos(context);
    }
}
