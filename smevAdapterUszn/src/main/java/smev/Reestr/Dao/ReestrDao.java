package smev.Reestr.Dao;

import org.springframework.stereotype.Repository;
import smev.ElementServices.NalogMnogodet.Файл;
import smev.ElementServices.PFR_KSZN.responsePfrKszn;
import smev.GisJkh.Entity.DataRequestEntity;
import smev.GisJkh.Entity.GlobalPackageEntity;
import smev.Reestr.Dto.DateForGisJkh;
import smev.Reestr.Entity2.NalogMnogodetEntity;
import smev.Reestr.Entity2.Rekvezits;
import smev.Reestr.Entity2.SubjectReestr;
import smev.Reestr.Entity2.ZagsEntity;
import smev.Service.excel.UserReportGenerator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReestrDao {

    void insertZagsEntity(ZagsEntity zagsEntity);

    void updateZags(ZagsEntity zagsEntity);

    void getPaySubject(SubjectReestr item);

    List<SubjectReestr> getListForJob();

    void saveToOtherTable(SubjectReestr item);

    void saveToOtherTableBatch(List<SubjectReestr> batchList);

    void ListNalogMnogodet(Файл файл);

    List<NalogMnogodetEntity> dataForNalog();

    List<DataRequestEntity> getListDataRequestEntity(Integer idRegion, DateForGisJkh lastDateForGisJkh, GlobalPackageEntity globalPackageEntity);

    DateForGisJkh getLastDateForGisJkh();

    LocalDate getMaxDatZ();

    Rekvezits getByIdRegion(Integer idRegion);

    List<UserReportGenerator.ResultFromView> getReportExcel_1();

    List<responsePfrKszn> getDataChangePFRKSZN(LocalDateTime nowtime);
}
