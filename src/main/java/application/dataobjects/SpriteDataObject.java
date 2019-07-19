/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects;

import application.dataobjects.interfaces.IAssetDataObject;
import java.io.Serializable;

/**
 * Class representing a sprite data object. Implements IAssetDataObject and can be
 * serialized.
 *
 * @author Oge Tasie
 */
public class SpriteDataObject implements Serializable, IAssetDataObject
{

    /**
     * The key value of the sprite data object.
     */
    private final String KEY;

    /**
     * The path location of the sprite data object.
     */
    private final String PATH;

    /**
     * The dimensions associated with this data object.
     */
    private final SpriteDimensionGroup DIMENSIONS;

    /**
     * The path to the root location of sprite resources.
     */
    public static final String SPRITE_DIR = "src/main/java/assets/sprites/";

    /**
     * Privately creates a new sprite object instance.
     *
     * @param key        A key value as a string. Should be the name of the
     *                   asset file.
     * @param path       A path location pointing to the sprite object on disk
     *                   as a string.
     * @param dimensions A data object containing the dimensions used for
     *                   finding sub-images on a sprite-sheet.
     */
    private SpriteDataObject( String key, String path, SpriteDimensionGroup dimensions )
    {
        KEY = key;
        PATH = path;
        DIMENSIONS = dimensions;
    }

    /**
     * Creates a new sprite data object.
     *
     * @param key        A key value as a string. Should be the name of the
     *                   asset file.
     * @param type       What type of sound are you creating?
     * @param dimensions A data object containing dimensional data for the
     *                   sprite-sheet.
     *
     * @return A new instance of a sprite data object.
     */
    public static SpriteDataObject create( String key, SpriteObjectType type, SpriteDimensionGroup dimensions )
    {
        final String path;
        String subPath;

        subPath = type.toString() + "/" + key;
        path = "/assets/sprites/" + subPath;

        return new SpriteDataObject( key, path, dimensions );
    }

    /**
     * A data object containing the dimensions of this sprite data object.
     *
     * @return Width and height as SpriteDimensionGroup.
     */
    public SpriteDimensionGroup getDimensions()
    {
        return DIMENSIONS;
    }

    @Override
    public String getKey()
    {
        return KEY;
    }

    @Override
    public String getPath()
    {
        return PATH;
    }

}
