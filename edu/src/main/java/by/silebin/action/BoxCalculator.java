package by.silebin.action;

import by.silebin.entity.Box;

public interface BoxCalculator {
    double countVolume(Box box);
    double countArea(Box box);
    boolean isBox(Box box);
}
