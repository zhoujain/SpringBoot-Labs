package cn.iocoder.springboot.labs.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @ClassName UserDO
 * @Description
 * @Author zhoujian
 * @Time 2024/8/15 12:06
 * @Version 1.0
 */
@TableName("user")
public class UserDO {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
