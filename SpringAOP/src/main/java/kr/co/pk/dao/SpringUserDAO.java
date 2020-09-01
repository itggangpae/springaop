package kr.co.pk.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.pk.domain.SpringUser;

@Repository
public class SpringUserDAO{
	@Autowired
	private SqlSession sqlSession;
	
	public SpringUser login(SpringUser boxer) {
		return sqlSession.selectOne("springuser.login", boxer);
	}
}
