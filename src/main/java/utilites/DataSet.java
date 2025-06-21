package utilites;

import org.testng.annotations.DataProvider;

public class DataSet {


    @DataProvider(name="InvalidCredentials")
    public static Object invalidCredentials() {
        Object[][] data = {
                {"Sidd1122", "Password", "Incorrect username or password entered. Please try again."},
                {"Username", "automation123", "Incorrect username or password entered. Please try again."},
                {"Username", "Password", "Incorrect username or password entered. Please try again."}
        };
        return data;
    }

}


