 package smev.core;


 import smev.ElementServices.Other.ClientMessage;
 import smev.exceptions.SystemException;


 public interface QueueEmulator extends AutoCloseable {
   String getBeginTransactionCommand();

   String getCommitTransactionCommand();

   String getRollbackTransactionCommand();

   Selector next() throws SystemException;

   void failed(int paramInt);

   void success(int paramInt);

   void close();

   public static final class Selector {
     public final int uid;
     public final String id;
     public final String message;

     public Selector(int uid, String id, String message) {
       this.uid = uid;
       this.id = id;
      this.message = message;
     }
   }
 }

