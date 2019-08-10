/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data;

import application.data.conclave.SpriteConclave;
import application.data.conclave.PathAnnexConclave;
import application.data.abstracts.AbstractFileNameGenerator;

/**
 * Generates file names based on sprite conclave location. Extends
 * {@code AbstractFileNameGenerator}.
 *
 * @author Oge Tasie
 */
public class SpriteFileNameGenerator extends AbstractFileNameGenerator<SpriteConclave, PathAnnexConclave>
{

    /**
     * Privately creates a sprite file name generator.
     *
     * @param root      The root directory location of the files to generate
     *                  file names for.
     * @param conclave  The type of conclave package location constant to
     *                  generate file names for.
     * @param extension The type of file extension to match against when
     *                  searching the conclave package location for files.
     */
    private SpriteFileNameGenerator( String root, SpriteConclave conclave, PathAnnexConclave extension )
    {
        super( root, conclave, extension );
    }

    /**
     * Creates a new sprite file name generator.
     *
     * @param conclave  The type of conclave package location constant to
     *                  generate file names for.
     * @param extension The type of file extension to match against when
     *                  searching the conclave package location for files.
     *
     * @return A new instance of {@code SpriteFileNameGenerator}.
     */
    public static SpriteFileNameGenerator create( SpriteConclave conclave, PathAnnexConclave extension )
    {
        return new SpriteFileNameGenerator( "src/main/java/assets/sprites/", conclave, extension );
    }

}
