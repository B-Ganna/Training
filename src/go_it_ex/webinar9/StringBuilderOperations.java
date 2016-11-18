package go_it_ex.webinar9;


public class StringBuilderOperations {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        int startOfSubstrInc1 = 3;
        int endOfSubstrExc1 = 5;
        int indexOffset = 4;
        int charIndex = 4;

        builder.append("new ending");
        builder.delete(startOfSubstrInc1, endOfSubstrExc1);
        builder.insert(indexOffset, "some sub string");
        builder.replace(startOfSubstrInc1, endOfSubstrExc1, "replace");
        builder.setCharAt(charIndex, 'a');

        String builderString = builder.toString();
        System.out.println(builderString);

    }
}
