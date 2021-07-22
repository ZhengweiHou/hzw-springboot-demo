package com.houzw.demo.plugin;

import java.util.List;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;

/**
 * mybatis 代码生成插件
 * @author houzw
 *
 */
public class CustomMybatisPlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> warnings) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean clientGenerated(Interface interfaze, IntrospectedTable introspectedTable) {

		return super.clientGenerated(interfaze, introspectedTable);
	}

	@Override
	public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {

		return super.sqlMapGenerated(sqlMap, introspectedTable);
	}
}
