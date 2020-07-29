package com.nmbiss.shop.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author rong
 */
@Data
public class Orders {
    private Integer id;

    private Date createTime;

    private Date completeTime;

    private String address;

    private Integer count;

    private String remarks;

    private BigDecimal price;

    private String state;

    private Integer sendDealerId;

    private String productId;

    private String getDealerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getSendDealerId() {
        return sendDealerId;
    }

    public void setSendDealerId(Integer sendDealerId) {
        this.sendDealerId = sendDealerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getGetDealerId() {
        return getDealerId;
    }

    public void setGetDealerId(String getDealerId) {
        this.getDealerId = getDealerId == null ? null : getDealerId.trim();
    }
}