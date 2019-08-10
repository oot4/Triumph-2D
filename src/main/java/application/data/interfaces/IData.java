/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data.interfaces;

/**
 * An interface for a data object.
 *
 * @author Oge Tasie
 * @param <D> The type of data class or object. Extends {@code IData}.
 */
public interface IData<D extends IData<? super D>>
{

    /**
     * The file name used to identify this data object.
     *
     * @return A file name value as a {@code String}.
     */
    String getFileName();

    /**
     * The final and absolute path to the location, on disk, the data is stored.
     *
     * @return An absolute path as a {@code String}.
     */
    String getPath();

}
