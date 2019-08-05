package com.example.demo.xfs;

import com.example.demo.xfs.Xfs;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface XfsRepository extends MongoRepository <Xfs, Long>{

	Xfs findBy_id(ObjectId _id);
	

	
	
}