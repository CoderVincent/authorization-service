import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsn.dao.User_roleMapper;
import com.wsn.pojo.User_role;

@Service
public class DaoTest {
	@Autowired
	private User_roleMapper userRoleMapper;
	
	@Test
	public void queryUR(){
		System.out.print(userRoleMapper);
		User_role urm = userRoleMapper.selectURByUid(1);
	}
}
