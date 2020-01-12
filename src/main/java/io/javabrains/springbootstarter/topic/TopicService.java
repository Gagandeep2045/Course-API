package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics=new ArrayList<Topic>( Arrays.asList(new Topic(1,"Eng"),new Topic(2,"Maths"),new Topic(3,"Economics")));
	//Arrays.asList() returns immutable list which can't be structrually midified i.e cant add or delete elements in it
	
	public List <Topic> getAllTopics()
	{
		
		return topics;
		
		
	}
	
	public Topic getTopic(int id)
	{
		
		return topics.stream().filter(t->t.getTopicId()==id).findFirst().get();	
				}
	
	public void addTopic(Topic t)
	{
		
		topics.add(t);
	}

	public void updateTopic(Topic topic, int id) {
		Topic t1=topics.stream().filter(t->t.getTopicId()==id).findFirst().get();
		t1.setTopicName(topic.getTopicName());
	}

	public void deleteTopic(int topicId) {
		Topic t1=topics.stream().filter(t->t.getTopicId()==topicId).findFirst().get();
		topics.remove(t1);
	}
	
}
/*
1.Services are basically singleton in Spring i.e only once instance of Service class shall be created

2.All controllers having service instance annotated by @Autowired annotation will share same service instance. So its
good to annotate all service instances with @Autowired annotation. This can be verified by getting hashcode value of the service instances
. If not annotated we get diff hashcode value of service instances , else when annotated with @Autowired we get same value
of hashcode

3.Also only one instance of controller created which serves multiple HTTP requests. This again is
verified by same hashcode values of a controller across multiple HTTTP requests

*/