package com.rrc.solr.service;

import com.rrc.solr.pojo.SearchResult;

public interface SearchService {

	/**
	 * 索引查询
	 * @Title: search
	 * @Description: <功能详细描述>
	 * @author caoju
	 * @date 2018年3月26日 下午6:42:24 
	 * @param queryString
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 * @see [类、类#方法、类#成员]
	 */
	SearchResult search(String queryString, int page, int rows) throws Exception;
	
}
