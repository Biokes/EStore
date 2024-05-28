package africa.semicolon.exceptions;

public enum ErrorMessages {
    INVALID_EMAIL("Invalid email provided."),
    INVALID_PASSWORD("Password must be AlphaNumeric," +
                    "Include atleast one Special character," +
                    " and 8 characters at least"),
    INCOMPLETE_FIELDS("Incomplete details for registeration");
    String message;
    ErrorMessages(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }



}
