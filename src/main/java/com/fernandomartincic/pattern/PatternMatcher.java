package com.fernandomartincic.pattern;

/**
 * Created by fernando on 5/30/16.
 */
public interface PatternMatcher {
    /**
     * Determines if the given sub-grid matches the pattern.
     *
     * @param grid master grid
     * @param x    starting x coordinate
     * @param y    starting y coordinate
     * @return true if pattern patches; false otherwise
     */
    boolean matches(int[][] grid, int x, int y);
}
