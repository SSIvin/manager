package smev.Egisso.Dao;

import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.Entity.PackageHistory;
import smev.Egisso.Entity.PackageMessage;
import smev.Egisso.Enum.ApplayProtocol;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.dto.PacInner;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

public interface EgissoDao {

    void savePackageMessage(UUID packageID, UUID messageID);

    void update(PackageHistory packageHistory);

    PackageHistory getById(UUID packageID);

    List<PackageMessage> getPackageMessageByPackageId(UUID packageID);

    void writeProtocolBatch(PacInner pac);

    void updateStatusPackage(PacInner pac, BigInteger recordNum, BigInteger recordNumSuccess, StatusPackage statusPackage);
    void setApplayProtocolGlobalPackage(PacInner pac, ApplayProtocol applayProtocol);

    GlobalPackage getGlobalPackageByStatusAndApplayProtocol(StatusPackage statusPackage, ApplayProtocol applayProtocol);

    List<PackageHistory> getListPackageHistoryByGlobalPac(GlobalPackage globalPackage);


}
