package SE.Versionsverwaltung;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]+\u002E[0-9]+\u002E[0-9]+");
        String inputs[] = {
                "none",
                "1.0.0",
                "12.345.6789",
                ".2.2",
                "9",
                "4.."
        };
        for(String input: inputs){
            Matcher matcher = pattern.matcher(input);
            boolean matchFound = matcher.find();
            if(matchFound) {System.out.println("   Match: " + input);
            } else {System.out.println("NO Match: " + input);}
        }
    }
}
