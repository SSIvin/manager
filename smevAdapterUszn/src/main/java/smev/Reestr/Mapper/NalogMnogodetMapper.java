package smev.Reestr.Mapper;

import org.springframework.jdbc.core.RowMapper;
import smev.Reestr.Entity2.NalogMnogodetEntity;
import smev.utils.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class NalogMnogodetMapper implements RowMapper<NalogMnogodetEntity> {
    @Override
    public NalogMnogodetEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return NalogMnogodetEntity.builder()
                .idRegion(rs.getShort("ID_REGION"))
                .idSubject(rs.getInt("ID_SUBJECT"))
                .idSubChild(rs.getInt("ID_SUB_CHILD"))
                .parDelo(rs.getString("parDelo"))
                .childDelo(rs.getString("ChildDelo"))
                .parInn(rs.getString("parInn"))
                .parSnils(rs.getString("parSnils"))
                .parBirthday(util.toLocalDate(rs.getDate("parBirthday")))
                .parSurname(rs.getString("parSURNAME"))
                .parName(rs.getString("parNAME"))
                .parSecname(rs.getString("parSECNAME"))
                .parDocType(rs.getString("parDocType"))
                .parDocumentSerie(rs.getString("parDOCUMENT_SERIE"))
                .parDocumentNumber(rs.getString("parDOCUMENT_NUMBER"))
                .parDocumentDate(util.toLocalDate(rs.getDate("parDOCUMENT_DATE")))
                .parDocumentSource(rs.getString("parDOCUMENT_SOURCE"))
                .childInn(rs.getString("ChildInn"))
                .childBirthday(util.toLocalDate(rs.getDate("ChildBirthday")))
                .childSurname(rs.getString("ChildSURNAME"))
                .childName(rs.getString("ChildNAME"))
                .childSecname(rs.getString("ChildSECNAME"))
                .childDocType(rs.getString("ChildDocType"))
                .childDocumentSerie(rs.getString("ChildDOCUMENT_SERIE"))
                .childDocumentNumber(rs.getString("ChildDOCUMENT_NUMBER"))
                .childDocumentDate(util.toLocalDate(rs.getDate("ChildDOCUMENT_DATE")))
                .childDocumentSource(rs.getString("ChildDOCUMENT_SOURCE"))
                .typeDocFile(rs.getInt("TypeDocFile"))
                .kolDocs(rs.getInt("kolDocs"))
                .idDoc(UUID.fromString(rs.getString("idDoc")))
                .countChild(rs.getInt("countChild"))
                .datedoc(util.toLocalDate(rs.getDate("datedoc")))
                .dateClosed(util.toLocalDate(rs.getDate("DATE_CLOSED")))
                .build();
    }
}
