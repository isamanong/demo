package com.example.demo.project.mapper.master;

import com.example.demo.project.domain.VueBlog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MasterMapper {

	List<VueBlog> get();
}
