package Activities;

public class Activity8 {
    public static String exceptionTest(String name) throws CustomException {
        if(name==null)
            throw new CustomException("String is null");
        else
            return name;
    }

    public static void main(String[] args) throws CustomException {
        Activity8.exceptionTest("Will print to console");
        Activity8.exceptionTest(null);
    }
}
