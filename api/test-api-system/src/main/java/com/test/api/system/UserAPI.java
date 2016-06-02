package com.test.api.system;

import com.test.bll.system.IUserBLL;
import com.test.common.cache.SpringContextUtil;
import com.test.common.entity.RoleEntity;
import com.test.common.entity.UserEntity;

import javax.swing.plaf.PanelUI;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * 描述 ：
 *
 * @author : mzb
 * @version : v1.00
 * @CreationDate : 16-6-1 上午9:22
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
@Path("users")
public class UserAPI {
    private static final String USERBLL_BEANID="userBLL";
    private IUserBLL userBLL=(IUserBLL) SpringContextUtil.getBean(USERBLL_BEANID);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers(){
    List<UserEntity> list=userBLL.getUsers();
    return Response.ok(list).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void postData(RoleEntity entity){
        System.out.print(11);
    }
}
