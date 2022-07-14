package cn.hx.org.serivce.Impl;

import cn.hx.basic.util.PageList;
import cn.hx.org.domain.Department;
import cn.hx.org.mapper.DepartmentMapper;
import cn.hx.org.query.DepartmentQuery;
import cn.hx.org.serivce.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



/**
 * //业务实现类:部门
 * //查询的方法比较多，使用查询的事务配置
 * //只读，事务传播机制=SUPPORTS，有我就用，没有事务就不用
 * @author hx
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Transactional//默认只读为false，默认传播机制为REQUIRED[有且仅有一个事务]
    @Override
    public void add(Department department) {
        departmentMapper.save(department);
    }

    @Transactional
    @Override
    public void del(Long id) {
        departmentMapper.remove(id);
    }

    @Transactional
    @Override
    public void update(Department department) {
        departmentMapper.update(department);
    }

    @Override
    public Department findById(Long id) {
        return departmentMapper.loadById(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentMapper.loadAll();
    }

    @Override
    public PageList<Department> queryPage(DepartmentQuery query) {
        Long count = departmentMapper.queryCount(query);
        if(count < 1){
            return new PageList<Department>();
        }

        List<Department> list = departmentMapper.queryData(query);

        return new PageList<Department>(count,list);
    }
}