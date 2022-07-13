import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonAge {
    private static Logger logger = Logger.getLogger(PersonAge.class.getName());
    static void validate(int age) throws InvalidAgeException{
        if (age < 15) {
            throw new InvalidAgeException("The person is not old enough to drink alcohol");
        } else {
            System.out.println("The person is allowed to purchase alcohol drinks");
        }
    }

    static void checkCountry(String country) throws InvalidCountryException{
        if (country == "Bosnia and Herzegovina"){
            throw new InvalidCountryException("In this country you are not allowed to drink before 18");
        } else {
            System.out.println("Here, you are free to consume alcohol before 18");
        }
    }

    public static void main(String[] args){
        try {
            checkCountry("Bosnia and Herzegovina");
            validate(14);
        } catch (InvalidAgeException | InvalidCountryException ex){
            logger.log(Level.WARNING, "Exception happened: " + ex.getMessage());
        }
    }
}


