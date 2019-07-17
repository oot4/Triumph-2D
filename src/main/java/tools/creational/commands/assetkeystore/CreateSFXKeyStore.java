/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package tools.creational.commands.assetkeystore;

import application.dataobjects.AssetKeyStore;
import application.dataobjects.FileExtensionType;
import application.dataobjects.SoundObject;
import application.dataobjects.SoundObjectType;
import tools.creational.commands.interfaces.ICreateAssetKeyStore;

/**
 * Creates an asset key store for sound effects.
 *
 * @author Oge Tasie
 */
public class CreateSFXKeyStore implements ICreateAssetKeyStore
{

    @Override
    public AssetKeyStore create()
    {
        return AssetKeyStore.create( SoundObject.SOUND_DIR, SoundObjectType.sfx.name(), FileExtensionType.wav );
    }

}
