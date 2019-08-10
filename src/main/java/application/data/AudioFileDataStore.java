/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data;

import application.data.abstracts.AbstractFileDataStore;
import application.data.abstracts.AbstractFileNameGenerator;
import application.data.conclave.AudioConclave;
import application.data.conclave.PathAnnexConclave;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Class representing a storage for audio file data. Extends
 * {@code AbstractFileDataStore} and can be serialized.
 *
 * @author Oge Tasie
 *
 */
public final class AudioFileDataStore extends AbstractFileDataStore<AudioFileData> implements Serializable
{

    private static final long serialVersionUID = 1L;

    /**
     * Privately creates a storage for audio file data.
     */
    private AudioFileDataStore()
    {
        super( new HashMap<String, AudioFileData>() );
    }

    /**
     * Creates a storage for audio file data.
     *
     * @param generator An {@code AbstractFileNameGenerator} object for
     *                  generating file names.
     *
     * @return Audio file data storage object as {@code AudioFileDataStore}.
     */
    public static AudioFileDataStore create( AbstractFileNameGenerator<AudioConclave, PathAnnexConclave> generator )
    {
        AudioFileDataStore store = new AudioFileDataStore();
        store.DATA.putAll( store.populate( generator ) );
        return store;
    }

    @Override
    protected HashMap<String, AudioFileData> populate( AbstractFileNameGenerator<?, ?> generator )
    {
        HashMap<String, AudioFileData> data = new HashMap<>();
        String[] fileNames = generator.getFileNames();
        String conclaveType = generator.getConclaveType().name();
        String fileExtension = generator.getFileExtensionType().name();
        for ( String fileName : fileNames )
        {
            String key = fileName.split( "." + fileExtension, 2 )[ 0 ];
            String path = "/assets/audio/" + conclaveType + "/" + fileName;
            AudioFileData value = AudioFileData.create( fileName, path );
            data.put( key, value );
        }
        return data;
    }

}
