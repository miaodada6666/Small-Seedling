package com.myseu.smallseedling;

import com.myseu.smallseedling.domain.Video;
import com.myseu.smallseedling.mapper.VideoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmallseedlingApplicationTests {

	@Autowired
	private VideoMapper videoMapper;

	@Test
    public void test(){

	    List<Video> videos = videoMapper.findAll();
	    System.out.println(videos.size());

    }

	@Test
	public void contextLoads() {

	}

}
