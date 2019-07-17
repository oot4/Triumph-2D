/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects;

import application.dataobjects.interfaces.IAssetDataObject;
import application.dataobjects.interfaces.IAssetDataObjectCollection;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Class representing a collection of asset data objects.
 *
 * @author Oge Tasie
 */
public class AssetCollection implements Serializable, IAssetDataObjectCollection
{

    /**
     * Stores asset data objects with key-value pairs.
     */
    private final HashMap<String, IAssetDataObject> ASSETS;

    /**
     * Privately creates a new asset collection instance.
     *
     * @param assets A collection of assets as a hash map.
     */
    private AssetCollection( HashMap<String, IAssetDataObject> assets )
    {
        ASSETS = assets;
    }

    /**
     * Creates a new asset collection object.
     *
     * @param assets A collection of assets as a hash map.
     *
     * @return A new instance of an asset collection.
     */
    public static AssetCollection create( HashMap<String, IAssetDataObject> assets )
    {
        return new AssetCollection( assets );
    }

    @Override
    public IAssetDataObject getAssetDataObjectByKey( String key )
    {
        return ASSETS.get( key );
    }

}
