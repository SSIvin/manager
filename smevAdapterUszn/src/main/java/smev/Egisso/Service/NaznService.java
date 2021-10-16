package smev.Egisso.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.dto.PacInner;
import smev.Egisso.Elements.ElementsNazn.Fact;
import smev.Egisso.Elements.ElementsNazn.NaznMetaData;
import smev.Egisso.Elements.ElementsNazn.PrsnInfo;
import smev.Egisso.Elements.ElementsNazn.Termination;
import smev.Egisso.Elements.ElementsProtocol.RecordResult;
import smev.Egisso.Elements.ElementsProtocol.Response;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@Service
public interface NaznService {

    String getPackageFactNoSend();
    List<PrsnInfo> fill_reason_persons(String id, String factId);
    void exec_spFillNazn(String PackageId);
    List<Map<String, Object>> mapNazn(String PAC_GUID);
    List<Fact> factList (String packageId);
    void SaveFileXmlToBase(NaznMetaData naznMetaData);
    int getNotSendKMSZ();
    int countNoSendPackage();
    void writeProtocol(RecordResult rec, String idFileProtocol);
    int applayProtocolFact(String idGlobalPackage);
    //List<String> listFilePackage();
    int getPackageByNotLOAD_PROTOCOL(String idGlobalPackage);
    int findGuidInTable(String guidFile);
    List<Termination> termList(String idGlobalPackageFact);
    void insertPackageFact(NaznMetaData naznMetaData);
    void setStatusGlobalPackage(String idGlobalPackage, Integer status);

    Integer Create_Nazn_data(NaznMetaData.PackageGlobleFact gF);

    void FillTempTable(NaznMetaData.PackageGlobleFact idExecuteJob);

    //void setIdExecuteJob(Integer idExecuteJob, String idGlobalPackageFact);

    NaznMetaData.PackageGlobleFact getGlobalPackage(TypePackage typePackage, Integer idExecuteJob);
}
