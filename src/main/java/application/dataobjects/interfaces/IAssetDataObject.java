/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects.interfaces;

/**
 * Interface for an asset object and its data.
 *
 * @author Oge Tasie
 */
public interface IAssetDataObject
{

    /**
     * The asset key value.
     *
     * @return A key value as a string.
     */
    String getKey();

    /**
     * The location path on disk associated with the asset.
     *
     * @return A location path as a string.
     */
    String getPath();

}
