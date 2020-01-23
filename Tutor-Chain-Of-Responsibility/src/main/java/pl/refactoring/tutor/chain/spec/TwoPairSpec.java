package pl.refactoring.tutor.chain.spec;

import pl.refactoring.tutor.chain.CardSet;
import pl.refactoring.tutor.chain.RANKING;

import static pl.refactoring.tutor.chain.RANKING.TWO_PAIRS;

/**
 * Copyrights (c) 2018 IT Train Wlodzimierz Krakowski (www.refactoring.pl)
 *
 * This code is exclusive property of Wlodek Krakowski
 * for usage of attendees of trainings that are conducted by Wlodek Krakowski.
 *
 * This code may not be copied or used without
 * written consent of IT Train Wlodzimierz Krakowski (www.refactoring.pl)
 *
 * If willing to do so, please contact the author.
 */
public class TwoPairSpec implements Spec{
    public TwoPairSpec() {
    }

    public boolean isSatisfiedBy(CardSet cardSet) {
        return cardSet.hasRanks(3) && cardSet.hasOneRankSuits(1);
    }

    public RANKING getRanking() {
        return TWO_PAIRS;
    }
}