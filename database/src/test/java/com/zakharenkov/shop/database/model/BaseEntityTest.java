//package com.zakharenkov.shop.database.model;
//
//
//import com.zakharenkov.shop.database.configuration.DatabaseConfiguration;
//import lombok.Data;
//import lombok.Getter;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.io.Serializable;
//
//import static org.junit.Assert.assertNotNull;
//
//@Getter
//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = DatabaseConfiguration.class)
//@Transactional
//public class BaseEntityTest {
//
//    @Autowired
//    public SessionFactory sessionFactory;
//
//    @Test
//    public void check() {
//        Category category = Category.builder()
//                .name("TESssssT2")
//                .build();
//
//        Session session = sessionFactory.getCurrentSession();
//
//        Serializable saveCategoryId = session.save(category);
//        session.evict(category);
//        Category categoryFind = session.find(Category.class, saveCategoryId);
//
//        assertNotNull(categoryFind);
//    }
//}
