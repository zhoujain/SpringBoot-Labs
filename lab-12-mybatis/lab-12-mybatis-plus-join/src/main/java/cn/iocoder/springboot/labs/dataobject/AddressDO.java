package cn.iocoder.springboot.labs.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @ClassName AddressDO
 * @Description
 * @Author zhoujian
 * @Time 2024/8/15 12:06
 * @Version 1.0
 */
@TableName("address")
public class AddressDO {
    private Long id;
    private Long userId;
    private String city;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
