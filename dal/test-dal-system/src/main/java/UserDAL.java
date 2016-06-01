import com.test.common.entity.UserEntity;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * 描述 ：
 *
 * @author : mzb
 * @version : v1.00
 * @CreationDate : 16-6-1 上午9:14
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class UserDAL extends HibernateDaoSupport implements IUserDAL{
    public List<UserEntity> getUsers() {
        return this.getHibernateTemplate().loadAll(UserEntity.class);
    }
}
