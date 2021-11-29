package com.aliyun.gts.gmall.center.user.domain.basic;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @ClassName: BaseEntity
 * @Description: 实体类基类
 * @author lucian
 * @date 2016年8月3日下午5:16:21
 * @version V1.0
 *
 */

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1333088861521L;

    /**
     * @Fields id : 主键ID
     */
    @TableId(type= IdType.AUTO)
    private Long id;

    /**
     * @Fields gmtCreate : 创建时间
     */
    @TableField(fill= FieldFill.INSERT)
    private Date gmtCreate;

    /**
     * @Fields createId : 创建人
     */
    @TableField(fill= FieldFill.INSERT)
    private String createId;

    /**
     * @Fields gmtModified : 更新时间
     */
    @TableField(fill= FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    /**
     * @Fields updateId : 更新人
     */
    @TableField(fill= FieldFill.INSERT_UPDATE)
    private String updateId;

    /**
     * @Fields deleted : 删除标识
     */
    @TableLogic
    @TableField(select=false,fill= FieldFill.INSERT)
    private Boolean deleted;

    /** 分页标识符 **/
    @TableField(exist = false)
    private String pageFlag = "true";

    /** 第几页 **/
    @TableField(exist = false)
    private Integer page;

    /** 每页显示的条数 **/
    @TableField(exist = false)
    private Integer limit;

    /** 排序字段  默认主键ID **/
    @TableField(exist = false)
    private String sort = "id";

    /** 排序方式  默认降序 **/
    @TableField(exist = false)
    private String order = "desc";


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getGmtCreate() {
        return gmtCreate == null ? null : (Date) gmtCreate.clone();
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate == null ? null : (Date) gmtCreate.clone();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getGmtModified() {
        return gmtModified == null ? null : (Date) gmtModified.clone();
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified == null ? null : (Date) gmtModified.clone();
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getPageFlag() {
        return pageFlag;
    }

    public void setPageFlag(String pageFlag) {
        this.pageFlag = pageFlag;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

}
