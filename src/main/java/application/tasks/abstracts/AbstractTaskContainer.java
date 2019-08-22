/*
 * Triumph 2D project files, related assets and related source code were created by, Ogesoka Tasie
 * and should not be copied or distributed without consent of the creator (Oge Tasie).
 * All Rights Reserved.
 */
package application.tasks.abstracts;

import javax.swing.SwingWorker;

/**
 * Abstract class representing a container for a task. Extends
 * {@code SwingWorker}.
 *
 * @author Oge Tasie
 */
public abstract class AbstractTaskContainer extends SwingWorker<Void, Void>
{

    /**
     * Default constructor for creating a task container.
     */
    protected AbstractTaskContainer()
    {
    }

    @Override
    protected Void doInBackground() throws Exception
    {
        task();
        return null;
    }

    @Override
    public void done()
    {
        finish();
    }

    /**
     * The task to be executed.
     */
    protected abstract void task();

    /**
     * The final operation performed when the task is done.
     */
    protected abstract void finish();

}
