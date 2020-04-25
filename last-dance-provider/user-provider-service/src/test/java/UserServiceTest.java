import com.dominikyang.lastdance.provider.api.UserService;
import com.dominikyang.lastdance.provider.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Wei yuyaung
 * @date 2020.04.16 16:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Resource
    UserService userService;

    @Test
    public void insertUserTest() {
        User user = new User();
        user.setUserName("admin");
    }
}
