package com.chinasoft;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//��������spring��junit��junit����ʱ����springIOC����
@RunWith(SpringJUnit4ClassRunner.class) //����junit spring�����ļ���λ��
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}