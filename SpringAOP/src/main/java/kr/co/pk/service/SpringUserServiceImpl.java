package kr.co.pk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.co.pk.dao.SpringUserDAO;
import kr.co.pk.domain.SpringUser;

@Service
public class SpringUserServiceImpl implements SpringUserService {

	@Autowired
	private SpringUserDAO SpringUserDao;
	
	@Override
	public SpringUser login(SpringUser SpringUser) {
		return SpringUserDao.login(SpringUser);
	}

}
