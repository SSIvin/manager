package smev.core;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class DatabaseExecutable extends AbstractExecutable {

    private final Fff fff;

    public DatabaseExecutable(Fff fff) {
        this.fff = fff;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
            //wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.debug("Database integration for {} started");
        while (isRun()) {
            try (Fff queue = this.fff) {
                while (isRun()) {
                    QueueEmulator.Selector selector;
                    while ((selector = queue.next()) != null) {
                        log.info(selector.uid);
//                    while ((selector = queue.next()) != null) {
//                        ClientMessage clientMessage = selector.message;
                        Thread.sleep(1000);

                        String clientId = null;
                        try {
                            //queue.
                            //selector.
//                            if (clientMessage == null) {
//                                throw new RuntimeException("Message content is empty, uid = " + selector.uid);
//                            }
//
                            //log.debug("job");
//                            clientId = getClientId(clientMessage);
//
//                            /*  88 */
//                            if (clientId == null || clientId.isEmpty()) {
//                                /*  89 */
//                                clientId = selector.id;
//                            }

                            //String content = Serializer.toString((new ObjectFactory()).createClientMessage(clientMessage));

                        } catch (Exception ex) {

                            //receive(createErrorResponseMessage(clientId, ex.getMessage()));

                            log.error("", ex);

                            //queue.failed(selector.uid);
                        }
                    }
                    /* 104 */
                    //wait(this.databaseConfiguration.getFixedDelay().longValue(), TimeUnit.MILLISECONDS);
                }

            } catch (Exception ex) {
                /* 107 */
                log.error("", ex);
            }
        }
    }

//    private String getClientId(ClientMessage clientMessage) {
//        /* 113 */
//        if (clientMessage.getRequestMessage() != null) {
//            /* 114 */
//            RequestMetadataType metadata = clientMessage.getRequestMessage().getRequestMetadata();
//            /* 115 */
//            if (metadata != null) {
//                /* 116 */
//                return metadata.getClientId();
//            }
//            /* 118 */
//        } else if (clientMessage.getResponseMessage() != null) {
//            /* 119 */
//            ResponseMetadataType metadata = clientMessage.getResponseMessage().getResponseMetadata();
//            /* 120 */
//            if (metadata != null) {
//                /* 121 */
//                return metadata.getClientId();
//            }
//        }
//        /* 124 */
//        return null;
//    }

//    private XMessageContainerDto createErrorResponseMessage(String clientId, String message) throws IOException {
//        /* 128 */
//        ErrorMessageDto errorMessage = new ErrorMessageDto();
//        /* 129 */
//        errorMessage.setClientId(UUID.randomUUID().toString());
//        /* 130 */
//        errorMessage.setOriginalClientId(clientId);
//        /* 131 */
//        errorMessage.setRefClientId(clientId);
//        /* 132 */
//        errorMessage.setRefGroupId(clientId);
//        /* 133 */
//        errorMessage.setDescription(message);
//        /* 134 */
//        errorMessage.setMessageType(MessageType.RESPONSE);
//        /* 135 */
//        XMessageContainerDto messageContainer = MessageToContainerConverter.getInstance().toMessageContainer((MessageDto) errorMessage);
//        /* 136 */
//        return messageContainer;
//    }


    public synchronized void stop() {
        super.stop();
        log.debug("Database integration for {} stopped");
    }




//    public boolean receive(XMessageContainerDto messageContainer) {
//        /* 147 */
//        String receiveTableName = this.databaseConfiguration.getReceiveTableName();
//        /* 148 */
//        try (Connection c = this.dataSource.getConnection()) {
//            /* 149 */
//            XMessageMetadataDto messageMetadata = messageContainer.getMessageMetadata();
//            /* 150 */
//            String clientId = getClientId(messageMetadata);
//            /* 151 */
//            String refClientId = getRefClientId(messageMetadata);
//            /* 152 */
//            String refGroupId = getRefGroupId(messageMetadata);
//            /* 153 */
//            AdapterMessage adapterMessage = ContainerToAdapterMessageConverter.getInstance().toAdapterMessage(messageContainer);
//            /* 154 */
//            String content = Serializer.toString((new ObjectFactory()).createQueryResult(adapterMessage));
//            /* 155 */
//            try (PreparedStatement stmt = c.prepareStatement("INSERT INTO " + receiveTableName + " (node_id, id,ref_id,ref_group_id,content ) VALUES(?, ?, ?, ?, ?)")) {
//
//
//
//
//
//
//                /* 162 */
//                stmt.setString(1, messageContainer.getMessageMetadata().getNodeId());
//                /* 163 */
//                stmt.setString(2, clientId);
//                /* 164 */
//                stmt.setString(3, refClientId);
//                /* 165 */
//                stmt.setString(4, refGroupId);
//                /* 166 */
//                stmt.setString(5, content);
//                /* 167 */
//                stmt.executeUpdate();
//            }
//
//            /* 170 */
//            return true;
//            /* 171 */
//        } catch (Exception ex) {
//            /* 172 */
//            LOGGER.error(ex.getMessage(), ex);
//            /* 173 */
//            return false;
//        }
//    }

//    private String getClientId(XMessageMetadataDto messageMetadata) {
//        /* 178 */
//        if (messageMetadata == null) {
//            /* 179 */
//            return null;
//        }
//        /* 181 */
//        if (messageMetadata.getId() != null) {
//            /* 182 */
//            return messageMetadata.getId().toString();
//        }
//        /* 184 */
//        return null;
//    }
//
//    private String getRefClientId(XMessageMetadataDto messageMetadata) {
//        /* 188 */
//        if (messageMetadata == null) {
//            /* 189 */
//            return null;
//        }
//        /* 191 */
//        if (messageMetadata.getReferenceId() != null) {
//            /* 192 */
//            return messageMetadata.getReferenceId().toString();
//        }
//        /* 194 */
//        if (messageMetadata.getId() != null) {
//            /* 195 */
//            return messageMetadata.getId().toString();
//        }
//        /* 197 */
//        return null;
//    }
//
//    private String getRefGroupId(XMessageMetadataDto messageMetadata) {
//        /* 201 */
//        if (messageMetadata == null) {
//            /* 202 */
//            return null;
//        }
//        /* 204 */
//        if (messageMetadata.getTransactionCode() == null || messageMetadata.getTransactionCode().length() < 36) {
//            /* 205 */
//            return null;
//        }
//        /* 207 */
//        return messageMetadata.getTransactionCode().substring(0, 36);
//    }
//
//    private HikariDataSource createDatasource() {
//        /* 211 */
//        HikariDataSource dataSource = new HikariDataSource();
//        /* 212 */
//        String url = this.databaseConfiguration.getJdbcUrl();
//        /* 213 */
//        dataSource.setJdbcUrl(url);
//        /* 214 */
//        dataSource.setDriverClassName(this.databaseConfiguration.getJdbcDriver());
//        /* 215 */
//        dataSource.setUsername(this.databaseConfiguration.getJdbcUsername());
//        /* 216 */
//        dataSource.setPassword(this.databaseConfiguration.getJdbcPassword());
//        /* 217 */
//        dataSource.addDataSourceProperty("autoReconnect", "true");
//        /* 218 */
//        dataSource.addDataSourceProperty("useSSL", "false");
//        /* 219 */
//        dataSource.addDataSourceProperty("verifyServerCertificate", "false");
//
//        /* 221 */
//        if (url.contains("postgresql")) {
//            /* 222 */
//            dataSource.setConnectionTestQuery("SELECT 1");
//        }
//        /* 224 */
//        dataSource.setMaximumPoolSize(this.databaseConfiguration.getPoolSize().intValue());
//        /* 225 */
//        return dataSource;
//    }
}


/* Location:              F:\Java_project\01_work\01 temp\smev-adapter\BOOT-INF\lib\3.1.7\database-3.1.7.jar!\ru\rtlabs\smev3\adapter\integrations\database\DatabaseExecutable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
