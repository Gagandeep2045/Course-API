package io.javabrains.springbootstarter.hello;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;
import io.javabrains.springbootstarter.topic.TopicService;

@RestController()
/*Controller is class in java that has Controller annotation over it
It perform mapping of url to a method which is executed when a HTTP request is made for that URL

Controller are classes which map URI and HTTP method to some functionality i.e java method
 */
@RequestMapping("/hello")
public class HelloController {

	@Autowired //If not autowired a separate instance of service created
	TopicService topicService;// = new TopicService();
	//no need to instantiate it the Spring automatically injects the Service instance by looking at Autowired annotation

	@RequestMapping("/him") 
	public String hi()
	{
		
		return "hello";
		
	}

@RequestMapping("/top_check")
public List<Topic> getTopics()
{System.out.println("Hascode value of Topiuc Service  in Hello Controller"+topicService.hashCode());
	return topicService.getAllTopics();
}

}
