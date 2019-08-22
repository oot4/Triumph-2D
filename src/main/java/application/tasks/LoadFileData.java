/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.tasks;

import application.tasks.abstracts.AbstractTaskContainer;
import application.data.AudioFileDataStore;
import application.data.AudioFileNameGenerator;
import application.data.SpriteFileDataStore;
import application.data.SpriteFileNameGenerator;
import application.data.conclave.AudioConclave;
import application.data.conclave.SpriteConclave;
import java.beans.PropertyChangeListener;
import javax.swing.SwingUtilities;

/**
 * Class containing the procedure to load file data for audio.
 *
 * @author Oge Tasie
 */
public class LoadFileData extends AbstractTaskContainer
{

    /**
     * This class cannot be instantiated outside of itself.
     */
    private LoadFileData()
    {
    }

    /**
     * Performs an operation after registering a {@code PropertyChangeListener}
     * with this source bean notifying any bound any bound property updates.
     *
     * @param listener A property change listener to register with this source
     *                 component.
     */
    public static void begin( PropertyChangeListener listener )
    {
        LoadTaskContainer.INSTANCE.addPropertyChangeListener( listener );
        SwingUtilities.invokeLater( LoadTaskContainer.INSTANCE::execute );
    }

    @Override
    protected void task()
    {
        AudioFileDataStore.create( AudioFileNameGenerator.create( AudioConclave.music ) );
        AudioFileDataStore.create( AudioFileNameGenerator.create( AudioConclave.sfx ) );
        AudioFileDataStore.create( AudioFileNameGenerator.create( AudioConclave.voiceovers ) );
        SpriteFileDataStore.create( SpriteFileNameGenerator.create( SpriteConclave.backgrounds ) );
        SpriteFileDataStore.create( SpriteFileNameGenerator.create( SpriteConclave.characters ) );
        SpriteFileDataStore.create( SpriteFileNameGenerator.create( SpriteConclave.fonts ) );
        SpriteFileDataStore.create( SpriteFileNameGenerator.create( SpriteConclave.stages ) );
        SpriteFileDataStore.create( SpriteFileNameGenerator.create( SpriteConclave.uielements ) );
    }

    @Override
    protected void finish()
    {
        throw new UnsupportedOperationException( "Not supported yet." );
    }

    /**
     * Class representing a holder for an object with the instructions to load
     * audio file data.
     */
    private static class LoadTaskContainer
    {

        /**
         * Component with the instructions to load audio file data.
         */
        private static final LoadFileData INSTANCE = new LoadFileData();

        /**
         * This class cannot be instantiated outside of its super class.
         */
        private LoadTaskContainer()
        {
        }

    }
}
