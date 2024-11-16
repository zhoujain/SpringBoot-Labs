package cn.iocoder.springboot.labs;

import cn.iocoder.springboot.labs.dataobject.AddressDO;
import cn.iocoder.springboot.labs.dataobject.UserDO;
import cn.iocoder.springboot.labs.dataobject.UserDTO;
import cn.iocoder.springboot.labs.mapper.UserMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        MPJLambdaWrapper<UserDO> wrapper = new MPJLambdaWrapper<UserDO>()
                .selectAll(UserDO.class)//查询user表全部字段
                .select(AddressDO::getCity, AddressDO::getAddress)
                .leftJoin(AddressDO.class, AddressDO::getUserId, UserDO::getId);

        List<UserDTO> userList = userMapper.selectJoinList(UserDTO.class, wrapper);

        userList.forEach(System.out::println);
    }

    @Test
    public void testUpdateById() {

    }

    @Test
    public void testDeleteById() {

    }

    @Test
    public void testSelectById() {
        userMapper.selectById(1);
    }

    @Test
    public void testSelectByUsername() {

    }

    @Test
    public void testSelectByIds() {

    }

    @Test
    public void testSelectPageByCreateTime() {

    }

}
