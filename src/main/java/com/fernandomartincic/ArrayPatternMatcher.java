package com.fernandomartincic;

import com.fernandomartincic.pattern.PatternMatcher;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by fernando on 5/30/16.
 */

@Slf4j
@Getter
public class ArrayPatternMatcher implements PatternMatcher {
    private final int width;
    private final int height;
    private final int[][] pattern;

    public ArrayPatternMatcher(@NonNull final int width,
                               @NonNull final int height,
                               @NonNull final String patternString) {
        this.width = width;
        this.height = height;

        pattern = new int[width][height];

        int x = 0;
        int y = 0;
        for (int t = 0; t < patternString.length(); t++) {
            if (patternString.charAt(t) == 'x') {
                // match
                pattern[x][y] = 1;
            } else {
                // no match
                pattern[x][y] = 0;
            }

            // adjust counters
            if (++x == width) {
                x = 0;
                y++;
            }
        }
    }

    @Override
    public boolean matches(final int[][] grid,
                           final int x,
                           final int y) {
        log.debug("grid.length={}, grid[0].length={}, x={}, y={}", grid.length, grid[0].length, x, y);

        // check size
        if (grid.length - y < height || grid[0].length - x < width) {
            return false;
        }

        // cycle through pattern
        for (int yy = 0; yy < height; yy++) {
            for (int xx = 0; xx < width; xx++) {

            }
        }

        return true;
    }

}
