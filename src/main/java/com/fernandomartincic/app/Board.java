package com.fernandomartincic.app;

import com.fernandomartincic.ArrayPatternMatcher;

/**
 * Created by fernando on 5/30/16.
 */
public class Board {

    final int width;
    final int height;

    final int[][] board;


    /**
     * Overloaded constructor.
     *
     * @param width  board width.
     * @param height board height.
     */
    public Board(final int width, final int height) {
        this.width = width;
        this.height = height;

        board = new int[width][height];

    }

    public boolean matches(int x, int y, ArrayPatternMatcher pattern) {
        return false;
    }


}
