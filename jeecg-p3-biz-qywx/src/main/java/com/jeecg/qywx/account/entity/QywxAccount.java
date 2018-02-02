package com.jeecg.qywx.account.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

/**
 * 描述：</b>QywxAccount:账号信息表<br>
 * 实体定义规则
 * 字段不允许存在基本类型，必须都是包装类型(因为基本类型有默认值)
 * 基本数据类型  包装类 byte Byte boolean Boolean short Short char Character int Integer long Long float Float double  Double 
 * @author Alex
 * @since：2016年03月24日 14时55分37秒 星期四 
 * @version:1.0
 */
public class QywxAccount implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/*创建企业应用管理
	 * 
	 */
	private List<QywxAgent> qywxAccountList;
	/**企业会话secret*/
	private String conversationSecret;
	public List<QywxAgent> getQywxAccountList() {
		return qywxAccountList;
	}
	public void setQywxAccountList(List<QywxAgent> qywxAccountList) {
		this.qywxAccountList = qywxAccountList;
	}
	public String getId() {
	
	public String getConversationSecret() {
		return conversationSecret;
	}
	
	public void setConversationSecret(String conversationSecret) {
		this.conversationSecret = conversationSecret;
	}
}
