package org.example;

import org.apache.commons.lang3.StringUtils;

public class StringPorcessor {
    public String appendIfMissing(String str, String suffix){
        return StringUtils.appendIfMissing(str,suffix);
    }

}
