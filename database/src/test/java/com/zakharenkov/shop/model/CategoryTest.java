package com.zakharenkov.shop.model;

import com.zakharenkov.shop.connection.ConnectionManager;
import lombok.Cleanup;
import org.hibernate.Session;
import org.junit.Test;

import java.io.Serializable;

import static org.junit.Assert.assertNotNull;

public class CategoryTest {

    @Test
    public void categoryTest() {
        Category category = Category.builder()
                .name("TEST2")
                .build();

        @Cleanup Session session = ConnectionManager.getSession();
        session.beginTransaction();

        Serializable saveCategoryId = session.save(category);
        session.evict(category);
        Category categoryFind = session.find(Category.class, saveCategoryId);

        assertNotNull(categoryFind);
        session.getTransaction().commit();
    }
}
