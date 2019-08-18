/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data;

import application.data.abstracts.AbstractFileDataStore;
import application.data.abstracts.AbstractFileNameGenerator;
import application.data.conclave.PathAnnexConclave;
import application.data.conclave.SpriteConclave;
import application.tools.OBSConverter;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Class representing a storage for sprite file data. Extends
 * {@code AbstractFileDataStore} and can be serialized.
 *
 * @author Oge Tasie
 *
 */
public final class SpriteFileDataStore extends AbstractFileDataStore<SpriteFileData> implements Serializable
{

    private static final long serialVersionUID = 1L;

    /**
     * Privately creates a storage for sprite file data.
     */
    private SpriteFileDataStore()
    {
        super( new HashMap<String, SpriteFileData>() );
    }

    /**
     * Creates a storage for sprite file data.
     *
     * @param generator An {@code AbstractFileNameGenerator} object for
     *                  generating file names.
     *
     * @return Sprite file data storage object as {@code AudioFileDataStore}.
     */
    public static SpriteFileDataStore create( AbstractFileNameGenerator<SpriteConclave, PathAnnexConclave> generator )
    {
        SpriteFileDataStore store = new SpriteFileDataStore();
        store.DATA.putAll( store.populate( generator ) );
        OBSConverter.SerializeObject( generator.getConclaveType().toString(), store );
        return store;
    }

    @Override
    protected HashMap<String, SpriteFileData> populate( AbstractFileNameGenerator<?, ?> generator )
    {
        HashMap<String, SpriteFileData> data = new HashMap<>();
        String[] fileNames = generator.getFileNames();
        String conclaveType = generator.getConclaveType().name();
        String fileExtension = generator.getFileExtensionType().name();
        SpriteDimension dimension = Sprite2D.getDimension( ( SpriteConclave ) generator.getConclaveType() );
        for ( String fileName : fileNames )
        {
            String key = fileName.split( "." + fileExtension, 2 )[ 0 ];
            String path = "/assets/audio/" + conclaveType + "/" + fileName;
            SpriteFileData value = SpriteFileData.create( fileName, path, dimension );
//            OBSConverter.SerializeObject( key, value );
            data.put( key, value );
        }
        return data;
    }

}
