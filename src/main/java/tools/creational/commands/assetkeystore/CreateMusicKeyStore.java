/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package tools.creational.commands.assetkeystore;

import application.dataobjects.AssetKeyStore;
import application.dataobjects.FileExtensionType;
import application.dataobjects.SoundDataObject;
import application.dataobjects.SoundObjectType;
import tools.creational.commands.interfaces.ICreate;

/**
 * Creates an asset key store for music.
 *
 * @author Oge Tasie
 */
public class CreateMusicKeyStore implements ICreate
{

    @Override
    public AssetKeyStore execute()
    {
        return AssetKeyStore.create(SoundDataObject.SOUND_DIR, SoundObjectType.music, FileExtensionType.wav );
    }

}
