package com.oliwheatley;

import com.oliwheatley.sentenceformatting.ActionItemFormatter;
import com.oliwheatley.sentenceformatting.SentenceExtractor;

public class Main {

    public static void main(String[] args) {
        String inputString = "This is a plain test file containing our conversation. Let's take an action to purchase new hardware for next week.";
        String comprehendCheckerText = "action to";

        String sentence = SentenceExtractor.extractFullSentence(69, 78, inputString);
        String action = ActionItemFormatter.formatActionItem(sentence, comprehendCheckerText);

        System.out.println("FORMATTED: " + sentence);
        System.out.println("ACTION: " + action);
    }
}
