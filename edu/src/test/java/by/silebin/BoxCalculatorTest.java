package by.silebin;

import by.silebin.entity.Box;
import by.silebin.entity.Dot;
import org.testng.Assert;
import org.testng.annotations.*;
import by.silebin.action.BoxCalculatorImpl;

import java.util.ArrayList;
import java.util.List;

public class BoxCalculatorTest {

    private BoxCalculatorImpl boxCalc;

    @BeforeClass
    public void setUp(){
        boxCalc = BoxCalculatorImpl.getInstance();
    }


    private List<String> setListOfStrings(){
        List<String> expectedList = new ArrayList<String>(){
            {
                add("1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3 1 2 3");
            }
        };
        return expectedList;
    }

    private List<Box> setListOfBoxes(){
        List<Box> expectedBoxes = new ArrayList<Box>(){
            {
                add(new Box(new Dot(1,2,3),
                        new Dot(1,2,3),
                        new Dot(1,2,3),
                        new Dot(1,2,3),
                        new Dot(1,2,3),
                        new Dot(1,2,3),
                        new Dot(1,2,3),
                        new Dot(1,2,3)));
            }
        };
        return expectedBoxes;
    }


    @Test(dataProvider = "validStringData" , dataProviderClass = BoxCalculatorTestData.class)
    public void testValidString(String coordinates, boolean expected){
        boolean matches = boxCalc.validString(coordinates);
        Assert.assertEquals(matches, expected);
    }

    @Test(dataProvider = "isBoxData" , dataProviderClass = BoxCalculatorTestData.class)
    public void testIsBox(Box box){
        Box boxToTest = box;
        boolean answer = boxCalc.isBox(boxToTest);
        Assert.assertTrue(answer);
    }

    @Test(dataProvider = "countVolumeData" , dataProviderClass = BoxCalculatorTestData.class)
    public void testCountVolume(Box box, double expectedVolume){
        Box boxToTest = box;
        double volume = boxCalc.countVolume(boxToTest);
        Assert.assertEquals(volume, expectedVolume);
    }

    @Test(dataProvider = "countAreaData" , dataProviderClass = BoxCalculatorTestData.class)
    public void testCountArea(Box box, double expectedArea){
        Box boxToTest = box;
        double area = boxCalc.countArea(box);
        Assert.assertEquals(area, expectedArea);
    }

    @Test
    public void testInitialize(){
        String path = "./test.txt";
        List<Box> expectedBoxes = setListOfBoxes();
        List<Box> boxes = boxCalc.initialize(path);
        Assert.assertEquals(boxes, expectedBoxes);
    }

    @Test
    public void testParseInfo(){
        String path = "./test.txt";
        List<String> expectedList = setListOfStrings();
        List<String> parsedInfo = boxCalc.parseInfo(path);
        Assert.assertEquals(expectedList, parsedInfo);
    }
}
