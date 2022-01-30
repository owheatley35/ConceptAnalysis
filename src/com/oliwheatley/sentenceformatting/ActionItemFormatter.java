package com.oliwheatley.sentenceformatting;

public class ActionItemFormatter {
    public static String formatActionItem(String actionSentence, String actionWording) {
        if (actionWording.contains("action")) {
            actionSentence = actionSentence.split(actionWording)[1].trim();
            String firstChar = String.valueOf(actionSentence.charAt(0));
            actionSentence = actionSentence.replaceFirst(firstChar, firstChar.toUpperCase());
            return actionSentence;
        } else {
            return null;
        }
    }
}
