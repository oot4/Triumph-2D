/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data;

import application.data.abstracts.AbstractDimension;
import java.io.Serializable;

/**
 * Class representing the dimensions for images on a sprite-sheet. Extends
 * {@code AbstractDimension} and can be serialized.
 *
 * @author Oge Tasie
 */
@SuppressWarnings( "serial" )
public class SpriteDimension extends AbstractDimension<SpriteDimension> implements Serializable
{

    /**
     * Creates a new instance of a dimension for images on a sprite-sheet.
     *
     * @param width  Width of an image on a sprite-sheet.
     * @param height Height of an image on a sprite-sheet.
     * @param scale  Scaling factor to apply to an image on a sprite-sheet.
     */
    public SpriteDimension( int width, int height, int scale )
    {
        super( width, height, scale );
    }

}
