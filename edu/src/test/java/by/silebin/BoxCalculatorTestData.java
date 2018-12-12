package by.silebin;

import by.silebin.entity.Box;
import by.silebin.entity.Dot;
import com.sun.org.apache.xpath.internal.operations.String;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.testng.annotations.DataProvider;;

import java.util.ArrayList;
import java.util.List;

public class BoxCalculatorTestData {

    @DataProvider(name = "validStringData")
    public static Object[][] validStringData() {
        return new Object[][]{
                {"0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23", true},
                {"123", false}
        };
    }

    @DataProvider(name = "isBoxData")
    public static Object[][] isBoxData() {
        return new Object[][]{
                {new Box(new Dot(0,2,-2),
                        new Dot(2,2,-2),
                        new Dot(2,2,0),
                        new Dot(0,2,0),
                        new Dot(0,0,-2),
                        new Dot(2,0,-2),
                        new Dot(2,0,0),
                        new Dot(0,0,0))}
        };
    }

    @DataProvider(name = "countVolumeData")
    public static Object[][] countVolumeData() {
        return new Object[][]{
                {new Box(new Dot(0,2,-2),
                        new Dot(2,2,-2),
                        new Dot(2,2,0),
                        new Dot(0,2,0),
                        new Dot(0,0,-2),
                        new Dot(2,0,-2),
                        new Dot(2,0,0),
                        new Dot(0,0,0)), 8}
        };
    }
    @DataProvider(name = "countAreaData")
    public static Object[][] countAreaData() {
        return new Object[][]{
                {new Box(new Dot(0,2,-2),
                        new Dot(2,2,-2),
                        new Dot(2,2,0),
                        new Dot(0,2,0),
                        new Dot(0,0,-2),
                        new Dot(2,0,-2),
                        new Dot(2,0,0),
                        new Dot(0,0,0)), 24}
        };
    }

    @DataProvider(name = "InitializeData")
    public static Object[][] InitializeData() {
        return new Object[][]{

        };
    }

    @DataProvider(name = "parseInfoData")
    public static Object[][] parseInfoData() {
        return new Object[][]{
                {new ArrayList<String>(),"sdhfj"}
        };
    }
}
