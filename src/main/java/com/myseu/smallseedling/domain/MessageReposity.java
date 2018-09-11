package com.myseu.smallseedling.domain;

import com.myseu.smallseedling.mapper.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageReposity extends JpaRepository<Message,Integer> {

}
