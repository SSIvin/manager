package smev.FRI.Dao;



import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import smev.ElementServices.Fri.ВыпискаФРИ;
import smev.FRI.Enum.StateOrdering;

import java.sql.Types;
import java.util.UUID;

@Repository
@Log4j2
public class FriDaoImpl implements FriDao {



    @Autowired
    @Qualifier("jdbcFriNamed")
    private NamedParameterJdbcTemplate friJdbcNamed;


    @Override
    public void insertOrdering() {

    }

    @Override
    public Integer insert(ВыпискаФРИ выпискаФРИ, UUID messageId) {
        return friJdbcNamed.update(SQLFRI.INSERT_ORDERING
                ,setParam(выпискаФРИ, messageId));
    }

    private MapSqlParameterSource setParam(ВыпискаФРИ выпискаФРИ, UUID messageId) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource
                .addValue("ID_ORDERING", выпискаФРИ.getИдентификатор(), Types.VARCHAR)
                .addValue("MESSAGE_ID", messageId.toString(), Types.VARCHAR)
                .addValue("SNILS", выпискаФРИ.getПерсональныеДанные().getСНИЛС().replace("-","").replace(" ",""), Types.VARCHAR)
                .addValue("[STATE]", StateOrdering.NEW.name(), Types.VARCHAR);

        return parameterSource;

    }


    @Override
    public void insert(ВыпискаФРИ.ВсеДокументы.Документ документ, String orderingId) {
        friJdbcNamed.update(SQLFRI.INSERT_DOCUMENT
                ,setParam(документ, orderingId));
    }

    private MapSqlParameterSource setParam(ВыпискаФРИ.ВсеДокументы.Документ документ, String orderingId) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource
                .addValue("ID_DOCUMENT", документ.getРеквизитыДокумента().getID(), Types.VARCHAR)
                .addValue("ORDERING_ID", orderingId, Types.VARCHAR);

        return parameterSource;

    }


    @Override
    public void insert(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись запись, String documentId) {
        friJdbcNamed.update(SQLFRI.INSERT_ZAPIS
                ,setParam(запись, documentId));
    }

    private MapSqlParameterSource setParam(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись запись, String documentId) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource
                .addValue("ID_ZAPIS", запись.getИдентификаторОбъекта(), Types.BIGINT)
                .addValue("DOCUMENT_ID", documentId, Types.VARCHAR)
                .addValue("[KEY]", запись.getКлюч(), Types.VARCHAR)
                .addValue("PARENT", запись.getКлюч(), Types.VARCHAR)
                .addValue("KOD", запись.getКатегория().getКод(), Types.VARCHAR)
                .addValue("[NAME]", запись.getКатегория().getНаименование(), Types.VARCHAR)
                .addValue("TARGET", запись.getКатегория().getНазначение(), Types.VARCHAR);

        return parameterSource;

    }

    @Override
    public void insert(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты.Атрибут атрибут, Long zapisId, String documentId) {
        friJdbcNamed.update(SQLFRI.INSERT_ATTRIBUT
                ,setParam(атрибут, zapisId, documentId));
    }

    private MapSqlParameterSource setParam(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты.Атрибут атрибут, Long zapisId, String documentId) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource
                .addValue("KOD", атрибут.getКод(), Types.VARCHAR)
                .addValue("ZAPIS_ID", zapisId, Types.BIGINT)
                .addValue("DOCUMENT_ID", documentId, Types.VARCHAR)
                .addValue("[NAME]", атрибут.getНаименование(), Types.VARCHAR)
                .addValue("[TYPE]", атрибут.getТипДанных(), Types.VARCHAR)
                .addValue("VALUE", атрибут.getЗначение(), Types.VARCHAR);

        return parameterSource;

    }


}
