/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data.interfaces;

/**
 * Interface for a set of values representing the measurements of a visual
 * object or image.
 *
 * @author Oge Tasie
 * @param <D> The type of dimension class. Extends {@code IDimension}.
 */
public interface IDimension<D extends IDimension<? super D>>
{

    /**
     * The width of this dimension in pixels.
     *
     * @return A value corresponding to the pixel width of this dimension as an
     *         {@code Double}.
     */
    double getWidth();

    /**
     * The height of this dimension in pixels.
     *
     * @return A value corresponding to the height of this dimension as an
     *         {@code Double}.
     */
    double getHeight();

    /**
     * Sets the size of this dimension to the specified width and height in
     * pixels.
     *
     * @param width  The new width for the dimension.
     * @param height The new height for the dimension.
     */
    void setSize( int width, int height );

    /**
     * Sets the size of this dimension to match the size of the element
     * specified.
     *
     * @param dimension The element containing the new size of this dimension.
     */
    void setSize( D dimension );

}
