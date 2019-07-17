/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects;

import application.dataobjects.abstracts.AbstractDimensionGroup;

/**
 * Class representing the dimensions for images on a sprite-sheet.
 *
 * @author Oge Tasie
 */
public class SpriteDimensionGroup extends AbstractDimensionGroup
{

    /**
     * Creates a new instance of dimensional data for images on a sprite-sheet.
     *
     * @param width  Width of an image on a sprite-sheet.
     * @param height Height of a image on a sprite-sheet
     * @param scale  Scaling factor to apply to an image on a sprite-sheet.
     */
    public SpriteDimensionGroup( int width, int height, int scale )
    {
        super( width, height, scale );
    }

}
