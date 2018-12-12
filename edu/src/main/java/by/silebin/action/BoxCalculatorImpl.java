package by.silebin.action;

import by.silebin.entity.Box;
import by.silebin.entity.Dot;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BoxCalculatorImpl implements BoxCalculator {

    private static final String COORDINATES = "^(\\d+(\\.\\d+)?\\s){23}\\d+(\\.\\d+)?";
    private static final String MATCH = "\\s";

    private static BoxCalculatorImpl instance = new BoxCalculatorImpl();

    public static BoxCalculatorImpl getInstance(){
        return instance;
    }

    @Override
    public double countVolume(Box box) {
        Dot a = box.getA();
        Dot b = box.getB();

        double ax = a.getX();
        double bx = b.getX();
        double az = a.getZ();
        double bz = b.getZ();
        double xDiff = Math.abs(ax-bx);
        double zDiff = Math.abs(az-bz);
        double side = Math.sqrt(xDiff * xDiff + zDiff * zDiff);

        return Math.pow(side, 3);
    }

    @Override
    public double countArea(Box box) {
        Dot a = box.getA();
        Dot b = box.getB();
        double ax = a.getX();
        double bx = b.getX();
        double az = a.getZ();
        double bz = b.getZ();
        double xDiff = Math.abs(ax-bx);
        double zDiff = Math.abs(az-bz);
        double side = Math.sqrt(xDiff * xDiff + zDiff * zDiff);
        return 6 * Math.pow(side,2);
    }


    @Override
    public boolean isBox(Box box) {
        Dot a = box.getA();
        Dot b = box.getA();
        Dot c = box.getA();
        Dot d = box.getA();
        Dot e = box.getA();
        Dot f = box.getF();
        Dot g = box.getG();
        Dot h = box.getA();

        double ax = a.getX();
        double ay = a.getY();
        double az = a.getZ();
        double bx = b.getX();
        double bz = b.getZ();
        double cx = c.getX();
        double cy = c.getY();
        double dx = d.getX();
        double dy = d.getY();
        double dz = d.getZ();
        double ex = e.getX();
        double ey = e.getY();
        double hx = h.getX();
        double hy = h.getY();

        double AB = countSide(ax, bx);
        double AD = countSide(az, dz);
        double AE = countSide(ay, ey);
        double DC = countSide(dx, cx);
        double DH = countSide(dy, hy);

        return (Math.pow(AB,2)+ Math.pow(AD,2) + Math.pow(AE,2))==(Math.pow(DC,2) + Math.pow(DH,2) + Math.pow(AD,2));
    }

    private double countSide(double ax, double bx) {

        return Math.abs(ax-bx);
    }

    public List<String> parseInfo(String path){

        List<String> validStrings = new ArrayList<>();

        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            if(validString(line)){
                validStrings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return validStrings;
    }

    public boolean validString(String coordinates){

        return coordinates.matches(COORDINATES);
    }

    public List<Box> initialize(String path){
        List<Box> boxes = new ArrayList<Box>();
        List<String> coordinates = parseInfo(path);
        String[] splitStringCoordinate;
        Double[] splitDoubleCoordinate = new Double[24];

        for(String s : coordinates) {
            splitStringCoordinate = s.split(MATCH);
            for(int i = 0; i < splitStringCoordinate.length; i++){
                splitDoubleCoordinate[i] = Double.parseDouble(splitStringCoordinate[i]);
            }

            Box box = new Box(new Dot(splitDoubleCoordinate[0],splitDoubleCoordinate[1],splitDoubleCoordinate[2]),
                    new Dot(splitDoubleCoordinate[3],splitDoubleCoordinate[4],splitDoubleCoordinate[5]),
                    new Dot(splitDoubleCoordinate[6],splitDoubleCoordinate[7],splitDoubleCoordinate[8]),
                    new Dot(splitDoubleCoordinate[9],splitDoubleCoordinate[10],splitDoubleCoordinate[11]),
                    new Dot(splitDoubleCoordinate[12],splitDoubleCoordinate[13],splitDoubleCoordinate[14]),
                    new Dot(splitDoubleCoordinate[15],splitDoubleCoordinate[16],splitDoubleCoordinate[17]),
                    new Dot(splitDoubleCoordinate[18],splitDoubleCoordinate[19],splitDoubleCoordinate[20]),
                    new Dot(splitDoubleCoordinate[21],splitDoubleCoordinate[22],splitDoubleCoordinate[23]));
            boxes.add(box);
        }
        return boxes;
    }
}
