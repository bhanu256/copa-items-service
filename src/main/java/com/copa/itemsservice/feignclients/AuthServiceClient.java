package com.copa.itemsservice.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="AUTH-SERVICE")
public interface AuthServiceClient {
	
	@PostMapping("auth/verify")
	public boolean isUserValid();

}
