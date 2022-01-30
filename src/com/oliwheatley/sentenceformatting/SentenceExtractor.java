package com.oliwheatley.sentenceformatting;

public class SentenceExtractor {

    public static String extractFullSentence(int startIndex, int endIndex, String fullString) {
        int prePeriodIndex = startIndex;
        int postPeriodIndex = endIndex;
        int relativeIndex = 0;
        boolean isPeriodsNotFound = true;
        int fullStringCharLength = fullString.length() - 1;

        Integer sentenceStartIndex = null;
        Integer sentenceEndIndex = null;

        while (isPeriodsNotFound && (prePeriodIndex > 0 || postPeriodIndex < fullStringCharLength)) {
            relativeIndex ++;
            prePeriodIndex = startIndex - relativeIndex;
            postPeriodIndex = endIndex + relativeIndex;

            // Check front char.
            if ((sentenceStartIndex == null) && (prePeriodIndex == 0 || fullString.charAt(prePeriodIndex) == '.')) {
                sentenceStartIndex = prePeriodIndex;
            }

            // Check back char.
            if ((sentenceEndIndex == null) && (fullString.charAt(postPeriodIndex) == '.') || postPeriodIndex == fullStringCharLength) {
                sentenceEndIndex = postPeriodIndex;
            }

            // End Loop if indexes found.
            if (sentenceStartIndex != null && sentenceEndIndex != null) {
                isPeriodsNotFound = false;
            }
        }

        // Extract sentence
        if (!isPeriodsNotFound) {
            return cleanUpSentence(fullString.substring(sentenceStartIndex, sentenceEndIndex));
        } else {
            return "NOT FOUND";
        }
    }

    /**
     * Formats a sentence correctly after going through the identification procedure.
     */
    private static String cleanUpSentence(final String foundSentence) {

        String sentence = foundSentence.replaceAll("\\.", "");
        sentence = sentence.trim();
        sentence  = sentence + ".";

        return sentence;
    }
}
