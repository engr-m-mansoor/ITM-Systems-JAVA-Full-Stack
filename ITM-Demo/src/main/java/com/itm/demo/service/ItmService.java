package com.itm.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ItmService implements ItmServiceInterface {
public List<String> getStudents()
{
	return (List<String>) Arrays.asList("Mansoor","Ayaz");
}
}
