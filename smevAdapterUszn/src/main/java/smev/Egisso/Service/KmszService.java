package smev.Egisso.Service;

import smev.Egisso.Enum.TypePackage;
import smev.ElementServices.Egisso.ElementsKmsz.*;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface KmszService {

    int getCountKmszForChange();
    PackageKMSZ getKmszNoSend();
    Map<String, String> getPackageID(TypePackage typePackage, Integer idExecuteJob);
    void updateGuid();
    List<NPA> fillNpa(int ID_MSZ);
    String getLastGuidKmsz(int ID_MSZ);
    List<Map<String,Object>> getMszForChange();
    void insertPackageKmsz(File file, Request req);
    void applay_protocol_klacc(String packageID);

    List<LocalCategory> fillCateg(int ID_MSZ);
    List<Method> fillMethods(Integer id_msz);
    List<Integer> fillFormReq(Integer id_msz);
    List<Integer> fillFormRecieve(Integer id_msz);
    List<DocTypesList> fillDocTypeList(Integer id_msz);
    List<StepsForMSZ> fillStepsMSZ(Integer id_msz);


}
