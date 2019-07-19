/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects.interfaces;

import application.dataobjects.FileExtensionType;

/**
 * Interface for an asset key store to store asset file keys. Is creatable from
 * a creational command tool that implements ICreate.
 *
 * @author Oge Tasie
 */
public interface IAssetKeyStore extends ICreationToolCreatable
{

    /**
     * Returns the type of the resources the keys are associated with.
     *
     * @return A resource type as a string. These correspond to the sprite and
     *         sound object types.
     */
    String getResourceType();

    /**
     * Returns the type of the file extension the resources have.
     *
     * @return A file extension type as an enumerator.
     */
    FileExtensionType getFileExtensionType();

    /**
     * Returns the resource names located at the resource path location.
     *
     * @return Resource key names as a string array.
     */
    String[] getResourceKeys();

}
