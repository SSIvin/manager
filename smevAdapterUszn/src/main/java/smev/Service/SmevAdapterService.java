package smev.Service;


import smev.ElementServices.Other.ClientMessage;

import java.rmi.RemoteException;

public interface SmevAdapterService {

    void send(ClientMessage clientMessage) throws RemoteException;

    void get();

}
