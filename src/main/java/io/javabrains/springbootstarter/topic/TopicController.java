package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController()
@CrossOrigin(origins = "http://localhost:4200")
@Api(value="courseStore", description="Operations pertaining to courses in curriculum")  //configuring meassage for swagger
public class TopicController {

	@Autowired() //If not autowired a separate instance of service created , verify it with diff hashcode values
	private  TopicService topicService;// = new TopicService();;
	//no need to instantiate it the Spring automatically injects the Service instance by looking at Autowired annotation
	
	@ApiOperation(value="Get all Topics",response=List.class) //Configuring message for this rest endpoint in swagger
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved listgagan"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	@RequestMapping(value="/topics",method=RequestMethod.GET)
	public List<Topic> getTopics()
	{List <Topic>l= topicService.getAllTopics();
	
	System.out.println("Hascode value of Topiuc Service  in Topic Controller"+topicService.hashCode());
	return l;
	}	

	
	@RequestMapping("/see")
	public String p()
	{
		
		return "hello";
		
	}
	

	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable() int id)
	{
		return topicService.getTopic(id);
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody()Topic topic)
	{
		
		topicService.addTopic(topic);
	}


@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
public void updateTopic(@RequestBody()Topic topic,@PathVariable int id)
{
topicService.updateTopic(topic,id);	

}


@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
public void deleteTopic(@PathVariable("id") int topicId)
{
	
topicService.deleteTopic(topicId);
}



}
