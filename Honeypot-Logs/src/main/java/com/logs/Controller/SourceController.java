package com.logs.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.logs.model.Source;
import com.logs.repository.SourceRepository;

@RestController
@RequestMapping("/log")
public class SourceController {
	
	/**
	 * @Controls the http methods for insertion and retrieval
	 */
	@Autowired
	SourceRepository rep;
	
    @RequestMapping(method = RequestMethod.POST, path = "/insert")
    public @ResponseBody String insertLog(@RequestBody Source source) {
		
        try {
            rep.save(source);
            return "Inserted :"+source;
        } catch (Exception e) {
            return e.getMessage();
       }
    }
		
    
    @RequestMapping(method = RequestMethod.GET, path = "/show")
    public @ResponseBody List<Source> getLogs() 
    {
		List<Source> logs = rep.findAll();
        return logs;
    }
		

}
