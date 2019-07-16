/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects.abstracts;

import application.dataobjects.interfaces.IDimensions;

/**
 * Abstract class for dimensional data.
 *
 * @author Oge Tasie
 */
public abstract class AbstractDimensions implements IDimensions
{

    /**
     * A width dimension.
     */
    private final int WIDTH;
    /**
     * A height dimension.
     */
    private final int HEIGHT;
    /**
     * A scale dimension. Is applied to a width and height.
     */
    private final int SCALE;

    /**
     * Default constructor for creating new dimensional data.
     *
     * @param width  A raw width value before scaling.
     * @param height A raw height value before scaling.
     * @param scale  A scaling factor.
     */
    public AbstractDimensions( int width, int height, int scale )
    {
        WIDTH = width;
        HEIGHT = height;
        SCALE = scale;
    }

    @Override
    public int getFinalWidth()
    {
        return WIDTH * SCALE;
    }

    @Override
    public int getFinalHeight()
    {
        return HEIGHT * SCALE;
    }
}
