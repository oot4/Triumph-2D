/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package tools.creational.commands.interfaces;

import application.dataobjects.AssetKeyStore;

/**
 * Interface for a command that creates an asset key store.
 *
 * @author Oge Tasie
 */
public interface ICreateAssetKeyStore
{

    /**
     * Command that creates an asset key store.
     *
     * @return An asset key store.
     */
    AssetKeyStore create();

}
