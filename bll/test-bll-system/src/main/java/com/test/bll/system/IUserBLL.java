package com.test.bll.system;

import com.test.common.entity.UserEntity;

import java.util.List;

/**
 * 描述 ：
 *
 * @author : mzb
 * @version : v1.00
 * @CreationDate : 16-6-1 上午9:18
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public interface IUserBLL {
    public List<UserEntity> getUsers();
}
