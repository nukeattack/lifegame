package com.poison.zmeika.game.model;

import com.poison.zmeika.engine.geometry.Vec2f;
import com.poison.zmeika.engine.geometry.Vec2i;

/**
 * Created by Stas on 12/3/2015.
 */
public class CellModel {
    private Vec2i pos;

    public CellModel(int x, int y){
        pos = new Vec2i(x,y);
    }

    public Vec2i getPos() {
        return pos;
    }
}
