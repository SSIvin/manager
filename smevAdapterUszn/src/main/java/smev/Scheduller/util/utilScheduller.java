package smev.Scheduller.util;

import smev.Scheduller.dto.ServerResponse;

public class utilScheduller {

    public static ServerResponse getServerResponse(int responseCode, Object data){
        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setStatusCode(responseCode);
        serverResponse.setData(data);
        return serverResponse;
    }

}
