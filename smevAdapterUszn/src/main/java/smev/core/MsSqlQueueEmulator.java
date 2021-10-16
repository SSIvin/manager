package smev.core;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import smev.exceptions.SystemException;

import java.sql.Connection;

public final class MsSqlQueueEmulator {
    private static final Logger LOGGER = LoggerFactory.getLogger(MsSqlQueueEmulator.class);


    public String getBeginTransactionCommand() {
        /* 35 */
        return "BEGIN";
    }


    public String getCommitTransactionCommand() {
        /* 40 */
        return "COMMIT";
    }


    public String getRollbackTransactionCommand() {
        /* 45 */
        return "ROLLBACK";
    }

    public MsSqlQueueEmulator(String informationSystemName, Connection connection, String sendTableName) {
        /* 49 */
        super();
    }


    public QueueEmulator.Selector next() throws SystemException {

        //return new QueueEmulator.Selector(uid, id, clientMessage);

        return null;
    }
}


/* Location:              F:\Java_project\01_work\01 temp\smev-adapter\BOOT-INF\lib\3.1.7\database-3.1.7.jar!\ru\rtlabs\smev3\adapter\integrations\database\queue\mssql\MsSqlQueueEmulator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
