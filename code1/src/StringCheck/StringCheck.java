package StringCheck;

public class StringCheck {
    String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean lengthCheck(String password){
        if((password.length()>=8)&&(password.length()<=15))
        {
            return true;
        }
        else
            return false;}
    public boolean checkAlphanum(String password){
        int a = 0;
        for(int i=0;i<password.length();i++){
           if((!Character.isDigit(password.charAt(i)))&&(!Character.isWhitespace(password.charAt(i)))
                   &&(!Character.isLetter(password.charAt(i))))
           {
               a++;
           }
        }if (a>1)
            return true;
        else
            return false;
    }
}
