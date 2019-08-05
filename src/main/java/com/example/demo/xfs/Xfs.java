package com.example.demo.xfs;

import com.example.demo.xfs.XfsRepository;
//import com.example.demo.xfs.Xfs;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document (collection="XfsStatus")

public class Xfs {
  @Id
  public ObjectId _id;
  public String bNumber;
  public String bUrl;
  public String buildStatus;
 
  
  // Constructors
  public Xfs() {}
  
  public Xfs(ObjectId id, String bNumber ,String bUrl,String buildStatus ) {
	  super();
    this._id = id;
    this.bNumber= bNumber;
    this.bUrl= bUrl;
    this.buildStatus=buildStatus;
    
  }
  
  // ObjectId needs to be converted to string
  public  String get_id() {
	  return _id.toHexString(); 
  }
  public  void set_id(ObjectId _id) {
	  this._id = _id; 
}
  
  public String getNumber() { 
	  return bNumber; 
	  }
  public String getBuildStatus() {
	return buildStatus;
}

public void setBuildStatus(String buildStatus) {
	this.buildStatus = buildStatus;
}

public void setNumber(String number) { 
	  this.bNumber = number;
  }
  
  public String getUrl() {
	  return bUrl;
	 }
  public void setUrl(String url) { 
	  this.bUrl = url; 
	  }
  
  
  
}