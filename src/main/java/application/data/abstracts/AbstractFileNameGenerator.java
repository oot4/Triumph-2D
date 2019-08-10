/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data.abstracts;

import application.data.conclave.PathAnnexConclave;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import application.data.interfaces.IFileNameGenerator;

/**
 * Abstract class representing a file name generator. Implements
 * {@code IFileNameGenerator}.
 *
 * @author Oge Tasie
 * @param <C> The type of package location conclave file names will be generated
 *            for. Extends {@code Enum}.
 * @param <E> The type of file extension file names will be generated for.
 *            Extends {@code PathAnnexConclave} enum type subclass.
 */
public abstract class AbstractFileNameGenerator<C extends Enum<C>, E extends Enum<PathAnnexConclave>> implements IFileNameGenerator<C, E>
{

    /**
     * The list of files to generate file names for.
     */
    protected final Path FINAL_PATH;

    /**
     * The type of conclave package location constant to generate file names
     * for.
     */
    protected final C CONCLAVE_TYPE;

    /**
     * The type of file extension to match against when searching the conclave
     * package location for files.
     */
    protected final E FILE_EXTENSION;

    /**
     * Default constructor for creating an instance of a file names generator.
     *
     * @param root      The root directory location of the files to generate
     *                  file names for.
     * @param conclave  The type of conclave package location constant to
     *                  generate file names for.
     * @param extension The type of file extension to match against when
     *                  searching the conclave package location for files.
     */
    protected AbstractFileNameGenerator( String root, C conclave, E extension )
    {
        CONCLAVE_TYPE = conclave;
        FILE_EXTENSION = extension;
        FINAL_PATH = FileSystems.getDefault().getPath( root + conclave.name() );
    }

    /**
     * Generates a list of files from the files located in the conclave package
     * location.
     *
     * @param path      The path to search for files matching the specified
     *                  extension.
     * @param extension The file extension to match against when searching the
     *                  specified path for files.
     *
     * @return A list of files at the specified path as a {@code File} array.
     */
    private File[] generateFiles( Path path, E extension )
    {
        File file = path.toFile();
        FilenameFilter filter = ( File dir, String name ) -> name.toLowerCase().endsWith( extension.name() ) && new File( dir, name ).isFile();
        return file.listFiles( filter );
    }

    @Override
    public E getFileExtensionType()
    {
        return FILE_EXTENSION;
    }

    @Override
    public C getConclaveType()
    {
        return CONCLAVE_TYPE;
    }

    @Override
    public String[] getFileNames()
    {
        String[] fileNames = null;

        try
        {
            File[] files = generateFiles( FINAL_PATH, FILE_EXTENSION );
            fileNames = new String[ files.length ];
            for ( int i = 0; i < files.length; i++ )
            {
                //TODO Display message on gamelog.
                System.out.println( "Storing key -: " + files[ i ].getName() );
                fileNames[ i ] = files[ i ].getName();
            }
        }
        catch ( Exception e )
        {
            System.out.println( "Keys could not be generated." );
        }

        return fileNames;
    }

}
