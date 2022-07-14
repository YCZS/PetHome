package cn.hx.org.serivce;

import cn.hx.basic.util.PageList;
import cn.hx.org.domain.Department;
import cn.hx.org.query.DepartmentQuery;

import java.util.List;

/**
 * 业务接口:部门
 * @author hx
 */
public interface IDepartmentService {
    /**
     * 添加一个对象
     * @param department
     */
    void add(Department department);

    /**
     * 删除一个对象
     * @param id
     */
    void del(Long id);

    /**
     * 更新一个对象
     * @param department
     */
    void update(Department department);

    /**
     * 获取一个对象
     * @param id
     * @return
     */
    Department findById(Long id);

    /**
     * 获取所有对象
     * @return
     */
    List<Department> findAll();

    /**
     * 分页查询
     * @param query
     * @return
     */
    PageList<Department> queryPage(DepartmentQuery query);
}