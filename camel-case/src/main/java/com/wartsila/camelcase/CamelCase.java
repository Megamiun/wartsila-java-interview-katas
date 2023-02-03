package com.wartsila.camelcase;

import java.util.regex.Pattern;

class CamelCase {

    private final static Pattern separatorFinder = Pattern.compile("[-_](.)");

    static String toCamelCase(String s){
        if (s == null) return null;

        var cleanString = s.replaceAll("\\s+", "");
        return separatorFinder.matcher(cleanString).replaceAll(matchResult -> matchResult.group(1).toUpperCase());
    }
}