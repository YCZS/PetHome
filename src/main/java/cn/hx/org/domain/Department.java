package cn.hx.org.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 实体类:部门
 * @author hx
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department{
    //部门ID
    private Long id;
    //部门编号
    private String sn;
    //部门名称
    private String name;
    //部门路径
    private String dirPath;
    //部门状态：1启用,0禁用
    private Integer state = 1;
    //部门经理ID
    private Long manager_id;
    //经理对象
    private Employee manager;
    //上级部门ID
    private Long parent_id;
    //部门对象
    private Department dept;
    //多个部门对象
    private List<Department> depts;

}