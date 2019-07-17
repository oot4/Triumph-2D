/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects.interfaces;

/**
 * Interface for dimensional data objects.
 *
 * @author Oge Tasie
 */
public interface IDimensionGroup
{

    /**
     * The dimensional width after applying a scale factor.
     *
     * @return A width dimension as an integer.
     */
    int getFinalWidth();

    /**
     * The dimensional height after applying a scale factor
     *
     * @return A height dimension as an integer;
     */
    int getFinalHeight();

}
