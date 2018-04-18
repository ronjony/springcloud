package ronjony.com.common.domain.customer;


import ronjony.com.common.utils.AbstractSerial;

import java.util.Date;

/**
 * cloud split mysql实体
 *
 * @author ronjony
 * @version 1.0.0 初始化
 * @date 2018-04-17 17:18:43
 * Copyright 本内容仅限于开源项目公司内部传阅，禁止外泄以及用于其他的商业目的
 */
 public class OwnersDo extends AbstractSerial {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    private Long id;

    /**
     *
     */
    private String firstName;

    /**
     *
     */
    private String lastName;

    /**
     *
     */
    private String address;

    /**
     *
     */
    private String city;

    /**
     *
     */
    private String telephone;


    /**
     * 获取主键Id
     *
     * @return id
     */
    public Long getId(){
      return id;
    }

    /**
     * 设置主键Id
     *
     * @param 要设置的主键Id
     */
    public void setId(Long id){
      this.id = id;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getFirstName(){
      return firstName;
    }

    /**
     * 设置
     *
     * @param firstName 要设置的
     */
    public void setFirstName(String firstName){
      this.firstName = firstName;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getLastName(){
      return lastName;
    }

    /**
     * 设置
     *
     * @param lastName 要设置的
     */
    public void setLastName(String lastName){
      this.lastName = lastName;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getAddress(){
      return address;
    }

    /**
     * 设置
     *
     * @param address 要设置的
     */
    public void setAddress(String address){
      this.address = address;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getCity(){
      return city;
    }

    /**
     * 设置
     *
     * @param city 要设置的
     */
    public void setCity(String city){
      this.city = city;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getTelephone(){
      return telephone;
    }

    /**
     * 设置
     *
     * @param telephone 要设置的
     */
    public void setTelephone(String telephone){
      this.telephone = telephone;
    }

}
