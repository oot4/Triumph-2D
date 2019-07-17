/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects.interfaces;

import java.io.File;

/**
 * Interface for an asset key store.
 *
 * @author Oge Tasie
 */
public interface IAssetKeyStore
{

    /**
     * Returns the resource names located at the resource path location.
     *
     * @return Resource key names as a file array.
     */
    File[] getResourceKeys();

    /**
     * Returns the type of the resources the keys are associated with.
     *
     * @return A resource type as a String. These correspond to the sprite and
     *         sound object types.
     */
    String getResourceType();
}
