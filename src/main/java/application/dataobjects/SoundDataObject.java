/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects;

import application.dataobjects.interfaces.IAssetDataObject;
import java.io.Serializable;

/**
 * Class representing a sound object. Implements IAssetDataObject and can be
 * serialized.
 *
 * @author Oge Tasie
 */
public class SoundDataObject implements Serializable, IAssetDataObject
{

    /**
     * The key value of the sound data object.
     */
    private final String KEY;

    /**
     * The path location of the sound data object.
     */
    private final String PATH;

    /**
     * The path to the location of sound resources.
     */
    public static final String SOUND_DIR = "src/main/java/assets/sounds/";

    /**
     * Privately creates a new sound data object instance.
     *
     * @param key  A key value as a string. Should be the name of the asset
     *             file.
     * @param path A path location pointing to the sound object on disk as a
     *             string.
     */
    private SoundDataObject( String key, String path )
    {
        KEY = key;
        PATH = path;
    }

    /**
     * Creates a new sound object.
     *
     * @param key  A key value as a string. Should be the name of the asset
     *             file.
     * @param type What type of sound are you creating?
     *
     * @return A new instance of a sound data object.
     */
    public static SoundDataObject create( String key, SoundObjectType type )
    {
        final String path;
        String subPath;

        subPath = type.toString() + "/" + key;
        path = "/assets/sounds/" + subPath;

        return new SoundDataObject( key, path );
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
