/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.tools;

import application.data.abstracts.AbstractFileData;
import application.data.abstracts.AbstractFileDataStore;
import application.data.conclave.PathAnnexConclave;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Class used to convert an object to a byte stream and a byte stream to an
 * object.
 *
 * @author Oge Tasie
 */
public class OBSConverter
{

    /**
     * This class cannot be instantiated outside of itself.
     */
    private OBSConverter()
    {
    }

    /**
     * Performs a serialization operation on the specified object.
     *
     * @param <E>    The type of element that is permitted to be serialized.
     * @param name   The name the resulting file will have.
     * @param object The object to perform the serialization on.
     */
    public static <E extends AbstractFileData<? super E>> void SerializeObject( String name, E object )
    {
        SerializationFunctionHolder.SerializeObject( name, object );
    }

    /**
     * Performs a serialization operation on the specified object.
     *
     * @param <D>    The type of element that is permitted to be serialized.
     * @param <E>    The type of element {@code D} that is permitted to be
     *               serialized.
     * @param name   The name the resulting file will have.
     * @param object The object to perform the serialization on.
     */
    public static <E extends AbstractFileData<? super E>, D extends AbstractFileDataStore<E>> void SerializeObject( String name, D object )
    {
        SerializationFunctionHolder.SerializeObject( name, object );
    }

    /**
     * Class representing a holder for serialization functions that can be
     * applied to objects and files.
     */
    private static class SerializationFunctionHolder
    {

        /**
         * This class cannot be instantiated outside of its super class.
         */
        private SerializationFunctionHolder()
        {
        }

        /**
         * Performs a serialization operation on the specified object.
         *
         * @param <E>    The type of element that is permitted to be serialized.
         * @param name   The name the resulting file will have.
         * @param object The object to perform the serialization on.
         */
        private static <E extends AbstractFileData<? super E>> void SerializeObject( String name, E object )
        {
            String path = "src/main/java/assets/data/" + name + "." + PathAnnexConclave.tros;
            try ( FileOutputStream byteStream = new FileOutputStream( path ); ObjectOutputStream objectStream = new ObjectOutputStream( byteStream ) )
            {
                objectStream.writeObject( object );
                objectStream.close();
                byteStream.close();
                System.out.println( "Object Serialized -: " + name + "." );
            }
            catch ( Exception e )
            {
                System.out.println( e.getLocalizedMessage() );
            }
        }

        /**
         * Performs a serialization operation on the specified object.
         *
         * @param <D>    The type of element that is permitted to be serialized.
         * @param <E>    The type of element {@code D} that is permitted to be
         *               serialized.
         * @param name   The name the resulting file will have.
         * @param object The object to perform the serialization on.
         */
        private static <E extends AbstractFileData<? super E>, D extends AbstractFileDataStore<E>> void SerializeObject( String name, D object )
        {
            String path = "src/main/java/assets/data/" + name + "." + PathAnnexConclave.tros;
            try ( FileOutputStream byteStream = new FileOutputStream( path ); ObjectOutputStream objectStream = new ObjectOutputStream( byteStream ) )
            {
                objectStream.writeObject( object );
                objectStream.close();
                byteStream.close();
                System.out.println( "Object Serialized -: " + name + "." );
            }
            catch ( Exception e )
            {
                System.out.println( e.getLocalizedMessage() );
            }
        }
    }
}
