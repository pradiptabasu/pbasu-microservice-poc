package org.sameerean.springcrud.api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.sameerean.springcrud.api.model.APIResponse;
import org.sameerean.springcrud.api.model.User;
import org.sameerean.springcrud.usermanagement.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Callable<APIResponse> getUser(@PathVariable(value = "id") final String pid) {
		return new Callable<APIResponse>() {
			@Override
			public APIResponse call() throws Exception {
				try {
					org.sameerean.springcrud.usermanagement.jpa.entity.User entity = userService.getUserByPid(pid);
					if(entity == null) {
						logger.error("Failure: no result");
						return new APIResponse("FAILURE", "No result found", null);
					} else {
						return new APIResponse("OK", "User successfully loaded", new User(entity));
					}
				} catch (Exception ex) {
					logger.error("Error: ", ex);
					return new APIResponse("ERROR", ex.getMessage(), null);
				}
			}
		};
	}
/*
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Callable<APIResponse> getUser(@PathVariable(value = "id") String pid) {
		return new Callable<APIResponse>() {
			@Override
			public APIResponse call() throws Exception {
				try {
					return new APIResponse(
							"OK",
							"User Loaded successfully!",
							new User("u12234", "sameerean", "Shameer",
									"Kunjumohamed",
									"https://avatars1.githubusercontent.com/u/6382917"));
				} catch (Exception ex) {
					logger.error("Failed to process report", ex);
					return new APIResponse("ERROR", ex.getMessage(), null);
				}
			}
		};
	}
*//**
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Callable<APIResponse> getUsers() {
		logger.info(">>>>>>>>>>>>>>>>>>>>. HEeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		return new Callable<APIResponse>() {
			@Override
			public APIResponse call() throws Exception {
				try {
					List<User> users = new ArrayList<User>();
					users.add(new User("u12234", "sameerean", "Shameer",
							"Kunjumohamed",
							"https://avatars1.githubusercontent.com/u/6382917"));
					users.add(new User("u12245", "zaki", "Zaki", "Mirza",
							"http://lol-rofl.com/wp-content/uploads/2014/08/Boy_Face1.gif"));
					return new APIResponse("OK", "Users loaded successfully",
							users);
				} catch (Exception ex) {
					logger.error("Failed to process report", ex);
					return new APIResponse("ERROR", ex.getMessage(), null);
				}
			}
		};
	}
	**/

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Callable<APIResponse> getUsers() {
		return new Callable<APIResponse>() {
			@Override
			public APIResponse call() throws Exception {
				try {
					return new APIResponse("OK", "Users loaded successfully",
							userEntityListToUserModelList(userService.getAllUsers()));
				} catch (Exception ex) {
					logger.error("Error: ", ex);
					return new APIResponse("ERROR", ex.getMessage(), null);
				}
			}
		};
	}
	
	private List<User> userEntityListToUserModelList(List<org.sameerean.springcrud.usermanagement.jpa.entity.User> entities) {
		if(!CollectionUtils.isEmpty(entities)) {
			List<User> models = new ArrayList<User>(entities.size());
			for (org.sameerean.springcrud.usermanagement.jpa.entity.User entity : entities) {
				models.add(new User(entity));
			}
			return models;
		}
		return null;
	}

}
