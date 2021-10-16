 package smev.utils;


 import smev.ElementServices.Other.Error;
 import smev.ElementServices.Other.Reject1;
 import smev.ElementServices.Other.Status;

 import javax.xml.bind.JAXB;
 import java.io.*;

 public final class ContentUtil
 {
   public static Status createStatus(int code, String description) {
/*  28 */     Status status = new Status();
/*  29 */     status.setCode(code);
/*  30 */     status.setDescription(description);
/*  31 */     return status;
   }

   public static String statusToContent(Status status) throws IOException {
/*  35 */     if (status == null) {
/*  36 */       return null;
     }
/*  38 */     try (Writer writer = new StringWriter()) {
/*  39 */       JAXB.marshal(status, writer);
/*  40 */       return inline(writer.toString());
     }
   }

   public static Status contentToStatus(String content) throws IOException {
/*  45 */     if (content == null) {
/*  46 */       return null;
     }
/*  48 */     try (Reader reader = new StringReader(content)) {
/*  49 */       return JAXB.<Status>unmarshal(reader, Status.class);
     }
   }

//
//   public static MessageContainer createStatusMessage(MessageContainer referenceMessage, Status status, MessageSource source, MessageType type) throws IOException {
///*  55 */     MessageMetadataEntity metadata = new MessageMetadataEntity();
///*  56 */     metadata.setIdMessage(UUID.randomUUID());
///*  57 */     metadata.setReferenceId(referenceMessage.getMessageMetadata().getIdMessage());
///*  58 */     metadata.setTransactionCode(referenceMessage.getMessageMetadata().getTransactionCode());
///*  59 */     metadata.setReferenceMessageId(referenceMessage.getMessageMetadata().getMessageId());
///*  60 */     metadata.setSource(source);
///*  61 */     metadata.setMessageType(type);
///*  62 */     metadata.setTestMessage(referenceMessage.getMessageMetadata().getTestMessage());
//
///*  64 */     MessageContentEntity content = new MessageContentEntity();
///*  65 */     content.setIdMessage(metadata.getIdMessage());
///*  66 */     content.setMode(MessageMode.STATUS);
///*  67 */     content.setContent(statusToContent(status));
//
///*  69 */     MessageContainer message = new MessageContainer();
///*  70 */     message.setMessageMetadata(metadata);
///*  71 */     message.setMessageContent(content);
///*  72 */     return message;
//   }
//

   public static Reject1 createReject() {
/*  77 */     Reject1 reject = new Reject1();

/*  79 */     return reject;
   }

   public static String rejectToContent(Reject1 reject) throws IOException {
/*  83 */     if (reject == null) {
/*  84 */       return null;
     }
/*  86 */     try (Writer writer = new StringWriter()) {
/*  87 */       JAXB.marshal(reject, writer);
/*  88 */       return inline(writer.toString());
     }
   }

   public static Reject1 contentToReject(String content) throws IOException {
/*  93 */     if (content == null) {
/*  94 */       return null;
     }
/*  96 */     try (Reader reader = new StringReader(content)) {
/*  97 */       return JAXB.<Reject1>unmarshal(reader, Reject1.class);
     }
   }

//
//   public static MessageContainer createRejectMessage(MessageContainer referenceMessage, Reject reject, MessageSource source, MessageType type) throws IOException {
///* 103 */     MessageMetadataEntity metadata = new MessageMetadataEntity();
///* 104 */     metadata.setIdMessage(UUID.randomUUID());
///* 105 */     metadata.setReferenceId(referenceMessage.getMessageMetadata().getIdMessage());
///* 106 */     metadata.setTransactionCode(referenceMessage.getMessageMetadata().getTransactionCode());
///* 107 */     metadata.setReferenceMessageId(referenceMessage.getMessageMetadata().getMessageId());
///* 108 */     metadata.setSource(source);
///* 109 */     metadata.setMessageType(type);
///* 110 */     metadata.setTestMessage(referenceMessage.getMessageMetadata().getTestMessage());
//
///* 112 */     MessageContentEntity content = new MessageContentEntity();
///* 113 */     content.setIdMessage(metadata.getIdMessage());
///* 114 */     content.setMode(MessageMode.REJECT);
///* 115 */     content.setContent(rejectToContent(reject));
//
///* 117 */     MessageContainer message = new MessageContainer();
///* 118 */     message.setMessageMetadata(metadata);
///* 119 */     message.setMessageContent(content);
///* 120 */     return message;
//   }
//

   public static Error createError(int code, String description, String details) {
/* 125 */     Error error = new Error();
/* 126 */     error.setCode(code);
/* 127 */     error.setDescription(description);
/* 128 */     error.setDetails(details);
/* 129 */     return error;
   }

   public static Error createError(int code, Throwable throwable) {
/* 133 */     Error error = new Error();
/* 134 */     error.setCode(code);
/* 135 */     if (throwable != null) {
/* 136 */       error.setDescription(throwable.getMessage());
/* 137 */       error.setDetails(stacktrace(throwable));
     }
/* 139 */     return error;
   }

   public static String errorToContent(Error error) throws IOException {
/* 143 */     if (error == null) {
/* 144 */       return null;
     }
/* 146 */     try (Writer writer = new StringWriter()) {
/* 147 */       JAXB.marshal(error, writer);
/* 148 */       return inline(writer.toString());
     }
   }

   public static Error contentToError(String content) throws IOException {
/* 153 */     if (content == null) {
/* 154 */       return null;
     }
/* 156 */     try (Reader reader = new StringReader(content)) {
/* 157 */       return JAXB.<Error>unmarshal(reader, Error.class);
     }
   }

   public static String stacktrace(Throwable throwable) {
/* 162 */     if (throwable == null) {
/* 163 */       return null;
     }
/* 165 */     StringWriter sw = new StringWriter();
/* 166 */     try (PrintWriter pw = new PrintWriter(sw, true)) {
/* 167 */       throwable.printStackTrace(pw);
     }
/* 169 */     return sw.toString();
   }


//   public static MessageContainer createErrorMessage(MessageContainer referenceMessage, Error error, MessageSource source, MessageType type) throws IOException {
///* 174 */     MessageMetadataEntity metadata = new MessageMetadataEntity();
///* 175 */     metadata.setIdMessage(UUID.randomUUID());
///* 176 */     metadata.setReferenceId(referenceMessage.getMessageMetadata().getIdMessage());
///* 177 */     metadata.setTransactionCode(referenceMessage.getMessageMetadata().getTransactionCode());
///* 178 */     metadata.setReferenceMessageId(referenceMessage.getMessageMetadata().getMessageId());
///* 179 */     metadata.setSource(source);
///* 180 */     metadata.setMessageType(type);
///* 181 */     metadata.setTestMessage(referenceMessage.getMessageMetadata().getTestMessage());
//
///* 183 */     MessageContentEntity content = new MessageContentEntity();
///* 184 */     content.setIdMessage(metadata.getIdMessage());
///* 185 */     content.setMode(MessageMode.ERROR);
///* 186 */     content.setContent(errorToContent(error));
//
///* 188 */     MessageContainer messageContainer = new MessageContainer();
///* 189 */     messageContainer.setMessageMetadata(metadata);
///* 190 */     messageContainer.setMessageContent(content);
///* 191 */     return messageContainer;
//   }
//
   private static String inline(String xml) {
/* 195 */     return xml.replaceAll(">(\\s*)<", "><");
   }
 }
