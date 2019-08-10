/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data.abstracts;

import java.util.HashMap;
import application.data.interfaces.IDataStore;

/**
 * Abstract class for creating a store of asset data objects.Implements
 * {@code IDataStore}.
 *
 * @author Oge Tasie
 * @param <E> The type of data elements to be stored. Extends
 *            {@code AbstractFileData}.
 */
public abstract class AbstractFileDataStore<E extends AbstractFileData<? super E>> implements IDataStore<E>
{

    /**
     * A collection of file data mapped to keys.
     */
    protected final HashMap<String, E> DATA;

    /**
     * Default constructor for creating a store for file data.
     *
     * @param data The map of file data to store.
     */
    protected AbstractFileDataStore( HashMap<String, E> data )
    {
        DATA = data;
    }

    /**
     * Returns a {@code HashMap} with key-value pairs for file data.
     *
     * @param generator An {@code AbstractFileNameGenerator} object containing
     *                  keys to match against the file data contained in this
     *                  store.
     *
     * @return A map of file data to be contained in this store.
     */
    protected abstract HashMap<String, E> populate( AbstractFileNameGenerator<?, ?> generator );

    @Override
    public int size()
    {
        return DATA.size();
    }

    @Override
    public boolean isEmpty()
    {
        return DATA.isEmpty();
    }

    @Override
    public boolean contains( E element )
    {
        return DATA.containsValue( element );
    }

    @Override
    public E getDataByKey( String key )
    {
        return DATA.get( key );
    }

}
