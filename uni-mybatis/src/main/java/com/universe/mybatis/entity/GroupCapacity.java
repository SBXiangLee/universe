package com.universe.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 集群、各Group容量信息表
 * </p>
 *
 * @author dianxiaoer
 * @since 2021-12-22
 */
@TableName("group_capacity")
@ApiModel(value = "GroupCapacity对象", description = "集群、各Group容量信息表")
public class GroupCapacity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("Group ID，空字符表示整个集群")
    private String groupId;

    @ApiModelProperty("配额，0表示使用默认值")
    private Integer quota;

    @ApiModelProperty("使用量")
    private Integer usage;

    @ApiModelProperty("单个配置大小上限，单位为字节，0表示使用默认值")
    private Integer maxSize;

    @ApiModelProperty("聚合子配置最大个数，，0表示使用默认值")
    private Integer maxAggrCount;

    @ApiModelProperty("单个聚合数据的子配置大小上限，单位为字节，0表示使用默认值")
    private Integer maxAggrSize;

    @ApiModelProperty("最大变更历史数量")
    private Integer maxHistoryCount;

    @ApiModelProperty("创建时间")
    private LocalDateTime gmtCreate;

    @ApiModelProperty("修改时间")
    private LocalDateTime gmtModified;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Integer getUsage() {
        return usage;
    }

    public void setUsage(Integer usage) {
        this.usage = usage;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Integer getMaxAggrCount() {
        return maxAggrCount;
    }

    public void setMaxAggrCount(Integer maxAggrCount) {
        this.maxAggrCount = maxAggrCount;
    }

    public Integer getMaxAggrSize() {
        return maxAggrSize;
    }

    public void setMaxAggrSize(Integer maxAggrSize) {
        this.maxAggrSize = maxAggrSize;
    }

    public Integer getMaxHistoryCount() {
        return maxHistoryCount;
    }

    public void setMaxHistoryCount(Integer maxHistoryCount) {
        this.maxHistoryCount = maxHistoryCount;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "GroupCapacity{" +
        "id=" + id +
        ", groupId=" + groupId +
        ", quota=" + quota +
        ", usage=" + usage +
        ", maxSize=" + maxSize +
        ", maxAggrCount=" + maxAggrCount +
        ", maxAggrSize=" + maxAggrSize +
        ", maxHistoryCount=" + maxHistoryCount +
        ", gmtCreate=" + gmtCreate +
        ", gmtModified=" + gmtModified +
        "}";
    }
}
