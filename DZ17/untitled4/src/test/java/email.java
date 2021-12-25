import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class email{
    public void ramdomEmail() {
        String generatedstring = RandomStringUtils.randomAlphabetic(6);
        String email = generatedstring + "@gmail.com";
    }
};

