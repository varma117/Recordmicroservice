package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;
@Service
public class RecordServiceImpl implements IRecordService{
	
List<Record> list = List.of(
	new Record(1L,"TATA","tata@gmail.com",123L),
	new Record(1L,"Infosys","Infosys@gmail.com",124L),
	new Record(1L,"CTC","ctc@gmail.com",123L),
	new Record(1L,"UST","ust@gmail.com",125L),
	new Record(1L,"Deloit","deloit@gmail.com",126L));

	
	@Override
	public List<Record> getRecordsOfEmployee(Long eId) {
		
		return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());

}}
