package smev.Reestr.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import smev.Reestr.Entity2.SubjectReestr;

import java.util.List;

@Component
@Mapper
public interface SubjectReestrDao {

    List<SubjectReestr> selectAll();

    int deleteByPrimaryKey(SubjectReestr key);

    int insert(SubjectReestr record);

    void Batchinsert(@Param("list") List<SubjectReestr> list);

    int insertSelective(SubjectReestr record);

    SubjectReestr selectByPrimaryKey(SubjectReestr key);

    int updateByPrimaryKeySelective(SubjectReestr record);

    int updateByPrimaryKey(SubjectReestr record);
}
