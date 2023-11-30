/***********************************************************************
 * Module:  Message.java
 * Author:  Lenovo Slim 3
 * Purpose: Defines the Class Message
 ***********************************************************************/

import java.util.*;

/** @pdOid 01d7caf4-118f-4398-93fe-add4a6617427 */
public class Message {
   /** @pdOid caf61f7f-f5c5-4f7d-b202-f21363782aa5 */
   private Integer messageID;
   /** @pdOid 4103a1bf-e00f-4b7c-9729-781fffc16925 */
   private Integer senderID;
   /** @pdOid 9afd021c-c331-44b6-90a4-2cc294ac93e5 */
   private Integer receiverID;
   /** @pdOid 43712c08-c299-4efd-a6d8-a95b237f7cbc */
   private Date dateCreated;
   /** @pdOid 87074cb8-d44a-42cd-834d-ebe591e95443 */
   private String status;
   
   /** @pdRoleInfo migr=no name=User assc=sends mult=1..1 side=A */
   public User user;
   
   /** @pdOid 4d7410e4-ac5e-42bc-9544-1560dc0ddc3f */
   public void sendMessage() {
      // TODO: implement
   }
   
   /** @pdOid d0bb951d-8502-4ddf-86f9-77710f62b7ce */
   public void recallMessage() {
      // TODO: implement
   }
   
   /** @pdOid 1a5c8c84-78e6-4146-a1b5-b8614152f1c6 */
   public void getMessageContent() {
      // TODO: implement
   }
   
   /** @pdOid 6cc1bff4-9f55-4330-8cf2-4a2b9b35f8a1 */
   public void setReminder() {
      // TODO: implement
   }
   
   /** @pdOid 0e0e860e-b6da-4f74-8183-40fbe35b3fd5 */
   public void deleteMessage() {
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
            oldUser.removeMessage(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            this.user.addMessage(this);
         }
      }
   }

}