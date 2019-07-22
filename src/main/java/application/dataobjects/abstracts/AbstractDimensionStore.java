/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects.abstracts;

import application.dataobjects.interfaces.IDimensionStore;
import java.util.HashMap;

/**
 * Abstract class for storing dimensional data objects. Implements
 * IDimensionStore.
 *
 * @author Oge Tasie
 */
public abstract class AbstractDimensionStore implements IDimensionStore
{

    /**
     * A hash map of dimension groups in this store.
     */
    protected final HashMap<String, AbstractDimensionGroup> dimensions;

    /**
     * Default constructor for creating a dimension group store.
     */
    protected AbstractDimensionStore()
    {
        dimensions = new HashMap<>();
    }

    /**
     * Method to populate dimensions hash map if empty.
     */
    protected abstract void populate();

    @Override
    public AbstractDimensionGroup getDimensionGroupByType( Enum type )
    {
        if ( dimensions.isEmpty() )
        {
            populate();
        }

        return dimensions.get( type.name() );
    }

}
