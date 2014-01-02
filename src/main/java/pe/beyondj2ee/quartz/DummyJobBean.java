/*
 *  
 *  * Revision History
 *  * Author              Date                  Description
 *  * ------------------   --------------       ------------------
 *  *  beyondj2ee          2014.01.02              
 *  
 */

package pe.beyondj2ee.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;


public class DummyJobBean extends QuartzJobBean {

    private DummyTask dummyTask;

    protected void executeInternal(JobExecutionContext context)
            throws JobExecutionException {

        dummyTask.print();

    }


    public void setDummyTask(DummyTask dummyTask) {
        this.dummyTask = dummyTask;
    }

}
