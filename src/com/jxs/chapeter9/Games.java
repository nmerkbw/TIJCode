package com.jxs.chapeter9;

/**
 * Created by jiangxs on 2018/4/4.
 */
interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    @Override
    public boolean move() {
        return false;
    }
}
public class Games {
}
