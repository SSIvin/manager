package smev.Egisso.Dao;

import smev.Egisso.Enum.TypePackage;
import smev.ElementServices.Egisso.ElementsKmsz.*;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface KmszDao {

    int getCountKmszForChange();

    PackageKMSZ getKmszNoSend();
    Map<String, String> getPackageID(TypePackage typePackage, Integer idExecuteJob);
    void updateGuid();
    List<NPA> fillNpa(int ID_MSZ);
    String getLastGuidKmsz(int ID_MSZ);
    List<Map<String,Object>> getMszForChange();
    List<LocalCategory> fillCateg(int ID_MSZ);
    void insertPackageKmsz(File file, Request req);
//    void chekingKmszSend(PacInner pac, BigInteger recordNum, BigInteger recordNumSuccess, Integer status);
    void applay_protocol_klacc(String packageID);
    List<Method> fillMethods(Integer id_msz);
    List<Integer> fillFormReq(Integer id_msz);
    List<Integer> fillFormRecieve(Integer id_msz);
    List<DocTypesList> fillDocTypeList(Integer id_msz);
    List<StepsForMSZ> fillStepsMSZ(Integer id_msz);

    Map<String, String> getNextGuid(int typePackage, Integer idExecuteJob);

}
