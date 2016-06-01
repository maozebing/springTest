package com.test.bll.system;

import com.test.common.entity.UserEntity;
import com.test.dal.system.IUserDAL;

import java.util.List;

/**
 * 描述 ：
 *
 * @author : mzb
 * @version : v1.00
 * @CreationDate : 16-6-1 上午9:19
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class UserBLL implements IUserBLL{
    private IUserDAL userDAL;
    public List<UserEntity> getUsers() {
        return userDAL.getUsers();
    }

    public void setUserDAL(IUserDAL userDAL) {
        this.userDAL = userDAL;
    }
}
