class LengthOfLAstWord {
    public int lengthOfLastWord(String s) {

        int len=0;
        String st=s.trim();
        for(int i=0;i<st.length();i++) {
            if(st.charAt(i)==' ')
                len=0;
            else
                len++;
        }
        return len;

    }
}