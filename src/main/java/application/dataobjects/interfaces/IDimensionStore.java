/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.dataobjects.interfaces;

import application.dataobjects.abstracts.AbstractDimensionGroup;

/**
 * Interface for an object that stores dimension groups.
 *
 * @author Oge Tasie
 */
public interface IDimensionStore
{

    /**
     * Returns the dimension group based on the type of object.
     *
     * @param type The type of the object.
     *
     * @return Group of dimensions as an AbstractDimensionGroup.
     */
    AbstractDimensionGroup getDimensionGroupByType( Enum type );
    
}
