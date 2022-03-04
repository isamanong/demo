package com.example.demo;

import com.example.demo.project.mapper.cluster.ClusterMapper;
import com.example.demo.project.mapper.master.MasterMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ClusterMapper clusterMapper;

	@Autowired
	private MasterMapper masterMapper;
	@Test
	void contextLoads()  {
		clusterMapper.get().forEach(System.out::println);
		masterMapper.get().forEach(System.out::println);
	}

}
