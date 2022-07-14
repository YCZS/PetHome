package cn.hx.basic;

import lombok.Data;

/**
 * 公共查询类
 * @author wq
 */
@Data
public class BaseQuery {
    //当前页
    private Integer currentPage = 1;
    //每一页显示的条数
    private Integer pageSize = 5;
    //根据当前页和每页显示的数据计算limit的第一个参数 = 当前的起始下标
    public Integer getBegin(){
        return (this.currentPage - 1) * this.pageSize;
    }
}