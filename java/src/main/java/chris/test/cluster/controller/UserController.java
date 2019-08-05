package chris.test.cluster.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import chris.test.cluster.entity.User;
import chris.test.cluster.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Resource
	UserRepository userRepo;
	
	@RequestMapping(method = RequestMethod.POST)
	public User addUser(@RequestParam(value = "username", required = true) String username
			, @RequestParam(value = "nickname", required = true) String nickname
			, @RequestParam(value = "number", required = true) String number) {
		User user = new User(1L, username, nickname, number);
		return userRepo.save(user);
	}
	
	@RequestMapping(value = "/{uid}", method = RequestMethod.PUT)
	public User editUser(@PathVariable(value = "id", required = true) Long id
			, @RequestParam(value = "username", required = true) String username
			, @RequestParam(value = "nickname", required = true) String nickname
			, @RequestParam(value = "number", required = true) String number) {
		User user = new User(id, username, nickname, number);
		return userRepo.save(user);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUser() {
		return userRepo.findAll();
	}
	
	@RequestMapping(value = "/{uid}", method = RequestMethod.GET)
	public User getUser(@PathVariable(value = "uid", required = true) Long uid) {
		return userRepo.getOne(uid);
	}
	
	@RequestMapping(value = "/{uid}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable(value = "uid", required = true) Long uid) {
		userRepo.deleteById(uid);
	}

}
