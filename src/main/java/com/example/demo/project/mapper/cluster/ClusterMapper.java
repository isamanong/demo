package com.example.demo.project.mapper.cluster;

import com.example.demo.project.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClusterMapper {
	List<User> get();
}
