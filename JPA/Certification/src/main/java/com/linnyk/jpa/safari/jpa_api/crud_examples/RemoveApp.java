package com.linnyk.jpa.safari.jpa_api.crud_examples;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import com.linnyk.jpa.safari.entities.embedded.Bank;
import com.linnyk.jpa.safari.jpa_api.configuration.JPAFactoryBuilder;

public class RemoveApp {

	@Test
	public void testRemoving() {
		final EntityManagerFactory entityManagerFactory = JPAFactoryBuilder.getEntityManagerFactory();
		final EntityManager entityManager = entityManagerFactory.createEntityManager();
		final EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		final Bank bank = entityManager.find(Bank.class, 1L);
		// select bank0_.BANK_ID as BANK_ID1_1_0_, bank0_.ADDRESS_LINE_1 as ADDRESS_2_1_0_, bank0_.ADDRESS_LINE_2 as ADDRESS_3_1_0_, bank0_.CITY as CITY4_1_0_, bank0_.STATE as STATE5_1_0_, bank0_.ZIP_CODE as ZIP_CODE6_1_0_, bank0_.CREATED_BY as CREATED_7_1_0_, bank0_.CREATED_DATE as CREATED_8_1_0_, bank0_.IS_INTERNATIONAL as IS_INTER9_1_0_, bank0_.LAST_UPDATED_BY as LAST_UP10_1_0_, bank0_.LAST_UPDATED_DATE as LAST_UP11_1_0_, bank0_.NAME as NAME12_1_0_ from BANK bank0_ where bank0_.BANK_ID=?
		System.out.println(entityManager.contains(bank)); //true

		entityManager.remove(bank);
		System.out.println(entityManager.contains(bank)); //false

		transaction.commit();
		// delete from BANK_CONTACT where BANK_ID=?
		// delete from BANK where BANK_ID=?

		entityManager.close();
		entityManagerFactory.close();
	}
}
