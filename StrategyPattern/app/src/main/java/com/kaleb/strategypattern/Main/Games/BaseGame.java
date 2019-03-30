package com.kaleb.strategypattern.Main.Games;

import com.kaleb.strategypattern.Behaviours.ComboBehaviour.ComboBehaviourInterface;
import com.kaleb.strategypattern.Behaviours.ExecutionBehaviour.ExecutionBehaviourInterface;
import com.kaleb.strategypattern.Behaviours.FootsiesBehaviour.FootsiesBehaviourInterface;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version BaseGame, v 0.1 30/03/19 12.40 by Billy Kaleb Hananto
 */
public abstract class BaseGame {

    ComboBehaviourInterface comboBehaviourInterface;

    ExecutionBehaviourInterface executionBehaviourInterface;

    FootsiesBehaviourInterface footsiesBehaviourInterface;

    public BaseGame() {
    }

    public void yellTheCombos() {
        comboBehaviourInterface.toastComboBehaviour();
    }

    public void yellTheExecution() {
        executionBehaviourInterface.toastExecutionBehaviour();
    }

    public void yellTheFootsies() {
        footsiesBehaviourInterface.toastFootsiesBehaviour();
    }
}
