/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data;

import application.data.conclave.SpriteConclave;

/**
 * Class containing dimensions for sprite images.
 *
 * @author Oge Tasie
 */
public class Sprite2D
{

    /**
     * This class cannot be instantiated outside of itself.
     */
    private Sprite2D()
    {
    }

    /**
     * Returns the sprite dimension for a character image.
     *
     * @return Character dimension as {@code SpriteDimension}.
     */
    public static SpriteDimension Character()
    {
        return DimensionHolder.CHARACTER;
    }

    /**
     * Returns the sprite dimension for a character image.
     *
     * @return Character dimension as {@code SpriteDimension}.
     */
    public static SpriteDimension Stage()
    {
        return DimensionHolder.STAGE;
    }

    /**
     * Returns the sprite dimension for a character image.
     *
     * @return Character dimension as {@code SpriteDimension}.
     */
    public static SpriteDimension Background()
    {
        return DimensionHolder.BACKGROUND;
    }

    /**
     * Returns the sprite dimension for a character image.
     *
     * @return Character dimension as {@code SpriteDimension}.
     */
    public static SpriteDimension UIElement()
    {
        return DimensionHolder.UIELEMENT;
    }

    /**
     * Returns the sprite dimension for a character image.
     *
     * @return Character dimension as {@code SpriteDimension}.
     */
    public static SpriteDimension Font()
    {
        return DimensionHolder.FONT;
    }

    /**
     * Returns the matching dimension to the specified sprite conclave type.
     *
     * @param conclave The type of sprite conclave used to determine the
     *                 resulting sprite dimension.
     *
     * @return A dimension of with, height and scale as a
     *         {@code SpriteDimension}.
     */
    public static SpriteDimension getDimension( SpriteConclave conclave )
    {
        return DimensionHolder.getDimension( conclave );
    }

    /**
     * Class representing a holder of dimension instances.
     */
    private static class DimensionHolder
    {

        /**
         * Character sprite dimension.
         */
        private static final SpriteDimension CHARACTER = new SpriteDimension( 1, 1, 1 );

        /**
         * Stage sprite dimension.
         */
        private static final SpriteDimension STAGE = new SpriteDimension( 1, 1, 1 );

        /**
         * Background sprite dimension.
         */
        private static final SpriteDimension BACKGROUND = new SpriteDimension( 1, 1, 1 );

        /**
         * User Interface Element sprite dimension.
         */
        private static final SpriteDimension UIELEMENT = new SpriteDimension( 1, 1, 1 );

        /**
         * Font sprite dimension.
         */
        private static final SpriteDimension FONT = new SpriteDimension( 1, 1, 1 );

        /**
         * This class cannot be instantiated outside of its super class.
         */
        private DimensionHolder()
        {
        }

        /**
         * Returns the matching dimension to the specified sprite conclave type.
         *
         * @param conclave The type of sprite conclave used to determine the
         *                 resulting sprite dimension.
         *
         * @return A dimension of with, height and scale as a
         *         {@code SpriteDimension}.
         */
        private static SpriteDimension getDimension( SpriteConclave conclave )
        {
            switch ( conclave )
            {
                case characters:
                    return CHARACTER;
                case stages:
                    return STAGE;
                case backgrounds:
                    return BACKGROUND;
                case uielements:
                    return UIELEMENT;
                case fonts:
                    return FONT;
                default:
                    throw new AssertionError( conclave.name() );
            }
        }
    }

}
