package smev.Egisso.Dao;

import smev.Egisso.Elements.ElementsNazn.Fact;
import smev.Egisso.Elements.ElementsNazn.NaznMetaData;
import smev.Egisso.Elements.ElementsNazn.PrsnInfo;
import smev.Egisso.Elements.ElementsNazn.Termination;
import smev.Egisso.Elements.ElementsProtocol.RecordResult;
import smev.Egisso.Enum.TypePackage;

import java.util.List;
import java.util.Map;

public interface NaznDao {
    String getFactPackageNoSend();
    List<PrsnInfo> fill_reason_persons(String idGlobalPackageFact, String factId);
    List<Fact> factList(String packageId);
    void spfillTempNazn(String idGlobalPackageFact);
    void exec_spFillNazn(String PackageId);
    void spFillTempReasonPersons(String PackageId);
    List<Map<String, Object>> mapNazn(String PAC_GUID);
    //void SaveFileXmlToBase(NaznMetaData naznMetaData);
    int getNotSendKMSZ();
    void writeProtocol(RecordResult rec, String idFileProtocol);
    int applayProtocolFact(String idGlobalPackage);
    //List<String> listFilePackage();
    int getPackageByNotLOAD_PROTOCOL(String idGlobalPackage);
    int findGuidInTable(String guidFile);
    List<Termination> termList(String idGlobalPackageFact);
    int countNoSendPackage();
    void insertPackageFact(NaznMetaData naznMetaData);
    void setStatusGlobalPackage(String idGlobalPackage, Integer status);

    void spFillTempAsign(String idGlobalPackageFact);

    NaznMetaData.PackageGlobleFact getGlobalPackage(TypePackage typePackage, Integer idExecuteJob);

    //void setIdExecuteJob(Integer idExecuteJob, String idGlobalPackageFact);

}
