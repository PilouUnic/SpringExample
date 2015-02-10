package fr.spring.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.spring.example.dao.impl.BeanDao;

@Service
public class BeanServiceImpl {

	@Autowired
	private BeanDao beanDao;


	@Override
	public String toString() {
		return "BeanService [beanDao=" + beanDao + "]";
	}
}
