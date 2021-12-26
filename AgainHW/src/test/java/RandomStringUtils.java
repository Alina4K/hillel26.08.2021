import java.util.Random;


public class RandomStringUtils {
    public static String randomAlphabetic(int i) {


        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 6;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);
        return generatedString;


    }

    public class sss {
        static String[] email_domains = new String[] {"gmail.com","mail.ru"};
        static Random random = new Random();
        public static String randomDomain(){
            int randomIndex = random.nextInt(email_domains.length);
            return email_domains[randomIndex];
        }
    }
    }


