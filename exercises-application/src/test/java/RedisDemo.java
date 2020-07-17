import com.conmela.exercises.ExercisesApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author ysq
 * @version 1.0
 * @date 2020/7/16 16:56
 */
@SpringBootTest(classes = ExercisesApplication.class)
public class RedisDemo {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void RedisTest(){
        ValueOperations<String,Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("demoKey","helloWorld");
        String value = (String )valueOperations.get("demoKey");
        System.out.println(value);

        valueOperations.set("User",new User("01","校长","男"));
        User user = (User)valueOperations.get("User");
        assert user != null;
        System.out.println(user.toString());
    }
}
