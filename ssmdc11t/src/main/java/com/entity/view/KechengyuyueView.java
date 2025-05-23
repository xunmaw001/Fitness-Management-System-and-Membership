package com.entity.view;

import com.entity.KechengyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-25 11:11:15
 */
@TableName("kechengyuyue")
public class KechengyuyueView  extends KechengyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengyuyueView(){
	}
 
 	public KechengyuyueView(KechengyuyueEntity kechengyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, kechengyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
