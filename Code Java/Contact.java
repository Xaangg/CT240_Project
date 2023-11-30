/***********************************************************************
 * Module:  Contact.java
 * Author:  Vo Minh Sang
 * Purpose: Defines the Class Contact
 ***********************************************************************/

import java.util.*;

/** @pdOid 76a98d27-5d72-4f00-a016-c74a3aad5ebc */
public class Contact {
   /** @pdOid c5a82692-c035-469b-9bc2-e56a24f8dc57 */
   private Integer userID;
   /** @pdOid f1b985d7-a1c8-4b97-9861-09c235c6c67c */
   private String name;
   /** @pdOid 789c0834-cee1-49e5-b48a-22b9bbfe1290 */
   private Number phone;
   
   /** @pdRoleInfo migr=no name=User assc=adds mult=1..1 side=A */
   public User user;
   
   /** @pdOid 7838dc41-544e-40df-898b-bf2ef9e368c6 */
   public void addContact() {
      // TODO: implement
   }
   
   /** @pdOid 82967c64-7efc-4490-add3-77417ef9f44e */
   public void getContact() {
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
            oldUser.removeContact(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            this.user.addContact(this);
         }
      }
   }

}
