package com.himalaya.demo.domain;

import java.math.BigDecimal;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月17日 下午2:53:51
* Description
*/
public class UserDO {
	
	private Long id;
	private String username;
	private String name;
	private int age;
	private BigDecimal balance;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	public String toString(){
		return "id:[" + this.id +"], name:[" + this.name +"], username:[" + this.username +"], balance:["+this.balance+"]";
	}
}