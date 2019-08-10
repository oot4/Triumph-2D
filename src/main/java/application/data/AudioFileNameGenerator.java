/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data;

import application.data.conclave.AudioConclave;
import application.data.conclave.PathAnnexConclave;
import application.data.abstracts.AbstractFileNameGenerator;

/**
 * Generates file names based on audio conclave location. Extends
 * {@code AbstractFileNameGenerator}.
 *
 * @author Oge Tasie
 */
public class AudioFileNameGenerator extends AbstractFileNameGenerator<AudioConclave, PathAnnexConclave>
{

    /**
     * Privately creates an audio file name generator.
     *
     * @param root      The root directory location of the files to generate
     *                  file names for.
     * @param conclave  The type of conclave package location constant to
     *                  generate file names for.
     * @param extension The type of file extension to match against when
     *                  searching the conclave package location for files.
     */
    private AudioFileNameGenerator( String root, AudioConclave resourceType, PathAnnexConclave fileExtension )
    {
        super( root, resourceType, fileExtension );
    }

    /**
     * Creates a new audio file name generator.
     *
     * @param conclave  The type of conclave package location constant to
     *                  generate file names for.
     *
     * @return A new instance of {@code AudioFileNameGenerator}.
     */
    public static AudioFileNameGenerator create( AudioConclave conclave )
    {
        return new AudioFileNameGenerator( "src/main/java/assets/audio/", conclave, PathAnnexConclave.wav );
    }

}
