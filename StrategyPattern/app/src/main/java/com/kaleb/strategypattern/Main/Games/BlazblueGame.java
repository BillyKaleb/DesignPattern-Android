package com.kaleb.strategypattern.Main.Games;

import com.kaleb.strategypattern.Behaviours.ComboBehaviour.LongCombos;
import com.kaleb.strategypattern.Behaviours.ExecutionBehaviour.LooseExecution;
import com.kaleb.strategypattern.Behaviours.FootsiesBehaviour.NotFootsiesOriented;

import android.content.Context;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version BlazblueGame, v 0.1 30/03/19 12.43 by Billy Kaleb Hananto
 */
public class BlazblueGame extends BaseGame {

    public BlazblueGame(Context context) {
        footsiesBehaviourInterface = new NotFootsiesOriented(context);
        comboBehaviourInterface = new LongCombos(context);
        executionBehaviourInterface = new LooseExecution(context);
    }
}
