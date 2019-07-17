/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package tools.creational.commands.assetkeystore;

import application.dataobjects.AssetKeyStore;
import application.dataobjects.FileExtensionType;
import application.dataobjects.SpriteObject;
import application.dataobjects.SpriteObjectType;
import tools.creational.commands.interfaces.ICreateAssetKeyStore;

/**
 * Creates an asset key store for characters.
 *
 * @author Oge Tasie
 */
public class CreateCharacterKeyStore implements ICreateAssetKeyStore
{

    @Override
    public AssetKeyStore create()
    {
        return AssetKeyStore.create( SpriteObject.SPRITE_DIR, SpriteObjectType.characters.name(), FileExtensionType.gif );
    }

}
