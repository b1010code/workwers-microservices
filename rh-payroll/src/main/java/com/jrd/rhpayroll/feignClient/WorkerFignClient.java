package com.jrd.rhpayroll.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jrd.rhpayroll.model.Worker;


@Component
@FeignClient(name = "rh-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFignClient {
	
	@GetMapping("/{id}")
	ResponseEntity<Worker> findById(@PathVariable(value = "id") Long id); 	

}
