package smev.Egisso.Test;

import lombok.extern.log4j.Log4j2;
import smev.ElementServices.Egisso.ElementsKmsz.Request;


@Log4j2
public class TestRun {

    private Request req;

    public void ShowMessage() {
        log.info("привет");
    }

    public void CreateXML() {
//
////reasons/NPA
//        List<NPA> npaList = new ArrayList<>();
//        NPA npa1 = new NPA("16-ОД"
//                ,new SimpleDateFormat("yyyy-MM-dd").format(new Date())
//                ,"Закон Волгоградской области \"Об организации отдыха и оздоровления детей в Волгоградской области","Волгоградская областная Дума","http://www.pravo.gov.ru");
//        npaList.add(npa1);
//
////Territories
//        Territories territories = new Territories();
//        territories.setCodeOKTMO("18000000");
//
//
////ClassificationKMSZ
//        ClassificationKMSZ kmsz = new ClassificationKMSZ();
//        kmsz.setCodePartKMSZ("030700");
//        kmsz.setCodeMSZ("0757");
//        kmsz.setCodeProvisionForm("03");
//        kmsz.setCodeLevelNPA("02");
//
////cofinancing
//        List<FundingSource> fundingSources = new ArrayList<>();
//        FundingSource fundingSource1 = new FundingSource("0100","86");
//        FundingSource fundingSource2 = new FundingSource("0100","14");
//        fundingSources.add(fundingSource1);
//        fundingSources.add(fundingSource2);
//
////LocalCategories
//        List<LocalCategory> listCategory = new ArrayList<>();
//        LocalCategory category1 = new LocalCategory(UUID.randomUUID().toString(),"Дети-сироты","07000032");
//        LocalCategory category2 = new LocalCategory(UUID.randomUUID().toString(),"Дети, оставшиеся без попечения родителей","07000033");
//        listCategory.add(category1);
//        listCategory.add(category2);
//
////Fact
//        String dateFormat = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//        //Date dateFormaDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//        LocalMSZ emp1 = new LocalMSZ(UUID.randomUUID().toString(),"090909","ffff"
//                ,new SimpleDateFormat("yyyy-MM-dd").format(new Date())
//                ,new SimpleDateFormat("yyyy-MM-dd").format(new Date())
//                ,"04"
//                ,"07074420310690323262"
//                ,new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "T" + new SimpleDateFormat("hh:mm:ss").format(new Date()) + "+03:00"
//                ,UUID.randomUUID().toString());
//
//        kmsz.setLocalCategory(listCategory);
//        kmsz.setFundingSources(fundingSources);
//        emp1.setClassificationKMSZ(kmsz);
//        emp1.setTerritories(territories);
//        emp1.setNpaList(npaList);
//
//        LocalMSZ emp2 = new LocalMSZ(UUID.randomUUID().toString(),"090909","hhhh"
//                , new SimpleDateFormat("yyyy-MM-dd").format(new Date())
//                ,new SimpleDateFormat("yyyy-MM-dd").format(new Date())
//                ,"04","07074420310690323262"
//                ,new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "T" + new SimpleDateFormat("hh:mm:ss").format(new Date()) + "+03:00"
//                ,UUID.randomUUID().toString());
//        emp2.setClassificationKMSZ(kmsz);
//        emp2.setTerritories(territories);
//        emp2.setNpaList(npaList);
//
//        LocalMSZ emp3 = new LocalMSZ(UUID.randomUUID().toString(), "090909", "kkkk"
//                , new SimpleDateFormat("yyyy-MM-dd").format(new Date())
//                , new SimpleDateFormat("yyyy-MM-dd").format(new Date())
//                ,"04","07074420310690323262"
//                ,new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "T" + new SimpleDateFormat("hh:mm:ss").format(new Date()) + "+03:00"
//                ,UUID.randomUUID().toString());
//        emp3.setClassificationKMSZ(kmsz);
//        emp3.setTerritories(territories);
//        emp3.setNpaList(npaList);
//
//        List<LocalMSZ> list = new ArrayList<>();
//        list.add(emp1);
//        list.add(emp2);
//        list.add(emp3);
//
//        req = new Request();
////Package
//        PackageKMSZ aPackage = new PackageKMSZ(UUID.randomUUID().toString());
//        req.setAPackage(aPackage);
//        aPackage.setLocalMSZ(list);
//
////            Instant instant = Instant.now();
////            log.info(instant);
//
//        String pattern = "yyyy-MM-dd";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        log.info(simpleDateFormat.format(new Date()));
//
//        log.info("************************************************");

    }



}
