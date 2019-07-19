/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects;

import application.dataobjects.interfaces.IAssetKeyStore;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Class representing a key store for assets. Implements IAssetKeyStore.
 *
 * @author Oge Tasie
 */
public class AssetKeyStore implements IAssetKeyStore
{

    /**
     * An array containing asset file paths.
     */
    private final File[] RESOURCE_FILES;

    /**
     * The type of assets stored in this key store.
     */
    private final String RESOURCE_TYPE;

    /**
     * The type of file extension the assets in this key store have.
     */
    private final String FILE_EXTENSION;

    /**
     * Privately creates a new instance of an asset key store.
     *
     * @param directory     The root directory of the files to generate keys
     *                      for.
     * @param type          The type of resource this asset key store will
     *                      contain.
     * @param fileExtension The file extension of the resources this asset key
     *                      store will contain.
     */
    private AssetKeyStore( String directory, String resourceType, String fileExtension )
    {
        RESOURCE_TYPE = resourceType;
        FILE_EXTENSION = fileExtension;
        RESOURCE_FILES = generateResourceKeys( directory, resourceType, fileExtension );
    }

    /**
     * Creates a new asset key store.
     *
     * @param directory     The root directory of the files to generate keys
     *                      for.
     * @param type          The type of resource this asset key store will
     *                      contain.
     * @param fileExtension The file extension of the resources this asset key
     *                      store will contain.
     *
     * @return A new instance of an asset key store.
     */
    public static AssetKeyStore create( String directory, Enum type, FileExtensionType fileExtension )
    {
        return new AssetKeyStore( directory, type.name(), fileExtension.name() );
    }

    /**
     * Searches the specified file directory for resource files and stores their
     * paths.
     *
     * @param directory     The specified root directory to search.
     * @param type          The name of the folder in the root directory
     *                      corresponding to the type of assets.
     * @param fileExtension The file extensions to specifically search for.
     *
     * @return A file array containing the file paths to the assets.
     */
    private File[] generateResourceKeys( String directory, String type, String fileExtension )
    {
        Path path = FileSystems.getDefault().getPath( directory + type );
        return path.toFile().listFiles( ( File resourceKey, String name ) -> name.toLowerCase().endsWith( fileExtension ) && new File( resourceKey, name ).isFile() );
    }

    @Override
    public FileExtensionType getFileExtensionType()
    {
        return FileExtensionType.valueOf( FILE_EXTENSION );
    }

    @Override
    public String getResourceType()
    {
        return RESOURCE_TYPE;
    }

    @Override
    public String[] getResourceKeys()
    {
        String[] resourceKeys;

        resourceKeys = null;
        if ( RESOURCE_FILES.length > 0 )
        {
            resourceKeys = new String[ RESOURCE_FILES.length ];
            for ( int i = 0; i < RESOURCE_FILES.length; i++ )
            {
                resourceKeys[ i ] = RESOURCE_FILES[ i ].getName();
            }
        }
        else
        {
            throw new NullPointerException( "The asset file location contains no files." );
        }

        return resourceKeys;
    }

}
