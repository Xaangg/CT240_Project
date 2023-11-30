/***********************************************************************
 * Module:  Group.java
 * Author:  Lenovo Slim 3
 * Purpose: Defines the Class Group
 ***********************************************************************/

import java.util.*;

/** @pdOid e707f302-1282-4aee-8c28-b1d753b01b5a */
public class Group {
   /** @pdOid d59f931b-5106-40c7-909e-27b1752430bf */
   private Integer groupID;
   /** @pdOid a8d11f07-8b3b-41d6-bf3e-6807d7afb642 */
   private String groupName;
   /** @pdOid 187ea0ff-2e4c-4b99-9d72-4148b0cabc58 */
   private String owner;
   /** @pdOid 9fddeceb-6ad2-4eb9-942f-f87e44761dd8 */
   private String members;
   
   /** @pdRoleInfo migr=no name=Schedule assc=association4 mult=1..1 */
   public Schedule schedule;
   /** @pdRoleInfo migr=no name=User assc=creates mult=1..1 side=A */
   public User user;
   
   /** @pdOid d60d77ee-6e43-4a4c-81b4-b8dcd8ec4608 */
   public void addMember() {
      // TODO: implement
   }
   
   /** @pdOid 7e6d1cc4-95d2-43b5-9381-ef88107378c5 */
   public void removeMember() {
      // TODO: implement
   }
   
   /** @pdOid 4f6ef92d-7ce5-4b6f-89c8-c8bf669b5e87 */
   public void getMember() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default parent getter */
   public User getUser() {
      return user;
   }
   
   /** @pdGenerated default parent setter
     * @param newUser */
   public void setUser(User newUser) {
      if (this.user == null || !this.user.equals(newUser))
      {
         if (this.user != null)
         {
            User oldUser = this.user;
            this.user = null;
            oldUser.removeGroup(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            this.user.addGroup(this);
         }
      }
   }

}