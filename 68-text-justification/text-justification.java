class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < words.length) {

            int letters = words[i].length();
            int j = i + 1;

            // Ek line me jitne words fit ho sake
            while (j < words.length &&
                   letters + words[j].length() + (j - i) <= maxWidth) {

                letters += words[j].length();
                j++;
            }

            int gaps = j - i - 1;
            StringBuilder sb = new StringBuilder();

            // Last line ya single word
            if (j == words.length || gaps == 0) {

                for (int k = i; k < j; k++) {

                    sb.append(words[k]);

                    if (k < j - 1) {
                        sb.append(" ");
                    }
                }

                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }

            } else {

                int totalSpaces = maxWidth - letters;
                int spacesPerGap = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;

                for (int k = i; k < j - 1; k++) {

                    sb.append(words[k]);

                    for (int s = 0; s < spacesPerGap; s++) {
                        sb.append(" ");
                    }

                    if (extraSpaces > 0) {
                        sb.append(" ");
                        extraSpaces--;
                    }
                }

                sb.append(words[j - 1]);
            }

            ans.add(sb.toString());
            i = j;
        }

        return ans;
    }
}  