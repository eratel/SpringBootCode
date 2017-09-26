package com.example.demo.maper;

import com.example.demo.pojo.Cat;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author:jikai.sun
 * @Date: Created in 2017 15:30 2017/9/10 0010
 */
public interface CatMapper {
    @Select("select * from cat where name = #{name}")
    public List<Cat> likename(String name);

    @Insert("insert into cat(age,name) values(#{age},#{name})")
    //添加主键自增长策略             //实体的id          //对应的数据库id
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    //返回值是保存的条数
    public int save(Cat cat);

    @Update("update cat set name = #{name} where id = #{id}")
    public int update(Cat cat);

    @Delete("delete from cat where id = #{id}")
    public int delete(int id);

    @Select("select * from cat")
    public List<Cat> selectAll();

    @Select("select * from cat where id = #{id} and name = #{name}")
    public Cat selectByid(@Param("id") int id, @Param("name") String name);

    @Select("select * from cat where age_a = #{age}")
    @Results({
            @Result(property = "age", column = "age_a"),
             //@Result(property = "sexEum",column = "sex_eum",javaType = SexEum.class)
    })
    public Cat selectByAge(@Param("age") int age);

    @Select("<script>" +
            "select * from cat where" +
            "  1=1" +
            " <if test = 'name != null'>and name = #{name}</if>" +
            " <if test = 'age != 0'>and age_a = #{age}</if>" +
            "</script>")
    @Results({
            @Result(property = "age", column = "age_a"),
            //@Result(property = "sexEum",column = "sex_eum",javaType = SexEum.class)
    })
    public List<Cat> select6(Cat cat);
}


















