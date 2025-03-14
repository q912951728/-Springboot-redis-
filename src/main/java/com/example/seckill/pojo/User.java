package com.example.seckill.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
*  张是小
* @author zsx
*/
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id，手机号码
     */
    private Long id;

    private String nickname;

    /**
     * MD5(MD5(pass明文+固定slat)+slat)
     */
    private String password;

    private String slat;

    /**
     * 头像
     */
    private String head;

    /**
     * 注册时间
     */
    private Date registerDate;

    /**
     * 上次登录时间
     */
    private Date lastLoginTime;

    /**
     * 登录次数
     */
    private Integer loginCount;


}
