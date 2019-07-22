/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects;

import application.dataobjects.abstracts.AbstractDimensionStore;

/**
 * Class that represents a store for sprite dimensional data. Extends
 * AbstractDimensionStore.
 *
 * @author Oge Tasie
 */
public class SpriteDimensionStore extends AbstractDimensionStore
{

    /**
     * Privately creates an instance of SpriteDimensionStore.
     */
    private SpriteDimensionStore()
    {
        super();
    }

    /**
     * Returns the singleton instance of SpriteDimensionStore.
     *
     * @return An instance of this SpriteDimensionStore.
     */
    public static SpriteDimensionStore getInstance()
    {
        return ClassHolder.STORE_INSTANCE;
    }

    /**
     * Class holder for an instance of SpriteDimensionStore.
     */
    private static class ClassHolder
    {

        /**
         * A static instance of SpriteDimensionStore.
         */
        private static final SpriteDimensionStore STORE_INSTANCE = new SpriteDimensionStore();
    }

    @Override
    protected void populate()
    {
        dimensions.put( SpriteObjectType.characters.name(), new SpriteDimensionGroup( 16, 16, 1 ) );
        dimensions.put( SpriteObjectType.backgrounds.name(), new SpriteDimensionGroup( 16, 16, 1 ) );
        dimensions.put( SpriteObjectType.fonts.name(), new SpriteDimensionGroup( 16, 16, 1 ) );
        dimensions.put( SpriteObjectType.stages.name(), new SpriteDimensionGroup( 16, 16, 1 ) );
        dimensions.put( SpriteObjectType.uielements.name(), new SpriteDimensionGroup( 16, 16, 1 ) );
    }

}
