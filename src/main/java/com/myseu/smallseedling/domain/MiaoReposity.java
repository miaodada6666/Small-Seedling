package com.myseu.smallseedling.domain;

import com.myseu.smallseedling.mapper.Miao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MiaoReposity extends JpaRepository<Miao,Integer> {


    List<Miao> findByzhanghao(String zhanghao);
}
