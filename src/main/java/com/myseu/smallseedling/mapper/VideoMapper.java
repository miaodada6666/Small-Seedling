package com.myseu.smallseedling.mapper;

import com.myseu.smallseedling.domain.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VideoMapper {

    @Select("SELECT * FROM video")
    List<Video> findAll();


}
