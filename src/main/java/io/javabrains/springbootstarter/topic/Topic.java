package io.javabrains.springbootstarter.topic;

import java.io.Serializable;


/*JavaBeans are classes that encapsulate many objects into a single object (the bean). 
 * They are serializable, have a zero-argument constructor,
 
 *  and allow access to properties using getter and setter methods./*
 */
public class Topic  {  //wont work without getters and setters.. working without implementing serializable

	private int topicId;
	
		public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

		private String topicName;

	public Topic(int topicId, String topicName) {
		this.topicId = topicId;
		this.topicName = topicName;
	}
	
	public Topic() // this is must
	{}
	
}
