/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data;

import application.data.abstracts.AbstractFileData;
import java.io.Serializable;

/**
 * Class representing sprite file data. Extends {@code AbstractFileData} and can
 * be serialized.
 *
 * @author Oge Tasie
 */
public class SpriteFileData extends AbstractFileData<SpriteFileData> implements Serializable
{

    private static final long serialVersionUID = 1L;

    /**
     * The sprite dimension data.
     */
    private final SpriteDimension SPRITE_DIMENSION;

    /**
     * Privately creates sprite file data.
     *
     * @param fileName  The file name of this data.
     * @param path      The path location of the file data.
     * @param dimension The sprite dimension data.
     */
    private SpriteFileData( String fileName, String path, SpriteDimension dimension )
    {
        super( fileName, path );
        SPRITE_DIMENSION = dimension;
    }

    /**
     * Creates sprite file data.
     *
     * @param fileName  The file name of this data.
     * @param path      The path location of the data file.
     * @param dimension The sprite dimension data.
     *
     * @return A data object as {@code SpriteFileData}.
     */
    public static SpriteFileData create( String fileName, String path, SpriteDimension dimension )
    {
        return new SpriteFileData( fileName, path, dimension );
    }

    /**
     * The sprite dimension data associated with this file data.
     *
     * @return The pixel width and pixel height of a sprite image as a
     *         {@code SpriteDimension} object.
     */
    public SpriteDimension getDimension()
    {
        return SPRITE_DIMENSION;
    }

}
