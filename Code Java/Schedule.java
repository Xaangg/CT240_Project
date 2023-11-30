/***********************************************************************
 * Module:  Schedule.java
 * Author:  Lenovo Slim 3
 * Purpose: Defines the Class Schedule
 ***********************************************************************/

import java.util.*;

/** @pdOid 9003f0db-0bc7-4020-add6-db0f99b463e7 */
public class Schedule {
   /** @pdOid 6d5c63e4-85c0-44ff-910a-de6f28927976 */
   private Integer scheduleID;
   /** @pdOid f06b854f-5bfc-4e62-8154-cfd5e612512f */
   private String content;
   /** @pdOid 9ee62f71-7700-436b-b505-bb9a00c1038d */
   private Number remindTime;
   
   /** @pdRoleInfo migr=no name=User assc=schedulesFor mult=1..1 */
   public User user;
   /** @pdRoleInfo migr=no name=Group assc=association4 mult=1..1 side=A */
   public Group group;
   
   /** @pdOid 2a15f601-dce0-4aab-8366-87cad7ba6390 */
   public void setReminder() {
      // TODO: implement
   }
   
   /** @pdOid 1eeda9e5-3c4e-4769-8a4e-3de7149a9374 */
   public void sendNotification() {
      // TODO: implement
   }

}