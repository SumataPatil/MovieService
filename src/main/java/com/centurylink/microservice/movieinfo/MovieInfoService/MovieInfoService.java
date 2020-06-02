package com.centurylink.microservice.movieinfo.MovieInfoService;

import java.util.Collections;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MovieInfoService {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MovieInfoService.class);
	@RequestMapping("/getMovie/{movieId}")
	public MovieInfo getMovie(@PathVariable ("movieId") String movieId)
	{
		log.info("hiii");
		return 
				new MovieInfo(1,movieId) ;
	}

}
