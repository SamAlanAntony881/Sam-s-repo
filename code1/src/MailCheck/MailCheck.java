package MailCheck;

public class MailCheck {
    String emailId;

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public boolean checkValidId(String emailId){
        String modelEmailId = "gmail.com";
        String[] subWord;
        subWord = emailId.split("@");
        boolean check = subWord[1].equals(modelEmailId);
        return check;
    }
    public Exception checkSpecialChar(String emailId) throws Exception {
        int a = 0;
        String[] subWord;
        subWord = emailId.split("@");
        for(int i=0;i<subWord[0].length();i++){
            if((!Character.isDigit(subWord[0].charAt(i)))
                    &&(!Character.isLetter(subWord[0].charAt(i)))){
                if ((int) subWord[0].charAt(i) != 95) {
                    a = 1;
                    return new Exception("Not Valid") ;}
            }

        }
        if ( a==0 )
            System.out.println( "valid");

        return null;
    }
}


