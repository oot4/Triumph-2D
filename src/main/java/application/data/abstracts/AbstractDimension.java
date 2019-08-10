/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data.abstracts;

import application.data.interfaces.IDimension;

/**
 * Abstract class representing a dimension. Implements
 * {@code AbstractDimension}.
 *
 * @author Oge Tasie
 * @param <D> The type of dimension to produce from this
 *            {@code AbstractDimension}. Extends {@code AbstractDimension}.
 */
public abstract class AbstractDimension<D extends AbstractDimension<? super D>> implements IDimension<D>
{

    /**
     * The pixel width of this dimension.
     */
    private int width;

    /**
     * The pixel height of this dimension.
     */
    private int height;

    /**
     * The scale by which the pixel width and height values of this dimension
     * are modified.
     */
    private double scale;

    /**
     * Default constructor for creating new dimensions.
     *
     * @param width  The pixel width of the dimension before applying a scale
     *               factor.
     * @param height The pixel height of the dimension before applying a scale
     *               factor.
     * @param scale  The scaling value applied to the pixel width and height
     *               values of this dimension.
     */
    protected AbstractDimension( int width, int height, double scale )
    {
        this.width = width;
        this.height = height;
        this.scale = scale;
    }

    /**
     * The pixel width of this dimension.
     *
     * @return The pixel width as an {@code Integer}.
     */
    protected int Width()
    {
        return width;
    }

    /**
     * The pixel height of this dimension.
     *
     * @return The pixel height as an {@code Integer}.
     */
    protected int Height()
    {
        return height;
    }

    /**
     * The pixel scale of this dimension.
     *
     * @return The pixel scale as a {@code Double}.
     */
    protected double Scale()
    {
        return scale;
    }

    @Override
    public double getWidth()
    {
        return Width() * Scale();
    }

    @Override
    public double getHeight()
    {
        return Height() * Scale();
    }

    @Override
    public void setSize( int width, int height )
    {
        this.width = width;
        this.height = height;
    }

    /**
     * Sets the scale of this dimension to the specified value.
     *
     * @param scale The new scale value of this dimension.
     */
    public void setScale( double scale )
    {
        this.scale = scale;
    }

    @Override
    public void setSize( D dimension )
    {
        setSize( dimension.Width(), dimension.Height() );
        setScale( dimension.Scale() );
    }

}
