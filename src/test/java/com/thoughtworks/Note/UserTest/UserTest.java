package com.thoughtworks.Note.UserTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.Note.User.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {

    @Test
    void gettingSameUSerNameAfterSerialization() throws JsonProcessingException {
        User userOne = new User("avani", "101");
        ObjectMapper objectMapper = new ObjectMapper();
        String exceptedString = objectMapper.writeValueAsString(userOne);
        Assertions.assertTrue(exceptedString.contains("\"userName\":\"avani\""));


    }
}
