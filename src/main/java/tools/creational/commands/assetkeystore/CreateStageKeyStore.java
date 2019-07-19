/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package tools.creational.commands.assetkeystore;

import application.dataobjects.AssetKeyStore;
import application.dataobjects.FileExtensionType;
import application.dataobjects.SpriteDataObject;
import application.dataobjects.SpriteObjectType;
import tools.creational.commands.interfaces.ICreate;

/**
 * Creates an asset key store for stages.
 *
 * @author Oge Tasie
 */
public class CreateStageKeyStore implements ICreate
{

    @Override
    public AssetKeyStore execute()
    {
        return AssetKeyStore.create(SpriteDataObject.SPRITE_DIR, SpriteObjectType.stages, FileExtensionType.gif );
    }

}
