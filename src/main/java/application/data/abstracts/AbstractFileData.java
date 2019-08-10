/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data.abstracts;

import application.data.interfaces.IData;

/**
 * Abstract class for creating file data objects. Implements {@code IData}.
 *
 * @author Oge Tasie
 * @param <D> The type of file data class. extends {@code AbstractFileData}.
 */
public abstract class AbstractFileData<D extends AbstractFileData<? super D>> implements IData<D>
{

    /**
     * The file name used to identify this file data.
     */
    protected final String FILE_NAME;

    /**
     * The package location of the data file.
     */
    protected final String PATH;

    /**
     * Default constructor for creating a file data object.
     *
     * @param fileName Value of the key used to query for this file data.
     * @param path     Value of the package location of the data file.
     */
    protected AbstractFileData( String fileName, String path )
    {
        FILE_NAME = fileName;
        PATH = path;
    }

    @Override
    public String getFileName()
    {
        return FILE_NAME;
    }

    @Override
    public String getPath()
    {
        return PATH;
    }

}
