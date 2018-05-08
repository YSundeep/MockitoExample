package junit.model;

public class WordWrap {
    public static String wrap(final String word,final int lineLength) {
        final StringBuilder sb = new StringBuilder();
        sb.append(word,0,Math.min(word.length(),lineLength));
        if(word.length() > lineLength)
        {
            sb.append("\n");
            sb.append(word, lineLength, word.length());
        }
        return sb.toString();
    }
}
