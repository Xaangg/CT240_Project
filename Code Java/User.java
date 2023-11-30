/***********************************************************************
 * Module:  User.java
 * Author:  Lenovo Slim 3
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.util.*;

/** @pdOid ed039ef7-8cdf-438d-ae57-aba21de73874 */
public class User {
   /** @pdOid 89397cef-369c-4c0c-bdfc-6d6a68173eaf */
   private String userName;
   /** @pdOid bf581fcd-0aca-4da2-a305-d3e17633cb1d */
   private String passWord;
   /** @pdOid 7bf32ad2-5b56-4305-b6e3-beed955ed28b */
   private Integer phoneNumber;
   
   /** @pdRoleInfo migr=no name=Message assc=sends coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Message> message;
   /** @pdRoleInfo migr=no name=Contact assc=adds coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Contact> contact;
   /** @pdRoleInfo migr=no name=Group assc=creates coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Group> group;
   /** @pdRoleInfo migr=no name=Schedule assc=schedulesFor mult=1..1 side=A */
   public Schedule schedule;
   
   /** @pdOid 1e2cdc94-74d4-467d-8c69-4df6ee525ab9 */
   public void dangNhap() {
      // TODO: implement
   }
   
   /** @pdOid 16ef8636-57db-4201-a2db-6b329c0063ca */
   public void dangKy() {
      // TODO: implement
   }
   
   /** @pdOid 1698c024-5ff8-4223-8080-d4f757bd6e09 */
   public void taoNhom() {
      // TODO: implement
   }
   
   /** @pdOid 10fda1a3-7d5c-4df5-8ad3-da1604d90683 */
   public void themBan() {
      // TODO: implement
   }
   
   /** @pdOid aee05450-3955-4f91-b975-dcc6b149205d */
   public void chiaSe() {
      // TODO: implement
   }
   
   /** @pdOid a0cc322b-dabd-42c3-b783-00b91a206409 */
   public void guiTinNhan() {
      // TODO: implement
   }
   
   /** @pdOid a8b43307-9060-4dff-afe4-1acc12dbb5e4 */
   public void goiVideo() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Message> getMessage() {
      if (message == null)
         message = new java.util.HashSet<Message>();
      return message;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMessage() {
      if (message == null)
         message = new java.util.HashSet<Message>();
      return message.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMessage */
   public void setMessage(java.util.Collection<Message> newMessage) {
      removeAllMessage();
      for (java.util.Iterator iter = newMessage.iterator(); iter.hasNext();)
         addMessage((Message)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMessage */
   public void addMessage(Message newMessage) {
      if (newMessage == null)
         return;
      if (this.message == null)
         this.message = new java.util.HashSet<Message>();
      if (!this.message.contains(newMessage))
      {
         this.message.add(newMessage);
         newMessage.setUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMessage */
   public void removeMessage(Message oldMessage) {
      if (oldMessage == null)
         return;
      if (this.message != null)
         if (this.message.contains(oldMessage))
         {
            this.message.remove(oldMessage);
            oldMessage.setUser((User)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMessage() {
      if (message != null)
      {
         Message oldMessage;
         for (java.util.Iterator iter = getIteratorMessage(); iter.hasNext();)
         {
            oldMessage = (Message)iter.next();
            iter.remove();
            oldMessage.setUser((User)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Contact> getContact() {
      if (contact == null)
         contact = new java.util.HashSet<Contact>();
      return contact;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorContact() {
      if (contact == null)
         contact = new java.util.HashSet<Contact>();
      return contact.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newContact */
   public void setContact(java.util.Collection<Contact> newContact) {
      removeAllContact();
      for (java.util.Iterator iter = newContact.iterator(); iter.hasNext();)
         addContact((Contact)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newContact */
   public void addContact(Contact newContact) {
      if (newContact == null)
         return;
      if (this.contact == null)
         this.contact = new java.util.HashSet<Contact>();
      if (!this.contact.contains(newContact))
      {
         this.contact.add(newContact);
         newContact.setUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldContact */
   public void removeContact(Contact oldContact) {
      if (oldContact == null)
         return;
      if (this.contact != null)
         if (this.contact.contains(oldContact))
         {
            this.contact.remove(oldContact);
            oldContact.setUser((User)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllContact() {
      if (contact != null)
      {
         Contact oldContact;
         for (java.util.Iterator iter = getIteratorContact(); iter.hasNext();)
         {
            oldContact = (Contact)iter.next();
            iter.remove();
            oldContact.setUser((User)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Group> getGroup() {
      if (group == null)
         group = new java.util.HashSet<Group>();
      return group;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGroup() {
      if (group == null)
         group = new java.util.HashSet<Group>();
      return group.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGroup */
   public void setGroup(java.util.Collection<Group> newGroup) {
      removeAllGroup();
      for (java.util.Iterator iter = newGroup.iterator(); iter.hasNext();)
         addGroup((Group)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGroup */
   public void addGroup(Group newGroup) {
      if (newGroup == null)
         return;
      if (this.group == null)
         this.group = new java.util.HashSet<Group>();
      if (!this.group.contains(newGroup))
      {
         this.group.add(newGroup);
         newGroup.setUser(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldGroup */
   public void removeGroup(Group oldGroup) {
      if (oldGroup == null)
         return;
      if (this.group != null)
         if (this.group.contains(oldGroup))
         {
            this.group.remove(oldGroup);
            oldGroup.setUser((User)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGroup() {
      if (group != null)
      {
         Group oldGroup;
         for (java.util.Iterator iter = getIteratorGroup(); iter.hasNext();)
         {
            oldGroup = (Group)iter.next();
            iter.remove();
            oldGroup.setUser((User)null);
         }
      }
   }

}