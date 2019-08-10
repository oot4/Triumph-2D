/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.data.interfaces;

import application.data.conclave.PathAnnexConclave;

/**
 * Interface for generating file names.
 *
 * @author Oge Tasie
 * @param <C> The type of package location conclave file names will be generated
 *            for. Extends {@code Enum}.
 * @param <E> The type of file extension file names will be generated for.
 *            Extends {@code PathAnnexConclave} enum type subclass.
 */
public interface IFileNameGenerator<C extends Enum<C>, E extends Enum<PathAnnexConclave>>
{

    /**
     * The type of package location conclave.
     *
     * @return A package location conclave of type {@code Enum}.
     */
    C getConclaveType();

    /**
     * The file extension type of the files in the package location.
     *
     * @return A file extension conclave of type {@code Enum}.
     */
    E getFileExtensionType();

    /**
     * The generated file names for the specified package location conclave.
     *
     * @return A set of file names as a {@code String} array.
     */
    String[] getFileNames();

}
