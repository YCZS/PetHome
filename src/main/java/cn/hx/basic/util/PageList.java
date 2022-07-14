package cn.hx.basic.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询结果工具类：封装分页查询或高级查询的结果：总数量和当前页数据
 * @author hx
 * @param <T>
 */
@Data
@NoArgsConstructor  //无参构造器，有了有参就没有无参了，需要加上无参
@AllArgsConstructor //全参构造器
public class PageList<T> {
    //总数量
    private Long totals = 0L;
    //当前页数据
    private List<T> data = new ArrayList<>();
}
