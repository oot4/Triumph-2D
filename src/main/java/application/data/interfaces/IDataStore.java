/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data.interfaces;

/**
 * An interface for a collection of data objects mapped by key-value pairs.
 *
 * @author Oge Tasie
 * @param <E> The type of data element to be stored. Extends {@code IData}.
 */
public interface IDataStore<E extends IData<? super E>>
{

    /**
     * The number of elements in this store.
     *
     * @return The number of elements as an {@code Integer}.
     */
    int size();

    /**
     * Is this store empty?
     *
     * @return {@code True} if this store is empty.
     */
    boolean isEmpty();

    /**
     * Does this store contain {@code element}?
     *
     * @param element Element whose presence in this store is to be tested.
     *
     * @return {@code True} if this store contains the specified element.
     */
    boolean contains( E element );

    /**
     * The file data whose key exactly matches the specified key.
     *
     * @param key The key used to query for the data object in this store.
     *
     * @return The data of type {@code IData}.
     */
    E getDataByKey( String key );

}
