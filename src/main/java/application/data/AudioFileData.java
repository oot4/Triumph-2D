/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data;

import application.data.abstracts.AbstractFileData;
import java.io.Serializable;

/**
 * Class representing audio file data. Extends {@code AbstractFileData} and can
 * be serialized.
 *
 * @author Oge Tasie
 */
public class AudioFileData extends AbstractFileData<AudioFileData> implements Serializable
{

    private static final long serialVersionUID = 1L;

    /**
     * Privately creates audio file data.
     *
     * @param fileName The file name of this data.
     * @param path     The path location of the file data.
     */
    private AudioFileData( String fileName, String path )
    {
        super( fileName, path );
    }

    /**
     * Creates audio file data.
     *
     * @param fileName The file name of this data.
     * @param path     The path location of the data file.
     *
     * @return A data object as {@code AudioFileData}.
     */
    public static AudioFileData create( String fileName, String path )
    {
        return new AudioFileData( fileName, path );
    }

}
