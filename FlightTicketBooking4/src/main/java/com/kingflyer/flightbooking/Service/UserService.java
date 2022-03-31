package com.kingflyer.flightbooking.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingflyer.flightbooking.Model.Users;
import com.kingflyer.flightbooking.Repository.UserRepo;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userrepo;
    public boolean addUser(Users users) throws Exception {
        Optional<Users> checkUser = userrepo.findById(users.getId());
        if (!checkUser.isPresent()) {
            userrepo.save(users);
            return true;
        }
        else
            throw new Exception("User with Id:" + users.getId() + " Already Exist");
    }
    public Users getUser(String email) {
        // TODO Auto-generated method stub
        return null;
    }
    public void modifyUser(Users user) {
        // TODO Auto-generated method stub
    }
    public String checkLogin(String email, String password) {
        // TODO Auto-generated method stub
        return "False";
    }
    public void checkLoginByemailandpassword() {
        // TODO Auto-generated method stub
    }
	public Optional<String> checkLoginandpassword(String email, String password) {
		return null;
		// TODO Auto-generated method stub
		
	}
}
