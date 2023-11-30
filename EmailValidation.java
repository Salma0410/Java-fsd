import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    private static final String EMAIL_PATTERN =
       "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"    ;

    private final Pattern pattern;
    private Matcher matcher;

    public EmailValidation() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean validate(final String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        EmailValidation validator = new EmailValidation();

        // Test email addresses
        String[] emails = {
            "salmaa04@example.com",
            "sabi1407@gmail.com",
            "salma@saleem-tld",
            "Arfan@.Arfu-tld",
            "rizwan@.com",
            "mubeena@.co.in"
        };

        for (String email : emails) {
            System.out.println(email + " is valid? " + validator.validate(email));
        }
    }
}