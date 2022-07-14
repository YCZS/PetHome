package cn.hx.org.mapper;

import cn.hx.org.domain.Department;
import cn.hx.org.query.DepartmentQuery;

import java.util.List;

/**
 * @author hx
 */
public interface DepartmentMapper {
    /**
     * 保存一个对象
     * @param department
     */
    void save(Department department);

    /**
     * 移除一个对象
     * @param id
     */
    void remove(Long id);

    /**
     * 更新一个对象
     * @param department
     */
    void update(Department department);

    /**
     * 加载一个对象
     * @param id
     * @return
     */
    Department loadById(Long id);

    /**
     * 加载所有对象
     * @return
     */
    List<Department> loadAll();

    /**
     * 分页：查询总数量
     * @param query
     * @return
     */
    Long queryCount(DepartmentQuery query);

    /**
     * 分页：查询当前页数据
     * @param query
     * @return
     */
    List<Department> queryData(DepartmentQuery query);
}