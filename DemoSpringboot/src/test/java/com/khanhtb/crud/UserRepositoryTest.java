package com.khanhtb.crud;


import com.khanhtb.crud.User.User;
import com.khanhtb.crud.User.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

@Rollback(value = false)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repo;

//    @Test
//    public void testAddNew(){
//        User user = new User();
//        user.setEmail("Baokhanh1306@gmail.com");
//        user.setPassWord("123454");
//        user.setFirsName("trinh Bao");
//        user.setLastName("Khanh");
//
//        User savedUser = repo.save(user);
//        Assertions.assertThat(savedUser).isNotNull();
//        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
//    }

    @Test
    public void testList() {
        Iterable<User> users = repo.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);

        for (User user : users){
            System.out.println(user);
        }

    }
//
//        @Test
//    public void testUpdate(){
//        Integer id=1;
//        Optional<User> optionalUser = repo.findById(id);
//        User user=optionalUser.get();
//        user.setPassWord("123456789");
//        repo.save(user);
//
//        User updatedUser=repo.findById(id).get();
//        Assertions.assertThat(updatedUser.getPassWord()).isEqualTo("123456789");
//    }
//
//    @Test
//    public void testGet(){
//        Integer id=1;
//        Optional<User> optionalUser = repo.findById(id);
//        Assertions.assertThat(optionalUser).isPresent();
//        System.out.println(optionalUser);
//    }
//
//    @Test
//    public void testDelete(){
//        Integer id=9;
//        repo.deleteById(id);
//        Optional<User> optionalUser = repo.findById(id);
//        Assertions.assertThat(optionalUser).isNotPresent();
//    }


}
