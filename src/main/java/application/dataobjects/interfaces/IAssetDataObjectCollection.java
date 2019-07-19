/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects.interfaces;

/**
 * Interface for a collection of asset data objects. Is creatable from a
 * creational command tool that implements ICreate.
 *
 * @author Oge Tasie
 */
public interface IAssetDataObjectCollection extends ICreationToolCreatable
{

    /**
     * The asset data object associated with the specified key.
     *
     * @param key A key value used to identify the asset data object.
     *
     * @return An object that implements the asset data object interface.
     */
    IAssetDataObject getAssetDataObjectByKey( String key );

}
