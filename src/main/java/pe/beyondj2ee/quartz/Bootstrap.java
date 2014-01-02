/*
 *  
 *  * Revision History
 *  * Author              Date                  Description
 *  * ------------------   --------------       ------------------
 *  *  beyondj2ee          2014.01.02              
 *  
 */
package pe.beyondj2ee.quartz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
    
    public static void main (String[] args) throws Exception {

        new ClassPathXmlApplicationContext("quartz2.2.1.xml");

    }

}
