package com.DOH.DOH.mapper.list;

import com.DOH.DOH.dto.list.ContestListDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ContestListMapper {
    public ArrayList<ContestListDTO> getContestList();
}
