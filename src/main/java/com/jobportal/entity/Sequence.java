package com.jobportal.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document 
public class Sequence {
   @Id
   private String id;
   private Long seq;
   public Long getSeq() {
	return seq;
   }
   public void setSeq(Long seq) {
	this.seq = seq;
   }
   
}
