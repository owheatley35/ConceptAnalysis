package com.oliwheatley.comprehend;

import java.util.Arrays;
import java.util.List;

public class ComprehendOutputTranslator {
    final String fileContents;

    public ComprehendOutputTranslator(String fileContents) {
        this.fileContents = fileContents;
    }

    public List<String> getEntities() {
        // return new ComprehendEntity()
        return Arrays.asList("", "");
    }
}
